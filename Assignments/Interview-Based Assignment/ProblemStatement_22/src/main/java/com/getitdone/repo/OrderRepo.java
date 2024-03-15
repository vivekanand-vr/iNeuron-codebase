package com.getitdone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getitdone.Entity.Order;
import com.getitdone.Entity.User;

public interface OrderRepo extends JpaRepository<Order, Long> {
       public List<Order> findByUser(User user);
	
}
