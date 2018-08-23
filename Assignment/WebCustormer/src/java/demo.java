
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.xml.registry.infomodel.User;
import service.Order1;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quang
 */
public class demo {
    public static void main(String[] args) {
//        Order1 order1 = new Order1();
//        order1.setCodeorder(100);
//        order1.setCodecustomer(1112);
//        order1.setCodeuser(1113);
//        order1.setFeeorder(10000);
//        order1.setMoneyorder(100000);
//        order1.setNameorder("chuyen tien");
//        //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//        
//       // int date = (int)System.currentTimeMillis();
//         Date date = new Date();
//        Timestamp ts = new Timestamp(date.getTime());
//        order1.setDateorder(ts);
//        create(order1);
//        ArrayList<Order1> list;
//        DateFormat format = new SimpleDateFormat(); 
//              
//          //  System.out.println(formatter.format(date));  
//        list = (ArrayList<Order1>) getListOrderbyUser(1114,"2018-08-21 00:00:00","2018-08-22 18:47:08.268");
//        if(list.isEmpty()){
//            System.out.println("nothing");
//        }else{
//             System.out.println(list.get(0));
//        }
String text = "2011-10-02 18:48:05.123";
Timestamp  ts = Timestamp.valueOf(text);
System.out.println(ts);
       

        
    }



    private static void editUser(services.User1 user) {
        services.UserWebService_Service service = new services.UserWebService_Service();
        services.UserWebService port = service.getUserWebServicePort();
        port.editUser(user);
    }

    private static void create(service.Order1 order1) {
        service.OrderWebService_Service service = new service.OrderWebService_Service();
        service.OrderWebService port = service.getOrderWebServicePort();
        port.create(order1);
    }

    private static java.util.List<service.Order1> getListOrderbyUser(int codeUser, String start, String end) {
        service.OrderWebService_Service service = new service.OrderWebService_Service();
        service.OrderWebService port = service.getOrderWebServicePort();
        return port.getListOrderbyUser(codeUser, start, end);
    }
    
   

 
}
