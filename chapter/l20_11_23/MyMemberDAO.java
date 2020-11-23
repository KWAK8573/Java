package chapter.l20_11_23;

import java.sql.*;
import java.util.*;

// DAO - Data Access Object
public class MyMemberDAO implements IDao<MyMember, String> {

    @Override
    public int insert(MyMember vo) throws SQLException {
        String sql = "INSERT INTO MYMEMBER VALUES(?,?,?.?)";
        String  id = vo.getId(); //public 이라면 vo.id
        String name = vo.getName();
        String password = vo.getPassword();
        String remark = vo.getRemark();
        // ?가 있는질의 - 공적질의 (Dynamic Query)
        // 동적질의를 담을 수 있는 클래스
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt =  conn.prepareStatement(sql);
        pstmt.setString(1, id); // 1부터 시작(물음표 첫번째 자리 )
        pstmt.setString(2, name);
        pstmt.setString(3, password);
        pstmt.setString(4, remark);
        // 질의 수행 ~ select 질의만 executeQuery 나머지 executeUpdate
        int res = pstmt.executeUpdate();
        conn.close();
        return res; // 질의 수행후 영향받은 행수를 리턴

    }

    @Override
    public int delete(String key) throws SQLException {
        // 지우는 질의는 반드시 삭제조건을 Where 절에 넣어야함
        String sql = "DELETE FROM MYMEMBER WHERE ID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,key);
        int res = pstmt.executeUpdate();
        conn.close();
        return res;
    }

    @Override
    public int update(MyMember vo) throws SQLException {
     
        return 0;
    }

    @Override
    public MyMember select(String key) throws SQLException {
        String sql = "SELECT * FROM MYMEMBER WHERE ID = ?";
        Connection conn = ConnectionFactory.create();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,key);
        // re - select 질의 결과를 담은객체
        // 레코드 옮기는 메소드 rs.next();
        // ==> 수행결과 레코드가 잘옮겨지면 true.
        // 그렇지않으면 false 
        
        ResultSet rs = pstmt.executeQuery();
        String id = null, name = null, password = null, remark= null;
        MyMember vo = new MyMember();
        while(rs.next()){ // key로 조건준 색인이어서 자료는 1개 이하임
            id = rs.getString(1);
            name = rs.getString(2);
            password = rs.getString(3);
            remark = rs.getString(4);
            vo.setId(id);
            vo.setName(name);
            vo.setPassword(password);
            vo.setRemark(remark);
            
        }
        return vo;
    }
    @Override
    public List<MyMember> selectAll() throws SQLException {
        String sql = "SELECT * FROM MYMEMBER";
        Connection conn = ConnectionFactory.create(); 
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
    String id=null,name=null,password=null,remark=null;
        List<MyMember> data = new ArrayList<>();
            while(rs.next()) { // key로 조건준 색인이어서 자료는 1개 이하임
                id = rs.getString(1); 
                name = rs.getString(2); 
                password = rs.getString(3);
                remark = rs.getString(4);

    MyMember vo = new MyMember();
        vo.setId(id);
        vo.setName(name);
        vo.setPassword(password);
        vo.setRemark(remark);
        data.add(vo);
    }
            return data;
     // IDao<MyMember,String> --> V0클레스로 MyMember를 사용
     // 테이블의 프라이머리키는 String type을 사용하겠다. 
}
}