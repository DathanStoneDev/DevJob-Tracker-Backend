package com.devjob.devjobtrackerbackend.dao;

import com.devjob.devjobtrackerbackend.model.StatsData;
import com.devjob.devjobtrackerbackend.model.StatsDataWrapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StatsDataDAOImpl implements StatsDataDAO{

    private JdbcTemplate jdbcTemplate;

    public StatsDataDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final String GET_STATUS_COUNTS = "SELECT  COUNT(*) AS TOTAL, " +
            "SUM(app_status = 'AWAITING_RESPONSE') AS AWAITING,  " +
            "SUM(app_status = 'INTERVIEW') AS INTERVIEW, " +
            "SUM(app_status = 'OFFER') AS OFFER, " +
            "SUM(app_status = 'REJECTION') AS REJECTION " +
            "FROM job_data;";


    @Override
    public StatsData getStatsData() {
        return jdbcTemplate.queryForObject(GET_STATUS_COUNTS, new StatsDataWrapper());
    }
}
