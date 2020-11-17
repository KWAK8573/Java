public class Tire {
    public int maxRotation; // 최대 회전수(수명 )
    public int accumulatedRotation; // 누적회전수 
    public String location; // 타이어 위치

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
    public boolean roll(){
        ++ accumulatedRotation;
        if (accumulatedRotation<maxRotation){
            System.out.println(location+"수명"+(maxRotation-accumulatedRotation));
            return true;
        }else{
            System.out.println("@@@@@ "+location+"Tire 펑크! @@@@");
            return false;
        }
    }
    
}
