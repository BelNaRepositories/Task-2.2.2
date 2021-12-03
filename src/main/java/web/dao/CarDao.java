package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {
    List<Car> countCar(List<Car> listCar, int count);
}
