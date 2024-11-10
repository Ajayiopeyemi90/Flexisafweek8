public class Television implements PowerControl, VolumeControl, ChannelControl, InputControl, SmartFeatures {
    private String ProductionDate;
    private String SON;
    
    public Television(String ProductionDate, String SON) {
    this.ProductionDate = ProductionDate;
    this.SON = SON;
}

// Getter for ProductionDate
public String getProductionDate() {
    return ProductionDate;
}

// Setter for ProductionDate
public void setProductionDate(String ProductionDate) {
    this.ProductionDate = ProductionDate;
}

// Getter for SON
public String getSON() {
    return SON;
}

// Setter for SON
public void setSON(String SON) {
    this.SON = SON;
}
    // Implement methods for PowerControl
    @Override
    public void turnOn() {
        System.out.println("Television is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is now OFF.");
    }

    @Override
    public boolean isPoweredOn() {
        return true; // Example state
    }

    // Implement methods for VolumeControl
    @Override
    public void increaseVolume() {
        System.out.println("Volume increased.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume decreased.");
    }

    @Override
    public void mute() {
        System.out.println("Television is muted.");
    }

    @Override
    public int getCurrentVolume() {
        return 15; // Example volume level
    }

    // Implement methods for ChannelControl
    @Override
    public void changeChannel(int channelNumber) {
        System.out.println("Changing to channel " + channelNumber);
    }

    @Override
    public int getCurrentChannel() {
        return 5; // Example channel
    }

    @Override
    public void nextChannel() {
        System.out.println("Switching to the next channel.");
    }

    @Override
    public void previousChannel() {
        System.out.println("Switching to the previous channel.");
    }

    // Implement methods for InputControl
    @Override
    public void setInputSource(String source) {
        System.out.println("Input source set to " + source);
    }

    @Override
    public String getInputSource() {
        return "HDMI"; // Example input source
    }

    // Implement methods for SmartFeatures
    @Override
    public void browseInternet(String url) {
        System.out.println("Browsing to " + url);
    }

    @Override
    public void openApp(String appName) {
        System.out.println("Opening app: " + appName);
    }

    @Override
    public void closeApp() {
        System.out.println("Closing current app.");
    }

    @Override
    public boolean isAppOpen(String appName) {
        return false; // Example state
    }
}