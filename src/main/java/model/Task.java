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

    public Date getTaskdStartDate() {
        return taskdStartDate;
    }

    public void setTaskdStartDate(Date taskdStartDate) {
        this.taskdStartDate = taskdStartDate;
    }

    public Date getTaskdEndDate() {
        return taskdEndDate;
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
