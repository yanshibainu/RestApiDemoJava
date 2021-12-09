package tw.com.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tw.com.entities.Order;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends IRepository<Order, String>{

    @Query("select o from Order o " +
            "where o.user.gender = :gender " +
            "and o.buyDate between :startDate and :endDate")
    List<Order> findDateToDateWithGender(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("gender") String gender);
}
