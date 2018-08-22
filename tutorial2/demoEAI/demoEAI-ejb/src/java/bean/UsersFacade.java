/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author DeltaDivine
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> implements UsersFacadeLocal {

    @PersistenceContext(unitName = "demoEAI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
      @Override
    public boolean checkLogin(String username, String password){
        Query query = em.createNamedQuery("Users.checkLogin");
   query.setParameter("username", username);
   query.setParameter("password", password);
        try {
            query.getSingleResult();
        } catch (Exception e) {
        }
        return false;
    }
}
