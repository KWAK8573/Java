public interface IRemotecon {
    public final static int MAX_VOLUME = 10;
    int MIN_VAOLUME = 1; // public final static 생략가능
    public abstract void turnOn();
    public abstract void tuenOff();
    void volumUp(); // public abstract 생략가능
    void volumDn();
    void setVolume(int volume);    
}
