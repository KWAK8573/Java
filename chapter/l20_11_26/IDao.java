package chapter.l20_11_26;

import java.sql.*;
import java.util.*;

public interface IDao<T,k> {
    public int insert(T vo) throws SQLException;
    public int delete(k key) throws SQLException;
    public int update(T vo) throws SQLException;
    public T select(k key) throws SQLException;
    public List<T> selectAll() throws SQLException;
    public List<T> selectByConditions(String conditions) throws SQLException;
    public long getMaxNum() throws SQLException;
    public long getMinNum() throws SQLException;


}
