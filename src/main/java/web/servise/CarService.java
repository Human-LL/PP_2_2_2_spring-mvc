package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.CarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService implements CarRepository {
    private final List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars(int countValue) {
        initializeCars();
        return cars.stream().limit(Math.min(countValue, cars.size())).collect(Collectors.toList());
    }

    private void initializeCars() {
        if (cars.isEmpty()) {
            cars.add(new Car("Topol", "M", 333));
            cars.add(new Car("Lada", "Priora", 2012));
            cars.add(new Car("Ford", "Mustang", 2022));
            cars.add(new Car("Chevrolet", "Corvette", 2023));
            cars.add(new Car("BMW", "M5", 2024));
        }
    }

    @Override
    public List<Car> getAll() {
        initializeCars();
        return cars;
    }
}