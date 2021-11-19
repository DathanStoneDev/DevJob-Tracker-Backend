package com.devjob.devjobtrackerbackend.model;

import java.time.ZonedDateTime;

public class JobApplicationData {

    private int jobId;
    private String jobName;
    private String companyName;
    private String jobLink;
    private ZonedDateTime appliedDate;
    private boolean waitingResponse;
    private boolean gotInterview;
    private boolean rejected;
    private boolean receivedOffer;

    public JobApplicationData(String jobName, String companyName, String jobLink, ZonedDateTime appliedDate, boolean waitingResponse, boolean gotInterview, boolean rejected, boolean receivedOffer) {
        this.jobName = jobName;
        this.companyName = companyName;
        this.jobLink = jobLink;
        this.appliedDate = appliedDate;
        this.waitingResponse = waitingResponse;
        this.gotInterview = gotInterview;
        this.rejected = rejected;
        this.receivedOffer = receivedOffer;
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

    public ZonedDateTime getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(ZonedDateTime appliedDate) {
        this.appliedDate = appliedDate;
    }

    public boolean isWaitingResponse() {
        return waitingResponse;
    }

    public void setWaitingResponse(boolean waitingResponse) {
        this.waitingResponse = waitingResponse;
    }

    public boolean isGotInterview() {
        return gotInterview;
    }

    public void setGotInterview(boolean gotInterview) {
        this.gotInterview = gotInterview;
    }

    public boolean isRejected() {
        return rejected;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }

    public boolean isReceivedOffer() {
        return receivedOffer;
    }

    public void setReceivedOffer(boolean receivedOffer) {
        this.receivedOffer = receivedOffer;
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

    @Override
    public String toString() {
        return "JobApplicationData{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", appliedDate=" + appliedDate +
                ", waitingResponse=" + waitingResponse +
                ", gotInterview=" + gotInterview +
                ", rejected=" + rejected +
                ", receivedOffer=" + receivedOffer +
                '}';
    }
}
