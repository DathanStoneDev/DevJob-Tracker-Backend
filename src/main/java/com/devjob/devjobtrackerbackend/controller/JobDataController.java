package com.devjob.devjobtrackerbackend.controller;

import com.devjob.devjobtrackerbackend.dao.JobDataDAO;
import com.devjob.devjobtrackerbackend.model.JobApplicationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class JobDataController {

    @Autowired
    JobDataDAO jobDataDAO;

    @GetMapping("/jobs")
    public List<JobApplicationData> getAllJobs(){
        return jobDataDAO.list();
    }

    @PostMapping("/jobs/add-job")
    public void addJob(@RequestBody JobApplicationData job) {
        jobDataDAO.create(job);
    }

    @PutMapping("/job/update-status/{jobId}/{appStatus}")
    public void updateJob(@PathVariable int jobId, @PathVariable JobApplicationData.AppStatus appStatus) {
        jobDataDAO.update(jobId, appStatus);
    }

    @DeleteMapping("/job/delete/{jobId}")
    public void deleteJob(@PathVariable int jobId) {
        jobDataDAO.delete(jobId);
    }


}
