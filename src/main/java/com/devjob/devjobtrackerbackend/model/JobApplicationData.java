package com.devjob.devjobtrackerbackend.model;

import java.time.ZonedDateTime;

public class JobApplicationData {

    private int jobId;
    private String jobName;
    private ZonedDateTime appliedDate;
    private boolean waitingResponse;
    private boolean gotInterview;
    private boolean rejected;
    private boolean receivedOffer;

    public JobApplicationData(String jobName, ZonedDateTime appliedDate, boolean waitingResponse, boolean gotInterview, boolean rejected, boolean receivedOffer) {
        this.jobName = jobName;
        this.appliedDate = appliedDate;
        this.waitingResponse = waitingResponse;
        this.gotInterview = gotInterview;
        this.rejected = rejected;
        this.receivedOffer = receivedOffer;
    }

    public int getJobId() {
        return jobId;
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
