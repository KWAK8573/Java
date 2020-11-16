// 남학생이 주로 많고, 거주지역 대전지역이 대부분인경우
public class Student {
    
    String name;
    String region;
    Gender Gender;
    Student(){
        this.region = "대전";
        this.Gender = Gender.MALE;
    }
    Student(String name){
        this();
        this.name = name;
    }
}
enum Gender{
    MALE, FEMALE
}