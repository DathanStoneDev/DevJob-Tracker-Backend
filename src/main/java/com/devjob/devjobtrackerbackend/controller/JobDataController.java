package com.devjob.devjobtrackerbackend.controller;

import com.devjob.devjobtrackerbackend.dao.JobDataDAO;
import com.devjob.devjobtrackerbackend.exception.MissingDataException;
import com.devjob.devjobtrackerbackend.model.JobApplicationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/jobs")
@CrossOrigin
public class JobDataController {

    @Autowired
    JobDataDAO jobDataDAO;

    @GetMapping("/")
    public ResponseEntity<List<JobApplicationData>> getAllJobs(){
        List<JobApplicationData> jobs = jobDataDAO.list();
        return new ResponseEntity<>(jobs, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{jobId}")
    public ResponseEntity<JobApplicationData> getJob(@PathVariable ("jobId") int id) {
        try {
            JobApplicationData job = jobDataDAO.getJob(id);
            return new ResponseEntity<>(job, HttpStatus.ACCEPTED);
        } catch (EmptyResultDataAccessException e) {
            throw new MissingDataException("No Data associated with that ID. Please check the ID.");
        }
    }

    @PostMapping("/add-job")
    public void addJob(@RequestBody JobApplicationData job) {
        jobDataDAO.create(job);
    }

    @PutMapping("/update-status")
    public void updateJob(@RequestBody JobApplicationData job) {
        jobDataDAO.update(job);
    }

    @DeleteMapping("/delete/{jobId}")
    public void deleteJob(@PathVariable int jobId) {
        jobDataDAO.delete(jobId);
    }


}
