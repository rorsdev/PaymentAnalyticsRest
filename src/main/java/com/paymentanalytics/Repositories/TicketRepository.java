package com.paymentanalytics.Repositories;

import com.paymentanalytics.classes.cTicket;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<cTicket, UUID> {
}
