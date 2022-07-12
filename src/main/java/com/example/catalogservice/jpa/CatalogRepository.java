package com.example.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {    //<다룰데이터, key>

    CatalogEntity findByProductId(String productId);
}
