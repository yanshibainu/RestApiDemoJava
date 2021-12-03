package tw.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tw.com.entities.Item;
import tw.com.entities.Order;
import tw.com.entities.User;
import tw.com.service.OrderService;

import java.time.LocalDate;

@SpringBootTest
public class OrderServiceTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void createTest(){
        User user1 = new User("Tom", "aaa@gmail.com", "12345");
        Item item1 = new Item("Pen", 15);
        Order order1 = new Order(1, LocalDate.of(2021, 10, 1), 1);
        order1.setUser(user1);
        order1.setItem(item1);
        orderService.create(order1);

        Assertions.assertNotNull(order1);
        Assertions.assertSame(user1.getId(),order1.getUser().getId());
        Assertions.assertSame(item1.getPrice(),order1.getItem().getPrice());
        Assertions.assertSame(item1.getId(),order1.getItem().getId());
    }

}
