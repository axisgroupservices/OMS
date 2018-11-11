package org.axisgroupservice.springboot.repositories;

import org.axisgroupservice.springboot.model.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "details", rel = "details")
public interface DetailsRepository extends CrudRepository<Details, Long>{

}
