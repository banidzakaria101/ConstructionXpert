package model;

public class Resource {
    int resourceId;
    String resourceName;
    String resourceDescription;
    String resourceType;
    Long resourceQuantity;

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

    public Long getResourceQuantity() {
        return resourceQuantity;
    }

    public void setResourceQuantity(Long resourceQuantity) {
        this.resourceQuantity = resourceQuantity;
    }
}
