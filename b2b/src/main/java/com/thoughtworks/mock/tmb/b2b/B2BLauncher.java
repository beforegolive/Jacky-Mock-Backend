package com.thoughtworks.mock.tmb.b2b;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class B2BLauncher {
    public static void main(String args[]) throws Exception{
        Server server = new Server(9527);

        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setResourceBase("./b2b/src/main/webapp");

        server.setHandler(webapp);
        server.start();
        server.join();
    }
}
