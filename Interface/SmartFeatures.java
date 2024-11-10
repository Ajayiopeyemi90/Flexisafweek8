public interface SmartFeatures {
    void browseInternet(String url);
    void openApp(String appName);
    void closeApp();
    boolean isAppOpen(String appName);
}