public class Humann extends Parent {
    public Humann() {
    }

    public Humann(String name, int age, String region) {
        super.name = name;
        super.age = age;
        super.region = region;
    }

    public Humann(String name, int age, String region, String familyClan) {
        super.name = name;
        super.age = age;
        super.region = region;
        super.familyClan = familyClan;
    }

    @Override
    public String toString() {
        return "Human [familyClan="+familyClan+ "," +name+ "]";
    }

}
