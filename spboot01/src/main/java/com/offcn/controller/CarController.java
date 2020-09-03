package com.offcn.controller;

import com.offcn.pojo.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private List<Car> list = new ArrayList<>();

    @RequestMapping("/add1")
    public List<Car> add1(@RequestBody Car car) {
        list.add(car);
        return list;
    }

    @RequestMapping("/add2")
    public List<Car> add2(Car car) {
        list.add(car);
        return list;
    }

}
