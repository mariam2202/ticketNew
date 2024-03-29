package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.model.bean.ticket.*;
import org.example.demo.ticket.model.exception.*;
import org.example.demo.ticket.model.recherche.ticket.*;

import java.util.*;

public interface TicketManager {
    /**
     * Cherche et renvoie le {@link Ticket} numéro {@code pNumero}
     *
     * @param pNumero le numéro du Ticket
     * @return Le {@link Ticket}
     * @throws NotFoundException Si le Ticket n'est pas trouvé
     */
    Ticket getTicket(Long pNumero) throws NotFoundException;

    /**
     * Renvoie la liste des {@link Ticket} correspondants aux critères de recherche.
     *
     * @param pRechercheTicket -
     * @return List
     */
    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);

    /**
     * Renvoie le nombre de {@link Ticket} correspondants aux critères de recherche.
     *
     * @param pRechercheTicket -
     * @return int
     */
    int getCountTicket(RechercheTicket pRechercheTicket);
}
