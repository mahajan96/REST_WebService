package restservice.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restservice.application.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
