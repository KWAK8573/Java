package chapter.l20_11_23;
// V0 클래스 - 데이터 입출력시 객체단위로 움직이게 하는것
public class MyMember {
    private String id;
    private String name;
    private String password;
    private String remark;
    // 기본생성자는 아무런 생성메소드가 없다면 '있는것'이다.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MyMember1 [id=" + id + ", name=" + name + ", password=" + password + ", remark=" + remark + "]";
    }
    
}
