/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.bean;

import demo.entities.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author quang
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacedeLocal{

    @PersistenceContext(unitName = "EJBank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }

    @Override
    public Account CheckAccount(int id) {
         Query query = em.createNamedQuery("Account.findByAccountid");
         query.setParameter("accountid", id);
         try {
            return (Account)query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    };

    @Override
    public String Payment(int id, double total) {
        if (CheckAccount(id)!=null) {
            Account acc = CheckAccount(id);
            int pay =(int) (acc.getBalance().intValue() - total);
            acc.setBalance(pay);
            
            return "Customer"+  acc.getAccountname()+" pay Succesfull: your balance now is "
                    + acc.getBalance().toString();
            
        }
        return "payment fail";
 //To change body of generated methods, choose Tools | Templates.
    }
    
}
