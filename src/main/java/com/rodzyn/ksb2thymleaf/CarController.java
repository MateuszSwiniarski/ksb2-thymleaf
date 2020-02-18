package com.rodzyn.ksb2thymleaf;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

    private List<Car> cars = new ArrayList<>();

    public CarController() {
        Car car1 = new Car(1,"BMW", "i8");
        Car car2 = new Car(2,"Fiat", "126p");
        Car car3 = new Car(3,"Polonez", "Caro");
        Car car4 = new Car(4,"Nissan", "Sunny");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

    }

    @GetMapping("/cars")
    public String getCars(Model model){

        model.addAttribute("name", "Mateusz");
        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @PostMapping("add-car")
    public String addCar(@ModelAttribute Car car){
        cars.add(car);
        System.out.println(car);
        return "redirect:/cars";
    }

    @GetMapping("cars/carnew/{id}")
    public String newCar(@PathVariable("id") Integer id,  Model model){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getId() == id ){
                cars.remove(i);
            }
        }
        model.addAttribute("newCar", new Car());
        return "carnew";
    }

    @GetMapping("cars/update/{id}")
    public String updateCar(@PathVariable("id") Integer id, @ModelAttribute Car car){
        cars.remove(cars.get(id));
        cars.add(car);
        return "redirect:/cars";
    }

    @GetMapping(value = "cars/delete/{id}")
    public String deleteCar(@PathVariable("id") Integer id){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getId() == id ){
                cars.remove(i);
            }
        }
        return "redirect:/cars";
    }

}
