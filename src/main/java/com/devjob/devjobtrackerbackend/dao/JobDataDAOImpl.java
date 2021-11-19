package com.devjob.devjobtrackerbackend.dao;

import com.devjob.devjobtrackerbackend.model.JobApplicationData;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobDataDAOImpl implements JobDataDAO {

    private JdbcTemplate jdbcTemplate;

    public JobDataDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<JobApplicationData> list() {
        return null;
    }

    @Override
    public void create(JobApplicationData job) {
        String sql = "insert into job_data (job_name, company_name, job_link, applied_date, waiting_response, got_interview, rejected, received_offer) values (?, ?, ?, ?, ?, ?, ?, ?)";
        int result = jdbcTemplate.update(sql, job.getJobName(), job.getCompanyName(), job.getJobLink(), job.getAppliedDate(), job.isWaitingResponse(), job.isGotInterview(), job.isRejected(), job.isReceivedOffer());
        if(result > 0) {
            System.out.println("New job has been added");
        }
    }

    @Override
    public void update(JobApplicationData job) {

    }

    @Override
    public void delete(int jobId) {

    }
}
