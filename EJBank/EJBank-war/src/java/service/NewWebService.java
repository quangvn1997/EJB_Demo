/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import demo.bean.AccountFacedeLocal;
import demo.entities.Account;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author quang
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    @EJB
    private AccountFacedeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "CheckAccount")
    public Account CheckAccount(@WebParam(name = "id") int id) {
        return ejbRef.CheckAccount(id);
    }

    @WebMethod(operationName = "Payment")
    public String Payment(@WebParam(name = "id") int id, @WebParam(name = "total") double total) {
        return ejbRef.Payment(id, total);
    }
    
}
