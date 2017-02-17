package org.codegreen.app.movie.core;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

/**
 * Main class which starts the movie service
 *
 * @author mishra.ashish@icloud.com
 *
 */
public class Main {

    //TODO - read the port from properties file
    public static final String BASE_URI = "http://localhost:8090";

    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this app
     *
     * @return Grizzly HTTP server.
     */
    public static HttpServer startWebServer() {

        final ResourceConfig rc = new ResourceConfig().packages("org.codegreen.app.movie");

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    /**
     * starting point for movie service
     * @param args
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {

        final HttpServer webServer = startWebServer();

        if (webServer.isStarted()) {
            System.out.println(String.format("Movie service started at " + BASE_URI + "/movieservice"
                    + "\nHit <enter> to stop it...", BASE_URI));
        }

        System.in.read();

        webServer.shutdownNow();
        System.out.println("Movie Service is STOPPED !");

    }

}