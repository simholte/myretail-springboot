package org.simholte.myretail.service.mongo.boundary;

import org.simholte.myretail.service.boundary.RetailService;
import org.simholte.myretail.service.boundary.org.simholte.myretail.service.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by simholte on 12/13/15.
 */
public interface RetailServiceMongo extends RetailService, MongoRepository<Product, String> {
}
