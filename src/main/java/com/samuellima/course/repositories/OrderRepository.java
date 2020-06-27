package com.samuellima.course.repositories;

import com.samuellima.course.entities.Order;
import com.samuellima.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
