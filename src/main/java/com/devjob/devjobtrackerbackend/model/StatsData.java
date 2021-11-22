package com.devjob.devjobtrackerbackend.model;

public class StatsData {

    private int totalJobs;
    private int awaitingCount;
    private int interviewCount;
    private int rejectionCount;
    private int offerCount;

    public StatsData(int totalJobs, int awaitingCount, int interviewCount, int rejectionCount, int offerCount) {
        this.totalJobs = totalJobs;
        this.awaitingCount = awaitingCount;
        this.interviewCount = interviewCount;
        this.rejectionCount = rejectionCount;
        this.offerCount = offerCount;
    }

    public int getTotalJobs() {
        return totalJobs;
    }

    public void setTotalJobs(int totalJobs) {
        this.totalJobs = totalJobs;
    }

    public int getAwaitingCount() {
        return awaitingCount;
    }

    public void setAwaitingCount(int awaitingCount) {
        this.awaitingCount = awaitingCount;
    }

    public int getInterviewCount() {
        return interviewCount;
    }

    public void setInterviewCount(int interviewCount) {
        this.interviewCount = interviewCount;
    }

    public int getRejectionCount() {
        return rejectionCount;
    }

    public void setRejectionCount(int rejectionCount) {
        this.rejectionCount = rejectionCount;
    }

    public int getOfferCount() {
        return offerCount;
    }

    public void setOfferCount(int offerCount) {
        this.offerCount = offerCount;
    }
}
