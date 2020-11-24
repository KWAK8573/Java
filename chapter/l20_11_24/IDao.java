package chapter.l20_11_24;

import java.sql.*;
import java.util.*;


// 다오의 일반적인 메소드를 선언(추상-몸통없이)
// T - Generic's type V0클래스 타입지정(이 인터페이스를 구현할 떄에 T의 타입을 지정)
public interface IDao<T,k> { // 인터페이스 dao
    public int insert(T vo) throws SQLException;
    public int delete(k key) throws SQLException;
    public int update(T vo) throws SQLException;
    public T select(k key) throws SQLException;
    public List<T> selectAll() throws SQLException;

}
