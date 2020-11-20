package chapter.l20_11_20;

public class Score {
    private String name;
    private int kor;
    private int eng;
    private int math;
    // 자동계산 필드
    private int total;
    private double avg;

    public Score(String name, int kor, int eng, int math, int total, double avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor+eng+math;
        this.avg = ((int)(this.total/3.0)*100)/100.0;

    }

	public Score() {
	}

	@Override
	public String toString() {
        setAvg();
        setTotal();
		return name +" (eng=" + eng + ", kor=" + kor + ", math=" + math + ", total="+ total + ", avg=" + avg + ")";
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // setter, getter를 사용하는이유. 비지니스로직을 사용하기위해
        if(name.length()>5){
            System.out.println("한글 이름은 5자 이내여야합니다.");
            return;
        }
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        if(kor>100){
            System.out.println("국어 점수는 100점 이내여야 합니다.");
            return;
        }
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.kor+this.eng+this.math;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = ((int)(getTotal()/3.0)*100)/100.0;
    }
}
