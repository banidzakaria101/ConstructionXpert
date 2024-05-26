package model;

import java.util.Date;

public class Project {
    int projectId;
    String projectName;
    String projectDescription;
    Date projectStartDate;
    Date projectEndDate;
    int projectBudget;

    public Project() {

    }

    public Project(String projectName, String projectDescription, java.sql.Date projectStartDate, java.sql.Date projectEndDate, Integer projectBudget) {
        this.projectName = projectName;
        this.projectBudget = projectBudget;
        this.projectStartDate = projectStartDate;
        this.projectEndDate = projectEndDate;
        this.projectDescription = projectDescription;

    }


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public java.sql.Date getProjectStartDate() {
        return (java.sql.Date) projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public java.sql.Date getProjectEndDate() {
        return (java.sql.Date) projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public int getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(int projectBudget) {
        this.projectBudget = projectBudget;
    }



}
