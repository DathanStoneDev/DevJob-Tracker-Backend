package com.devjob.devjobtrackerbackend.controller;

import com.devjob.devjobtrackerbackend.dao.StatsDataDAO;
import com.devjob.devjobtrackerbackend.model.StatsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/stats")
public class StatsDataController {

    @Autowired
    StatsDataDAO statsDataDAO;

    @GetMapping("/")
    public ResponseEntity<StatsData> getStats() {
        StatsData stats = statsDataDAO.getStatsData();
        return new ResponseEntity<>(stats, HttpStatus.ACCEPTED);
    }

}
