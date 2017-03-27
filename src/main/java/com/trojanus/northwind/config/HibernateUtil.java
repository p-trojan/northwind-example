package com.trojanus.northwind.config;

import com.trojanus.northwind.model.PurchaseOrderStatus;
import com.trojanus.northwind.model.PurchaseOrders;
import com.trojanus.northwind.model.Suppliers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by trojanus on 3/23/2017.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        Configuration config = new Configuration();
        config.addAnnotatedClass(Suppliers.class);
        config.addAnnotatedClass(PurchaseOrders.class);
        config.addAnnotatedClass(PurchaseOrderStatus.class);
        return config.buildSessionFactory();
    }


    public static Session getSession() {
        return sessionFactory.openSession();
    }


    public static void closeSessionFactory() {
        sessionFactory.close();
    }
}
