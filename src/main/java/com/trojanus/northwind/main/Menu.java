package com.trojanus.northwind.main;

import com.trojanus.northwind.dao.SuppliersDao;
import com.trojanus.northwind.model.Suppliers;

import java.sql.SQLException;

/**
 * Created by John on 3/26/2017.
 */
public class Menu {

    SuppliersDao suppliersDao = new SuppliersDao();


    //simple test - db connection and entity creation
    public void start() throws SQLException {

        String company = "Hyhyhycom";
        String firstName = "Adam";
        String lastName = "Pietruszka";
        String email = "apietruszka@gmail.com";
        String jobTitle = "CEO";
        String businessPhone = "";
        String homePhone = "";
        String mobilePhone = "";
        String faxNumber = "";
        String address = "";
        String city = "Pacanów";
        String stateProvince = "";
        String zipPostalCode = "";
        String countryRegion = "";
        String webPage = "";
        String notes = "brak";
        byte[] attachments = {};

        Suppliers suppliers = new Suppliers(company, firstName, lastName, email, jobTitle,
                businessPhone, homePhone, mobilePhone, faxNumber,
                address, city, stateProvince, zipPostalCode, countryRegion,
                webPage, notes, attachments);

        suppliersDao.saveSuppliers(suppliers);

    }
}
