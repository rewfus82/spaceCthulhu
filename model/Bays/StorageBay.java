package spaceCthulhu.model.Bays;

public class StorageBay extends ModularBayModel {
    private Double storageCapacity;
    private Double storageUsed;
    private Double storageRemaining;
    private String bayName;

    
    public StorageBay(int bayNumber, int baySize) {
        super();
    }

    public StorageBay(Double storageCapacity, Double storageUsed, Double storageRemaining, String bayName) {
        super();
        this.storageCapacity = storageCapacity;
        this.storageUsed = storageUsed;
        this.storageRemaining = storageRemaining;
        this.bayName = bayName;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Double getStorageUsed() {
        return storageUsed;
    }  

    public void setStorageUsed(Double storageUsed) {
        this.storageUsed = storageUsed;
    }

    public Double getStorageRemaining() {
        return storageRemaining;
    }

    public void setStorageRemaining(Double storageRemaining) {
        this.storageRemaining = storageRemaining;
    }

    public String getBayName() {
        return bayName;
    }

    public void setBayName(String bayName) {
        this.bayName = bayName;
    }

    @Override
    public String toString() {
        return "StorageBay [bayName=" + bayName + ", storageCapacity=" + storageCapacity + ", storageRemaining="
                + storageRemaining + ", storageUsed=" + storageUsed + "]";
    }

    
}