package com.paymentanalytics.Repositories;

import com.paymentanalytics.classes.cProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<cProduct, UUID> {
}
