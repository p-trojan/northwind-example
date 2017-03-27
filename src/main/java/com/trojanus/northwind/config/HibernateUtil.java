package com.trojanus.northwind.config;

import com.trojanus.northwind.model.*;
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
        config.addAnnotatedClass(Customers.class);
        config.addAnnotatedClass(EmployeePrivileges.class);
        config.addAnnotatedClass(Employees.class);
        config.addAnnotatedClass(InventoryTransactions.class);
        config.addAnnotatedClass(InventoryTransactionTypes.class);
        config.addAnnotatedClass(Invoices.class);
        config.addAnnotatedClass(OrderDetails.class);
        config.addAnnotatedClass(OrderDetailsStatus.class);
        config.addAnnotatedClass(Orders.class);
        config.addAnnotatedClass(OrderStatus.class);
        config.addAnnotatedClass(OrderTaxStatus.class);
        config.addAnnotatedClass(Privileges.class);
        config.addAnnotatedClass(Products.class);
        config.addAnnotatedClass(PurchaseOrderDetails.class);
        config.addAnnotatedClass(PurchaseOrders.class);
        config.addAnnotatedClass(PurchaseOrderStatus.class);
        config.addAnnotatedClass(Shippers.class);
        config.addAnnotatedClass(Suppliers.class);
        return config.buildSessionFactory();
    }


    public static Session getSession() {
        return sessionFactory.openSession();
    }


    public static void closeSessionFactory() {
        sessionFactory.close();
    }
}
