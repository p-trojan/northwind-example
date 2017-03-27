package com.trojanus.northwind.main;

import java.sql.SQLException;

/**
 * Created by John on 3/26/2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.start();
    }
}
