public interface VolumeControl {
    void increaseVolume();
    void decreaseVolume();
    void mute();
    int getCurrentVolume();
}