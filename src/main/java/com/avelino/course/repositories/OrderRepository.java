package com.avelino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avelino.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
