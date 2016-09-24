package com.xyw55.springMVC;


import org.eclipse.jetty.annotations.ServletContainerInitializersStarter;
import org.eclipse.jetty.apache.jsp.JettyJasperInitializer;
import org.eclipse.jetty.plus.annotation.ContainerInitializer;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.NetworkTrafficServerConnector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiayiwei on 16/9/24.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        Connector connector = new NetworkTrafficServerConnector(server);
        server.addConnector(connector);
        //
        WebAppContext context = new WebAppContext("/Users/xiayiwei/code/demos/SpringDemo/springweb/src/main/webapp", "");
        context.setClassLoader(Thread.currentThread().getContextClassLoader());
        context.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern",".*/[^/]*jstl.*\\.jar$");
        context.setAttribute("org.eclipse.jetty.containerInitializers", jspInitializers());
        context.addBean(new ServletContainerInitializersStarter(context), true);
        context.setConfigurationClasses(new String[] {
                "org.eclipse.jetty.webapp.WebInfConfiguration",
                "org.eclipse.jetty.plus.webapp.EnvConfiguration",
                "org.eclipse.jetty.plus.webapp.PlusConfiguration",
                "org.eclipse.jetty.webapp.WebXmlConfiguration",
                "org.eclipse.jetty.annotations.AnnotationConfiguration"});

        server.setHandler(context);
        server.setStopAtShutdown(true);
        server.start();
        server.join();
    }
    private static List<ContainerInitializer> jspInitializers() {
        JettyJasperInitializer sci = new JettyJasperInitializer();
        ContainerInitializer initializer = new ContainerInitializer(sci, null);
        List<ContainerInitializer> initializers = new ArrayList<ContainerInitializer>();
        initializers.add(initializer);
        return initializers;
    }
}
