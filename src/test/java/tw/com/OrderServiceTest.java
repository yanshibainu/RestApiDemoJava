package tw.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tw.com.entities.Item;
import tw.com.entities.Order;
import tw.com.entities.Shop;
import tw.com.entities.User;
import tw.com.service.OrderService;

import java.time.LocalDate;

@SpringBootTest
public class OrderServiceTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void createTest(){
        User user1 = new User("阿寶", "aaa@gmail.com", "12345","woman");
        User user2 = new User("豆芽", "bbb@gmail.com", "12345","woman");
        User user3 = new User("老皮", "ccc@gmail.com", "12345","man");

        Shop shop1 = new Shop("久成久","東區大學路");
        Shop shop2 = new Shop("全家","東區北門路");
        Shop shop3 = new Shop("日蝕","東區成功路");

        Item item1 = new Item("鉛筆", 20, shop1);
        Item item2 = new Item("橡皮擦", 50, shop1);
        Item item3 = new Item("牛奶", 70, shop2);
        Item item4 = new Item("三明治", 10, shop2);
        Item item5 = new Item("蛋餅", 30, shop3);
        Item item6 = new Item("奶茶", 40, shop3);

        Order order1 = new Order(1, LocalDate.of(2021, 1, 2), 1);
        order1.setUser(user1);
        order1.setItem(item1);
        Order order2 = new Order(2, LocalDate.of(2021, 1, 2), 1);
        order2.setUser(user1);
        order2.setItem(item2);

        Order order3 = new Order(3, LocalDate.of(2021, 1, 5), 2);
        order3.setUser(user2);
        order3.setItem(item3);
        Order order4 = new Order(1, LocalDate.of(2021, 1, 5), 2);
        order4.setUser(user2);
        order4.setItem(item4);
        Order order5 = new Order(3, LocalDate.of(2021, 1, 10), 3);
        order5.setUser(user2);
        order5.setItem(item3);

        Order order6 = new Order(4, LocalDate.of(2021, 1, 20), 4);
        order6.setUser(user3);
        order6.setItem(item4);
        Order order7 = new Order(1, LocalDate.of(2021, 1, 20), 4);
        order7.setUser(user3);
        order7.setItem(item5);
        Order order8 = new Order(2, LocalDate.of(2021, 1, 20), 4);
        order8.setUser(user3);
        order8.setItem(item6);

        orderService.create(order1);
        orderService.create(order2);
        orderService.create(order3);
        orderService.create(order4);
        orderService.create(order5);
        orderService.create(order6);
        orderService.create(order7);
        orderService.create(order8);

        Assertions.assertNotNull(order1);
        Assertions.assertSame(user1.getId(),order1.getUser().getId());
        Assertions.assertSame(item1.getPrice(),order1.getItem().getPrice());
        Assertions.assertSame(item1.getId(),order1.getItem().getId());
    }

}
