package org.example.demo.ticket.business.contract.manager;

public interface ManagerFactory {
    TicketManager getTicketManager();

    void setTicketManager(TicketManager ticketManager);

    // On renvoie désormais simplement l'attribut projetManager
    ProjetManager getProjetManager();

    // Ajout d'un setter pour l'attribut projetManager
    void setProjetManager(ProjetManager pProjetManager);
}
