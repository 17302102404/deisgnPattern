package org.czx.templatepattern;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhixuecai on 2018/11/5.
 */
public class MyDao {

    private MyJdbcTemplate myJdbcTemplate;

//    public Object query(){
//        String sql = "";
//        Object rs = myJdbcTemplate.executeQuery(sql, new RowMapper<Object>() {
//            @Override
//            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
//                Map map = new HashMap<String,String>();
//                return  map;
//            }
//        },null).get(0);
//        return rs;
//    }
}
