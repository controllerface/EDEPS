package com.controllerface.cmdr_j.classes.core;

import com.controllerface.cmdr_j.utilities.UIFunctions;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.HttpServlet;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class JournalServer
{
    private Server server;
    private HttpServlet servlet;
    public int port = 0;

    private ServletContextHandler createHandler()
    {
        if (this.servlet != null)
        {
            return this.createHttpAppHandler(this.servlet);
        }
        else
        {
            throw new IllegalStateException("Servlet is null");
        }
    }

    private ServletContextHandler createHttpAppHandler(HttpServlet servlet)
    {
        ServletContextHandler context = new ServletContextHandler();
        var servletHolder = new ServletHolder(servlet);
        servletHolder.getRegistration()
            .setMultipartConfig(new MultipartConfigElement(UIFunctions.DATA_FOLDER + "/tmp"));
        context.addServlet(servletHolder, "/*");
        return context;
    }

    public static JournalServer withServlet(HttpServlet servlet)
    {
        JournalServer server = new JournalServer();
        server.servlet = servlet;
        return server;
    }

    public JournalServer port(int port)
    {
        this.port = port;
        return this;
    }

    public JournalServer start()
    {
        this.server = new Server(this.port);
        this.server.setHandler(createHandler());
        try
        {
            server.start();
        }
        catch (Exception e)
        {
            // todo: log an error: unable to start server
            return this;
        }

        this.port = getPort(this.server);

        System.out.println("Server Listening: " + getUrl());

        return this;
    }

    public URL getUrl()
    {
        try
        {
            return new URL("http", "localhost", this.port, "/");
        }
        catch (MalformedURLException urlException)
        {
            throw new RuntimeException("Unexpected Malformed URL Error", urlException);
        }
    }

    public static int getPort(Server server)
    {
        return Arrays.stream(server.getConnectors())
            .filter((connector) -> connector instanceof ServerConnector)
            .findFirst()
            .map((connector) -> ((ServerConnector) connector).getLocalPort())
            .orElseThrow(() -> new IllegalStateException("No Port Defined"));
    }

    public void join()
    {
        try
        {
            this.server.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    public void close()
    {
        try
        {
            this.server.stop();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        this.server.destroy();
    }
}
