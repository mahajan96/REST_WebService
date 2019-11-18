package restservice.application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restservice.application.model.Orders;
import restservice.application.repository.OrdersRepository;

@Service
public class OrdersDAO {
	
	@Autowired
	OrdersRepository oRepo;
	
	public List<Orders> getData() {
		return oRepo.findAll();
	}
}
