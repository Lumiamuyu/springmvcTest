package Lumiamuyu.dao;

import Lumiamuyu.pojo.Suser;
import Lumiamuyu.utilTest.JDBCUtil;
import Lumiamuyu.utilTest.RowMap;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SuserDaoImpl implements ISuserDao {
    @Override
    public List<Suser> getLists() {
        return JDBCUtil.executeQuery("select * from suser", new RowMap<Suser>() {
            @Override
            public Suser RowMapping(ResultSet resultSet) throws SQLException {
                Suser suser = new Suser();
                suser.setId(resultSet.getInt("id"));
                suser.setUsername(resultSet.getString("username"));
                suser.setPassword(resultSet.getString("password"));
                return suser;
            }
        }, null);
    }

    @Override
    public int insert(Suser suser) {
        return JDBCUtil.executeUpdate("insert into suser(username,password) values(?,?)",suser.getUsername(),suser.getPassword());
    }

    @Override
    public int delete(int id) {
        return JDBCUtil.executeUpdate("delete from suser where id = ?",id);
    }

    @Override
    public int update(Suser suser) {
        return JDBCUtil.executeUpdate("update suser set username = ?, password = ? where id = ?",suser.getUsername(),suser.getPassword(),suser.getId());
    }

    @Override
    public Suser getOne(int id) {
        return JDBCUtil.queryOne("select * from suser where id = ?", new RowMap<Suser>() {
            @Override
            public Suser RowMapping(ResultSet resultSet) throws SQLException {
                Suser suser = new Suser();
                suser.setId(resultSet.getInt("id"));
                suser.setUsername(resultSet.getString("username"));
                suser.setPassword(resultSet.getString("password"));
                return suser;
            }
        }, id);
    }
}
