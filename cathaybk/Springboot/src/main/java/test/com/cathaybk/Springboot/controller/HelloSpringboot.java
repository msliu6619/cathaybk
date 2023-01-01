package test.com.cathaybk.Springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringboot {
	@RequestMapping("/")
	public String hello()
	{
		return "hello world123";
	}
}