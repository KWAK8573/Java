package chapter.l20_11_26;

public class CustomerVO {
    private long custid;
    private String name;
    private String address;
    private String phone;

    public long getCustid() {
        return custid;
    }

    public void setCustid(long custid) {
        this.custid = custid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerVO [address=" + address + ", custid=" + custid + ", name=" + name + ", phone=" + phone + "]";
    }

    
}
