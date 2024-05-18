package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(Model model, @RequestParam(defaultValue = "5", required = false) Integer count) {
        model.addAttribute("cars", carService.getAllCars(count != null && count >= 5 ? count : 5));
        return "cars";
    }
}