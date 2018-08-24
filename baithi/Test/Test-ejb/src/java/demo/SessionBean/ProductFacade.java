/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.SessionBean;

import demo.entity.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author quang
 */
@Stateless
public class ProductFacade extends AbstractFacade<Product> implements ProductFacadeLocal {

    @PersistenceContext(unitName = "Test-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }

    @Override
    public boolean sellProduct(int productId, int quantity) {
        if (checkProduct(productId)!=null) {
            Product pr = checkProduct(productId);
            int qty =(int) (pr.getQuantity().intValue() - quantity);
            pr.setQuantity(qty);
            return true;
            
        }
        return false;
    }

    @Override
    public Product checkProduct(int id) {
        Query query = em.createNamedQuery("Product.findById");
         query.setParameter("id", id);
         try {
            return (Product)query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
}
