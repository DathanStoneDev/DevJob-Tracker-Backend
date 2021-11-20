package com.devjob.devjobtrackerbackend.model;

import java.time.ZonedDateTime;

public class JobApplicationData {

    public enum AppStatus {

        AWAITING_RESPONSE ("Awaiting Offer"),
        INTERVIEW("Landed Interview"),
        REJECTION("Rejected"),
        OFFER("Offer Extended");

        private final String  status;

        AppStatus(String status) {
            this.status = status;
        }

        public String getStatus(){
            return status;
        }
    }

    private int jobId;
    private String jobName;
    private String companyName;
    private String jobLink;
    private ZonedDateTime appliedDate;
    private AppStatus appStatus;


    public JobApplicationData(String jobName, String companyName, String jobLink, ZonedDateTime appliedDate, AppStatus appStatus) {
        this.jobName = jobName;
        this.companyName = companyName;
        this.jobLink = jobLink;
        this.appliedDate = appliedDate;
        this.appStatus = appStatus;
    }

    public JobApplicationData() {

    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    public ZonedDateTime getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(ZonedDateTime appliedDate) {
        this.appliedDate = appliedDate;
    }

    public AppStatus getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(AppStatus appStatus) {
        this.appStatus = appStatus;
    }
}
