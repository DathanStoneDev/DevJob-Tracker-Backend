package com.devjob.devjobtrackerbackend;

import com.devjob.devjobtrackerbackend.dao.StatsDataDAO;
import com.devjob.devjobtrackerbackend.dao.StatsDataDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DevJobTrackerBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(DevJobTrackerBackendApplication.class, args);

    }

}
