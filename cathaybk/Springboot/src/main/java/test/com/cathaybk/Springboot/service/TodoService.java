package test.com.cathaybk.Springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import test.com.cathaybk.Springboot.dao.TodoDao;
import test.com.cathaybk.Springboot.entity.Todo;

public class TodoService {
	@Autowired
	TodoDao todoDao;
	
	public Iterable<Todo> getTodo() {
		return todoDao.findAll();
	}
}
