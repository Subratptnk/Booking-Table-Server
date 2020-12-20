package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TableEntity;
import com.example.demo.model.Table;
import com.example.demo.repo.tableDAO;


@Service
@Transactional
public class TableService {
	
	@Autowired
	private tableDAO dao;
	
	public Iterable<TableEntity> getAllBookings(){
		return dao.findAll();
	}
	
	public void addNewBooking(TableEntity table) {
		dao.save(table);
	}
	
	public void updateBooking(TableEntity table) {
		if(dao.findById(table.getId()) != null) {
			dao.save(table);
		}
	}
	
	public String deleteBooking(Long id) {
		 dao.deleteById(id);
		 return id+"Got deleted Successfully";
	}
	

}
