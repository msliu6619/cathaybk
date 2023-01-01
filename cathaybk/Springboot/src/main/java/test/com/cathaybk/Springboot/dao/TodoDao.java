package test.com.cathaybk.Springboot.dao;

import org.springframework.data.repository.CrudRepository;

import test.com.cathaybk.Springboot.entity.Todo;

public interface TodoDao extends CrudRepository<Todo, Integer> {

}
