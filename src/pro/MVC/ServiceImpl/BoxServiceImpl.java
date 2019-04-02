package MVC.ServiceImpl;

import MVC.Dao.BoxDao;
import MVC.Service.BoxService;
import entity.Box;
import org.springframework.stereotype.Service;

@Service
public class BoxServiceImpl implements BoxService {
    private BoxDao boxDao;

    @Override
    public Box getBoxById(int id) {
        return boxDao.getBoxByid(id);
    }
}
