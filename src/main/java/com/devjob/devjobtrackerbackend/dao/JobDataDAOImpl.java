package com.devjob.devjobtrackerbackend.dao;

import com.devjob.devjobtrackerbackend.model.JobApplicationData;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class JobDataDAOImpl implements JobDataDAO {

    private final String CREATE_JOB_STATEMENT = "INSERT INTO job_data (job_name, company_name, job_link, applied_date, " +
            "app_status) VALUES (?, ?, ?, ?, ?)";

    private final String UPDATE_JOB_STATEMENT = "UPDATE job_data SET app_status = ? WHERE job_id = ?";

    private final String GET_SINGLE_JOB = "SELECT * FROM job_data WHERE job_id = ?";

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
        int result = jdbcTemplate.update(CREATE_JOB_STATEMENT, job.getJobName(), job.getCompanyName(), job.getJobLink(),
                job.getAppliedDate(), job.getAppStatus().getStatus());
        if(result > 0) {
            System.out.println("New job has been added");
        }
    }

    @Override
    public void update(int id, JobApplicationData.AppStatus status) {

        int result = jdbcTemplate.update(UPDATE_JOB_STATEMENT, status.getStatus(), id);
        if(result > 0) {
            System.out.println("job with the id: " + id + " has been updated with the status of: " + status.getStatus());
        }
    }

    @Override
    public void delete(int jobId) {

    }
}
