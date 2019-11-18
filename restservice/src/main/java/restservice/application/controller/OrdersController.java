package restservice.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restservice.application.dao.OrdersDAO;
import restservice.application.model.Orders;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	OrdersDAO oDAO;
	
	@GetMapping("/alldata")
	public List<Orders> getAll(){
		return oDAO.getData();
	}
}
