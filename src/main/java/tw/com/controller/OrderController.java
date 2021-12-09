package tw.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.dto.OrderDto;
import tw.com.entities.Order;
import tw.com.service.OrderService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController extends AbstractController<Order, OrderDto>{

    public OrderController() {
        super(new Order());
    }

    @GetMapping("/{startDate}/{endDate}/{gender}")
    public List<Order> findDateToDateWithGender(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate, @PathVariable String gender){
        return ((OrderService)iService).findDateToDateWithGender(startDate,endDate,gender);
    }
}
