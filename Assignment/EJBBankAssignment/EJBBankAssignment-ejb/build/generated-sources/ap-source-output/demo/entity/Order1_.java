package demo.entity;

import demo.entity.User1;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-21T15:45:32")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Integer> feeorder;
    public static volatile SingularAttribute<Order1, Integer> codeorder;
    public static volatile SingularAttribute<Order1, Boolean> codecustomer;
    public static volatile SingularAttribute<Order1, String> nameorder;
    public static volatile SingularAttribute<Order1, User1> codeuser;
    public static volatile SingularAttribute<Order1, Double> dateorder;
    public static volatile SingularAttribute<Order1, Integer> moneyorder;

}