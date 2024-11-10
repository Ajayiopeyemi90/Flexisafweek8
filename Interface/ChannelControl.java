public interface ChannelControl {
    void changeChannel(int channelNumber);
    int getCurrentChannel();
    void nextChannel();
    void previousChannel();
}