//package org.example.demo.ticket.webapp.listener;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//
//import org.example.demo.ticket.business.ManagerFactory;
////import org.example.demo.ticket.business.impl.*;
//import org.example.demo.ticket.business.impl.manager.*;
//import org.example.demo.ticket.webapp.rest.resource.AbstractResource;
//
//
//public class DependencyInjectionListener implements ServletContextListener {
//
//    @Override
//    public void contextInitialized(ServletContextEvent pServletContextEvent) {
//        ManagerFactory vManagerFactory = new ManagerFactory();
//        // On ajoute l'injection des Managers dans la ManagerFactory
//        vManagerFactory.setProjetManager(new ProjetManagerImpl());
//        vManagerFactory.setTicketManager(new TicketManagerImpl());
//        //...
//        AbstractResource.setManagerFactory(vManagerFactory);
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent pServletContextEvent) {
//        // NOP
//    }
//}