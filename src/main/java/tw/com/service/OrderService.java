package tw.com.service;

import org.springframework.stereotype.Service;
import tw.com.dao.OrderRepository;
import tw.com.entities.Order;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class OrderService extends AbstractService<Order>{

    public OrderService(OrderRepository orderRepository) {
        super(orderRepository);
    }

    @Override
    public Order update(String id, Order entity) {
        entity.setId(id);
        return super.update(id, entity);
    }

    public List<Order> findDateToDateWithGender(LocalDate startDate, LocalDate endDate , String gender){
        List<Order> orderList = ((OrderRepository)iRepository).findDateToDateWithGender(startDate,endDate,gender);
        return orderList;
    }
}
