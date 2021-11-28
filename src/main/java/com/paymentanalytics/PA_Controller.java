package com.paymentanalytics;

import com.paymentanalytics.classes.cProduct;
import com.paymentanalytics.classes.cTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class PA_Controller {

    @Autowired
    private PA_Service paService;

    //Tickets
    @PostMapping("/ticket")
    public void createTicket(@RequestBody cTicket ticket) {
        paService.addTicket(ticket);
    }

    @RequestMapping("/ticket/{id}")
    public @ResponseBody Optional<cTicket> getTicket(@PathVariable("id") UUID id) {
        return paService.getTicket(id);
    }

    @DeleteMapping("/ticket/{id}")
    public void deleteTicket(@PathVariable("id") UUID id) {
        paService.deleteTicket(id);
    }

    @RequestMapping("/ticket")
    public @ResponseBody Iterable<cTicket> getAllTickets() {
        return paService.getAllTickets();
    }


    //Products
    @PostMapping("/product")
    public void createProduct(@RequestBody cProduct product) {
        paService.addProduct(product);
    }

    @RequestMapping("/product/{id}")
    public @ResponseBody Optional<cProduct> getProduct(@PathVariable("id") UUID id) {
        return paService.getProduct(id);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") UUID id) {
        paService.deleteProduct(id);
    }

    @RequestMapping("/product")
    public @ResponseBody Iterable<cProduct> getAllProducts() {
        return paService.getAllProducts();
    }




}
