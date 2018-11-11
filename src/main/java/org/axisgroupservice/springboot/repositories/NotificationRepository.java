package org.axisgroupservice.springboot.repositories;

import org.axisgroupservice.springboot.model.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "notification", rel = "notification")
public interface NotificationRepository extends CrudRepository<Notification, Long>{

}
