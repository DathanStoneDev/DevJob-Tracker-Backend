package com.devjob.devjobtrackerbackend.model;

import java.time.LocalDateTime;


public class JobApplicationData {

    public enum AppStatus {

        AWAITING_RESPONSE ("Awaiting Offer"),
        INTERVIEW("Landed Interview"),
        REJECTION("Rejected"),
        OFFER("Offer Extended");

        private final String status;

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
    private LocalDateTime appliedDate;
    private AppStatus appStatus;


    public JobApplicationData(String jobName, String companyName, String jobLink, LocalDateTime appliedDate, AppStatus appStatus) {
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

    public LocalDateTime getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDateTime appliedDate) {
        this.appliedDate = appliedDate;
    }

    public AppStatus getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(AppStatus appStatus) {
        this.appStatus = appStatus;
    }

    @Override
    public String toString() {
        return "JobApplicationData{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobLink='" + jobLink + '\'' +
                ", appliedDate=" + appliedDate +
                ", appStatus=" + appStatus +
                '}';
    }
}
