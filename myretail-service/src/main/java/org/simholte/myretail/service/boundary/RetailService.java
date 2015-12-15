package org.simholte.myretail.service.boundary;

import org.simholte.myretail.service.boundary.org.simholte.myretail.service.entity.Product;

/**
 * Created by simholte on 12/13/15.
 */
public interface RetailService {

    public Product getProductByName(String name);

}
