package org.example;


import org.example.persistence.EmployeeDAO;
import org.flywaydb.core.Flyway;

public class Main {

    private final static EmployeeDAO employeeDAO = new EmployeeDAO();

    public static void main(String[] args) {
        var flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/jdbc-sample", "root", "root").
                load();
        flyway.migrate();
    }
}