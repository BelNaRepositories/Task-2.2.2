package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Lexus", "Black", 470));
        listCar.add(new Car("Honda", "Blue", 660));
        listCar.add(new Car("Suzuki", "Green", 90));
        listCar.add(new Car("Nissan", "Pink", 350));
        listCar.add(new Car("Volvo", "White", 80));
        listCar = carService.countCar(listCar, count);
        model.addAttribute("listCar", listCar);
        return "car";
    }
}
