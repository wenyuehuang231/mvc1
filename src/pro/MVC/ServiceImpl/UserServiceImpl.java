package MVC.ServiceImpl;

import MVC.Dao.UserDao;
import MVC.DaoImpl.UserDaoImpl;
import MVC.Service.UserService;
import entity.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}