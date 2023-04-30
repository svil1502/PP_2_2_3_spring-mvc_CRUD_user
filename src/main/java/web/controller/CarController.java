package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String index(@RequestParam(value = "count", defaultValue = "5") int count,
                        Model model) {
        model.addAttribute("cars", CarService.index(count, CarDao.cars));
        System.out.println(count);
        return "cars";
    }
}
