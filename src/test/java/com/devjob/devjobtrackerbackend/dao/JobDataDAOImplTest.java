package com.devjob.devjobtrackerbackend.dao;

import com.devjob.devjobtrackerbackend.model.JobApplicationData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import java.time.ZonedDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJdbcTest
class JobDataDAOImplTest {

    private JobDataDAO dao;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JobDataDAOImplTest(JdbcTemplate jdbcTemplate) {
        dao = new JobDataDAOImpl(jdbcTemplate);
        this.jdbcTemplate = jdbcTemplate;
    }

    @Test
    void shouldCreateJob() {
        JobApplicationData job = new JobApplicationData("Software Developer", "First Job Company",
                "www.myfirstsoftwarejob.com", ZonedDateTime.now(), JobApplicationData.AppStatus.OFFER);
        dao.create(job);
        assertEquals("Software Developer", job.getJobName());
        assertEquals("First Job Company", job.getCompanyName());
        assertEquals("www.myfirstsoftwarejob.com", job.getJobLink());
    }

    @Test
    void shouldUpdateJob () {
        int id = 4;
        JobApplicationData.AppStatus status = JobApplicationData.AppStatus.INTERVIEW;
        dao.update(id, status);
        System.out.println(dao.getJob(id).getAppStatus().toString());

    }

    @Test
    void shouldDelete() {

        int id = 4;
        dao.delete(id);
    }

    @Test
    void shouldGetJob() {

        int id = 4;
        JobApplicationData job = dao.getJob(id);
        System.out.println(job.toString());

    }

    @Test
    void shouldGetlist() {
        List<JobApplicationData> jobList = dao.list();
        for(JobApplicationData j : jobList) {
            System.out.println(j.toString());
        }
        assertEquals(1, jobList.size());

    }
}