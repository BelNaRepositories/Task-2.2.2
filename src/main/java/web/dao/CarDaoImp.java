package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private static final List<Car> listCar = new ArrayList<>();
    static {
        listCar.add(new Car("Lexus", "Black", 470));
        listCar.add(new Car("Honda", "Blue", 660));
        listCar.add(new Car("Suzuki", "Green", 90));
        listCar.add(new Car("Nissan", "Pink", 350));
        listCar.add(new Car("Volvo", "White", 80));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count > 5) {
            return listCar;
        }
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}


