package org.axisgroupservice.springboot.repositories;

import org.axisgroupservice.springboot.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "book")
public interface BookRepository extends CrudRepository<Book, Long> {

   
}
