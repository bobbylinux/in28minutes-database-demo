package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.bean.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);
    @Autowired
    PersonJdbcDAO personJdbcDAO;

    public static void main(String[] args) {

        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", personJdbcDAO.findAll());
        logger.info("users id 10001 -> {}", personJdbcDAO.findById(10001));
        logger.info("deleting 10002 -> number of rows deleted {}", personJdbcDAO.deleteById(10002));
        logger.info("inserting 10005 -> {}", personJdbcDAO.insert(new Person(10005, "Riccardo Ricci", "Venezia", new Date())));
        logger.info("updating 10003 ->  {}", personJdbcDAO.update(new Person(10003, "Francesco Neri", "Torino", new Date())));
    }
}
