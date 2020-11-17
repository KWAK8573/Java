public class SamSungRemoteCon implements IRemotecon {

    private int volume = 5;

    @Override
    public void turnOn() {
        System.out.println("화면에 삼성로고 켜진다");

    }

    @Override
    public void tuenOff() {
      System.out.println("꺼짐");

    }

    @Override
    public void volumUp() {
      volume +=1;

    }

    @Override
    public void volumDn() {
        volume -=1;
    }

    @Override
    public void setVolume(int volume) {
       this.Volume = volume;

    }
    
}
