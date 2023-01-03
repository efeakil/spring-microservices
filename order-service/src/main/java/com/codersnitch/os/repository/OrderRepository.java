package com.codersnitch.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codersnitch.os.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
