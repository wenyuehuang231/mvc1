package MVC.ServiceImpl;

import MVC.Dao.BoxDao;
import MVC.Service.BoxService;
import entity.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ss")
public class BoxServiceImpl implements BoxService {
    @Autowired
    private BoxDao boxDao;

    @Override
    public Box getBoxById(int id) {
        return boxDao.getBoxByid(id);
    }
}
