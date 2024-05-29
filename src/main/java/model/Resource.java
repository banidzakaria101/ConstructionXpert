package model;

public class Resource {
    int resourceId;
    int taskId;
    String resourceName;
    String resourceDescription;
    String resourceType;
    int resourceQuantity;


    public Resource(int taskId, String resourceName, String resourceDescription, String resourceType,    int resourceQuantity) {
        this.taskId = taskId;
        this.resourceName = resourceName;
        this.resourceDescription = resourceDescription;
        this.resourceType = resourceType;
        this.resourceQuantity = resourceQuantity;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getResourceQuantity() {
        return resourceQuantity;
    }

    public void setResourceQuantity(int resourceQuantity) {
        this.resourceQuantity = resourceQuantity;
    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }


}
