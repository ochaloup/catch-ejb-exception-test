package io.narayana.ochaloup;

import java.util.Random;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class InnerService {

    @PersistenceContext EntityManager em;

    public void innerMethod() {
    	Entity e = new Entity();
    	e.setName("entity:" + new Random().nextInt(1000) + 1);
        em.persist(e);
        em.flush();
    } //put the breakpoint here
}