package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.*;

import javax.inject.*;

@Named
public class ManagerFactoryImpl implements ManagerFactory{

    // Ajout d'un attribut projetManager
    @Inject
    private ProjetManager projetManager;

    @Inject
    private TicketManager ticketManager;

    @Override
    public TicketManager getTicketManager() {
        return ticketManager;
    }

    @Override
    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    // On renvoie désormais simplement l'attribut projetManager
    @Override
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    // Ajout d'un setter pour l'attribut projetManager
    @Override
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }
}
