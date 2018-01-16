package io.narayana.ochaloup;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class OuterService {

    @EJB InnerService innerService;

    public String outerMethod() {
        try {
            innerService.innerMethod();
            return "success";
        } catch (Throwable e) {
            return "failure";
        }
    }
}