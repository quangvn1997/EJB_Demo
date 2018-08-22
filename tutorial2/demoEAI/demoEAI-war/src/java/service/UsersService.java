/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.UsersFacadeLocal;
import entity.Users;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author DeltaDivine
 */
@WebService(serviceName = "UsersService")
public class UsersService {

    @EJB
    private UsersFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "users") Users users) {
        ejbRef.create(users);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "users") Users users) {
        ejbRef.edit(users);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "users") Users users) {
        ejbRef.remove(users);
    }

    @WebMethod(operationName = "find")
    public Users find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Users> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Users> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "checkLogin")
    public boolean checkLogin(@WebParam(name = "name") String name, @WebParam(name = "password") String password) {
        return ejbRef.checkLogin(name, password);
    }
    
}
