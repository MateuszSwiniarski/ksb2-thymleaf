package com.rodzyn.ksb2thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Fiat", "126p");
        Car car3 = new Car("Polonez", "Caro");
        Car car4 = new Car("Nissan", "Sunny");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);
        model.addAttribute("name", "Mateusz");
        model.addAttribute("cars", cars);
        return "car";
    }
}
