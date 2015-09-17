package org.wildfly.poc.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MyDao {

   @PersistenceContext(unitName = "my-persistence-unit")
   private EntityManager entityManager;

   public EntityManager getEntityManager() {
      return entityManager;
   }
}
