package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {


    public List<Car> countCar(List<Car> listCar, int count) {
        if (count == 0 || count > 5) {
            return listCar;
        }
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}

