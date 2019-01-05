package Lumiamuyu.dao;

import Lumiamuyu.pojo.Suser;

import java.util.List;

public interface ISuserDao {
    public List<Suser> getLists();
    public int insert(Suser suser);
    public int delete(int id);
    public int update(Suser suser);
    public Suser getOne(int id);
}
