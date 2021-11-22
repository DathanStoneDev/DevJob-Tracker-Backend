package com.devjob.devjobtrackerbackend.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StatsDataWrapper implements RowMapper<StatsData> {

    @Override
    public StatsData mapRow(ResultSet rs, int rowNum) throws SQLException {
        StatsData stats = new StatsData();
        stats.setTotalJobs(rs.getInt("TOTAL"));
        stats.setAwaitingCount(rs.getInt("AWAITING"));
        stats.setInterviewCount(rs.getInt("INTERVIEW"));
        stats.setRejectionCount(rs.getInt("REJECTION"));
        stats.setOfferCount(rs.getInt("OFFER"));
        return stats;
    }
}
