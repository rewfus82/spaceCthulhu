package spaceCthulhu.model.Bays;

public class RefrigeratedStorageBay extends StorageBay {
    private boolean refrigerated;

    public RefrigeratedStorageBay(Double storageCapacity, Double storageUsed, Double storageRemaining, String bayName,
            boolean refrigerated) {
        super(storageCapacity, storageUsed, storageRemaining, bayName);
        this.refrigerated = refrigerated;
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        this.refrigerated = refrigerated;
    }

}