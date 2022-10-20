package io.github.thallesryan.orderservice.repository;


import io.github.thallesryan.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}