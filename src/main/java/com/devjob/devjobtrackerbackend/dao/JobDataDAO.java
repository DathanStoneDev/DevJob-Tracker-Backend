package com.devjob.devjobtrackerbackend.dao;

import com.devjob.devjobtrackerbackend.model.JobApplicationData;

import java.util.List;

public interface JobDataDAO {

    List<JobApplicationData> list();

    JobApplicationData getJob(int id);

    void create(JobApplicationData job);

    void update(JobApplicationData job);

    void delete (int id);

}
