package chapter.l20_11_26;

import java.sql.Timestamp;

public class OrdersVO {
    private long orderid;
    private long custid;
    private long bookid;
    private long saleprice;
    private Timestamp orderdate;

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public long getCustid() {
        return custid;
    }

    public void setCustid(long custid) {
        this.custid = custid;
    }

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public long getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(long saleprice) {
        this.saleprice = saleprice;
    }

    public Timestamp getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Timestamp orderdate) {
        this.orderdate = orderdate;
    }

    @Override
    public String toString() {
        return "OrdersVO [bookid=" + bookid + ", custid=" + custid + ", orderdate=" + orderdate + ", orderid=" + orderid
                + ", saleprice=" + saleprice + "]";
    }


    
}
