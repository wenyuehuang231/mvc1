package MVC.DaoImpl;

import MVC.Dao.BoxDao;
import entity.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BoxDaoImpl implements BoxDao {
    @Autowired
    private static Map<Integer, Box> boxMap;

    static{
        boxMap = new HashMap<Integer, Box>();
        boxMap.put(1,new Box(1,"小a"));
        boxMap.put(2,new Box(2,"小b"));
    }

    @Override
    public Box getBoxByid(int id) {
        return boxMap.get(id);
    }
}
