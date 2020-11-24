package chapter.l20_11_24;

import java.sql.Timestamp;

public class MyMember2 {
    private long myno;
    private String id;
    private Timestamp day;
    private String password;
    private String phone;
    private long iswithrew;

    public long getMyno() {
        return myno;
    }

    public void setMyno(long myno) {
        this.myno = myno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getDay() {
        return day;
    }

    public void setDay(Timestamp day) {
        this.day = day;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getIswithrew() {
        return iswithrew;
    }

    public void setIswithrew(long iswithrew) {
        this.iswithrew = iswithrew;
    }

    @Override
    public String toString() {
        return "MyMember [day=" + day + ", id=" + id + ", iswithrew=" + iswithrew + ", myno=" + myno + ", password="
                + password + ", phone=" + phone + "]";
    }

    
}
