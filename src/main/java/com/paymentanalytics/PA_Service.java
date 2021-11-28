package com.paymentanalytics;

import com.paymentanalytics.Repositories.ProductRepository;
import com.paymentanalytics.Repositories.TicketRepository;
import com.paymentanalytics.classes.cProduct;
import com.paymentanalytics.classes.cTicket;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PA_Service {

    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private ProductRepository productRepository;

    //Ticket Services
    public void addTicket(cTicket ticket) {
        ticketRepository.save(ticket);
    }

    public Optional<cTicket> getTicket(UUID id) {
        return ticketRepository.findById(id);
    }

    public void deleteTicket(UUID id) {
        ticketRepository.deleteById(id);
    }

    public Iterable<cTicket> getAllTickets() {
        return ticketRepository.findAll();
    }

    //Product Services
    public void addProduct(cProduct product) {
        productRepository.save(product);
    }

    public Optional<cProduct> getProduct(UUID id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

    public Iterable<cProduct> getAllProducts() {
        return productRepository.findAll();
    }




}
