package com.trojanus.northwind.dao;

import com.trojanus.northwind.config.DatabaseConfig;
import com.trojanus.northwind.config.HibernateUtil;
import com.trojanus.northwind.model.Suppliers;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by John on 3/27/2017.
 */
public class SuppliersDao {
    private DatabaseConfig dbconfig = new DatabaseConfig();

    public void saveSuppliers(Suppliers suppliers) {
        Session session = HibernateUtil.getSession();
        session.save(suppliers);
        session.close();
    }

    public List<Suppliers> findAll() {
        Session session = HibernateUtil.getSession();
        List<Suppliers> list = session
                .createQuery("select s from Suppliers s", Suppliers.class)
                .getResultList();
        session.close();
        return list;
    }

    public void removeSuppliers(int id) {
        Session session = HibernateUtil.getSession();
        session.remove(find(id));
        session.close();
    }

    public Suppliers find(int id) {
        Session session = HibernateUtil.getSession();
        Suppliers suppliers = session.find(Suppliers.class, id);
        session.close();
        return suppliers;
    }
}
