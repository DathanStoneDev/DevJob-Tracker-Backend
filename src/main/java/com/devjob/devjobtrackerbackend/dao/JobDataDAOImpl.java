package com.devjob.devjobtrackerbackend.dao;

import com.devjob.devjobtrackerbackend.model.JobApplicationData;
import com.devjob.devjobtrackerbackend.model.JobDataRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobDataDAOImpl implements JobDataDAO {

    private final String CREATE_JOB_STATEMENT = "INSERT INTO job_data (job_name, company_name, job_link, applied_date, " +
            "app_status) VALUES (?, ?, ?, ?, ?)";
    private final String UPDATE_JOB_STATEMENT = "UPDATE job_data SET app_status = ? WHERE job_id = ?";
    private final String GET_SINGLE_JOB = "SELECT * FROM job_data WHERE job_id = ?";
    private final String DELETE_A_JOB = "DELETE FROM job_data WHERE job_id = ?";
    private final String GET_ALL_JOBS = "SELECT * FROM job_data";

    private JdbcTemplate jdbcTemplate;

    public JobDataDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<JobApplicationData> list() {
        return jdbcTemplate.query(GET_ALL_JOBS, new JobDataRowMapper());
    }

    @Override
    public JobApplicationData getJob(int id) {
        return jdbcTemplate.queryForObject(GET_SINGLE_JOB, new JobDataRowMapper(), id);
    }

    @Override
    public void create(JobApplicationData job) {
        int result = jdbcTemplate.update(CREATE_JOB_STATEMENT, job.getJobName(), job.getCompanyName(), job.getJobLink(),
                job.getAppliedDate(), job.getAppStatus().toString());
        if(result > 0) {
            System.out.println("New job has been added");
        }
    }

    @Override
    public void update(JobApplicationData job) {
        jdbcTemplate.update(UPDATE_JOB_STATEMENT, job.getAppStatus().toString(), job.getJobId());
    }

    @Override
    public void delete(int jobId) {
        jdbcTemplate.update(DELETE_A_JOB, jobId);
        System.out.println("Deleted the record");
    }
}
