package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {
    @GetMapping(value = "/")
    public String printWelcome(HttpServletRequest request, ModelMap model) {
        Integer count = Integer.valueOf(request.getParameter("count"));
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        List<Car> cars = carServiceImpl.carList(count);
        model.addAttribute("message", cars);

        return "cars";
    }
}
