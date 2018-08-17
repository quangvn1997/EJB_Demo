/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.bean;

import demo.entities.Account;
import javax.ejb.Local;

/**
 *
 * @author quang
 */
@Local
public interface AccountFacedeLocal {
    
    public Account CheckAccount(int id);
    public String Payment(int id,double total);
    
}
