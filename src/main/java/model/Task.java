package model;

import java.util.Date;

public class Task {
    int taskId;
    int taskProjectId;
    String taskName;
    String taskDescription;
    String taskStatus;
    Date taskdStartDate;
    Date taskdEndDate;

    public Task(String taskName, String taskDescription, String taskStatus, Date taskdStartDate, Date taskdEndDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.taskdStartDate = taskdStartDate;
        this.taskdEndDate = taskdEndDate;
    }

    public Task(String taskName, String taskDescription, String taskStatus, java.sql.Date taskStartDate, java.sql.Date taskEndDate) {
    }

    public Task() {

    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public java.sql.Date getTaskdStartDate() {
        return (java.sql.Date) taskdStartDate;
    }

    public void setTaskdStartDate(Date taskdStartDate) {
        this.taskdStartDate = taskdStartDate;
    }

    public java.sql.Date getTaskdEndDate() {
        return (java.sql.Date) taskdEndDate;
    }

    public void setTaskdEndDate(Date taskdEndDate) {
        this.taskdEndDate = taskdEndDate;
    }

    public int getTaskProjectId() {
        return taskProjectId;
    }

    public void setTaskProjectId(int taskProjectId) {
        this.taskProjectId = taskProjectId;
    }
}
