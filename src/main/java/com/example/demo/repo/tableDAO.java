package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TableEntity;
import com.example.demo.model.Table;

@Repository
public interface tableDAO extends CrudRepository<TableEntity,Long>{

}
