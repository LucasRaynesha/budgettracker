package org.perscholas.budgettracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BudgetTrackerApplication {

    public static void main(String[] args) {

        SpringApplication.run(BudgetTrackerApplication.class, args);
    }

}
