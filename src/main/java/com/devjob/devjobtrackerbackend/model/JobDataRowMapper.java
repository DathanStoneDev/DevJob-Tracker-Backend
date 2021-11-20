package com.devjob.devjobtrackerbackend.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;

public class JobDataRowMapper implements RowMapper<JobApplicationData> {


    @Override
    public JobApplicationData mapRow(ResultSet rs, int rowNum) throws SQLException {
        JobApplicationData job = new JobApplicationData();
        job.setJobId(rs.getInt("job_id"));
        job.setJobName(rs.getString("job_name"));
        job.setCompanyName(rs.getString("company_name"));
        job.setJobLink(rs.getString("job_link"));
        job.setAppliedDate(rs.getDate("applied_date").toLocalDate().atStartOfDay(ZoneId.systemDefault()));
        job.setAppStatus(JobApplicationData.AppStatus.valueOf(rs.getString("app_status")));

        return job;
    }
}
