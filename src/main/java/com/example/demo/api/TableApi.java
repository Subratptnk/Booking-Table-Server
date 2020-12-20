package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TableEntity;
import com.example.demo.model.Table;
import com.example.demo.service.TableService;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class TableApi {

	@Autowired
	private TableService service;
	
	@GetMapping("/all")
	public Iterable<TableEntity> getAllBooking(){
		return service.getAllBookings();
	}
	
	@PostMapping("/add")
	public void addNewBooking(@RequestBody TableEntity table) {
		service.addNewBooking(table);
	}
	
	@PutMapping("/update")
	public void updateBooking(@RequestBody TableEntity table) {
		service.updateBooking(table);
	}
	
	@DeleteMapping("/cancel/{id}")
	public String cancelBooking(@PathVariable Long id) {
		service.deleteBooking(id);
		return id+"Got cancelled successfully";
		
	}
}
