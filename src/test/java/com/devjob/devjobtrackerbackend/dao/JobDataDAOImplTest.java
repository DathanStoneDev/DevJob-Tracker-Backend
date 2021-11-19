package com.devjob.devjobtrackerbackend.dao;

import com.devjob.devjobtrackerbackend.model.JobApplicationData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import java.time.ZonedDateTime;
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
    void ShouldCreateJob() {
        JobApplicationData job = new JobApplicationData("Software Developer", "First Job Company",
                "www.myfirstsoftwarejob.com", ZonedDateTime.now(), true, false,
                false, false);
        dao.create(job);
        assertEquals("Software Developer", job.getJobName());
        assertEquals("First Job Company", job.getCompanyName());
        assertEquals("www.myfirstsoftwarejob.com", job.getJobLink());
        assertEquals(true, job.isWaitingResponse());
        assertEquals(false, job.isGotInterview());
        assertEquals(false, job.isRejected());
        assertEquals(false, job.isReceivedOffer());
    }
}