package ru.vtarasov.graal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author vtarasov
 * @since 25.09.2019
 */
public class Application {
    public static void main(String[] args) throws Exception {
        String conString = args[0];
        String user = args[1];
        String pwd = args[2];
        try (Connection con = DriverManager.getConnection(conString, user, pwd)) {
            System.out.println("Connection is opened: " + !con.isClosed());
        }
    }
}
