package org.czx.templatepattern;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 由于尽量简化，其他的步骤就借用Spring JdbcTemplate的那一套
 * <p>
 * Created by zhixuecai on 2018/11/5.
 */
public class MyJdbcTemplate{

}

/*
public class MyJdbcTemplate extends JdbcTemplate {

    private DataSource dataSource;

    public MyJdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


//      查询数据库的标准流程
//      1.建立连接
//      2.新建查询
//      3.执行查询
//      4.解析查询结果集  （这一步是可拓展用户自定义的）
//      5.关闭查询
//      6.关闭结果
//      7.关闭连接

    private Object excute() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();

            String sql = "";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                rs.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }



    //将上述的过程进行优化
    private Connection getConnection() throws  Exception{
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection conn,String sql) throws  Exception{
        return  conn.prepareStatement(sql);
    }


    private ResultSet executeQuery(PreparedStatement pstmt,Object [] values) throws  Exception{
        for (int i = 0; i <values.length; i ++){
            pstmt.setObject(i,values[i]);
        }
        return  pstmt.executeQuery();
    }

    private void closeStatement(Statement stmt) throws  Exception{
        stmt.close();
    }

    private void closeResultSet(ResultSet rs) throws  Exception{
        rs.close();
    }

    private void closeConnection(Connection conn) throws  Exception{
        conn.close();
        //但通常把它放到连接池回收
    }



    private List<?> parseResultSet(ResultSet rs, RowMapper rowMapper) throws  Exception{
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum ++));
        }
        return result;
    }


//     * 如此设计，如果使用此方法必须自定义RowMapper接口的实现，单独抽出一个接口可以实现解耦
//     * @param sql
//     * @param rowMapper
//     * @param values
//     * @return

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object [] values){
        try {
            Connection conn = this.getConnection();
            PreparedStatement pstmt = this.createPreparedStatement(conn,sql);
            ResultSet rs = this.executeQuery(pstmt,values);
            List<?> result = this.parseResultSet(rs,rowMapper);
            this.closeResultSet(rs);
            this.closeStatement(pstmt);
            this.closeConnection(conn);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}*/
