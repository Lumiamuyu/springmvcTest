package Lumiamuyu.service;

import Lumiamuyu.dao.ISuserDao;
import Lumiamuyu.dao.SuserDaoImpl;
import Lumiamuyu.pojo.Suser;

import java.util.List;

public class SuserServiceImpl implements ISuserService {
    private ISuserDao dao = new SuserDaoImpl();
    @Override
    public List<Suser> getLists() {
        return dao.getLists();
    }

    @Override
    public int insert(Suser suser) {
        return dao.insert(suser);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public int update(Suser suser) {
        return dao.update(suser);
    }

    @Override
    public Suser getOne(int id) {
        return dao.getOne(id);
    }

}
