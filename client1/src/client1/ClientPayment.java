/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

import demo.NewWebService;
import demo.NewWebService_Service;

/**
 *
 * @author quang
 */
public class ClientPayment {

    public static void main(String[] args) {
        NewWebService_Service payall = new NewWebService_Service();
        NewWebService pay = payall.getNewWebServicePort();
        String status = pay.payment(1, 300);
        System.out.println(status);
    }

}
