package test.com.cathaybk.Springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.com.cathaybk.Springboot.entity.Currency;
import test.com.cathaybk.Springboot.service.CurrencyService;

@Controller
@RequestMapping("/Hello")
public class HelloController {
	@RequestMapping("/main")
	public String Hello(@RequestParam(value="title", required=false, defaultValue="Liu") String title, Model model) {
		model.addAttribute("name", title);
		model.addAttribute("message", "This is a message");

		
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = SelectAllCurrency();
		model.addAttribute("data", list);
		
		for (int i = 0 ; i < list.size() ; i++) {
			Map<String,Object> map = list.get(i);
			String code1 = (String) map.get("code");
			String symbol1 = (String) map.get("symbol");
			String rate1 = (String) map.get("rate");
			String description1 = (String) map.get("description");
			Double rate_float1 = (Double) map.get("rate_float");
			
			System.out.println("====");
			System.out.println(i);
			System.out.println(code1);
			System.out.println(symbol1);
			System.out.println(rate1);
			System.out.println(description1);
			System.out.println(rate_float1);
			System.out.println("====");
		}
		
		return "Hello";
	}
	
	
	
	@Autowired
	Currency currency;
	
	@Autowired
	CurrencyService currencyService;
	
	@RequestMapping("/Insert")
	public String Insert(@RequestParam(value="code") String code, 
			             @RequestParam(value="symbol") String symbol, 
			             @RequestParam(value="rate") String rate,
			             @RequestParam(value="description") String description,
			             Model model) {
		model.addAttribute("name", "Liu");
		model.addAttribute("message", "Insert complete.");
		
//		System.out.println("Insert Data");
//		System.out.println("code = " + code);
//		System.out.println("symbol = " + symbol);
//		System.out.println("rate = " + rate);
//		System.out.println("description = " + description);

		float rate_float = Float.parseFloat(rate);
		
		currency.setCode(code);
		currency.setSymbol(symbol);
		currency.setRate(rate);
		currency.setDescription(description);
		currency.setRate_float(rate_float);
		
		currencyService.InsertCurrency(currency);
		
		
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = SelectAllCurrency();
		model.addAttribute("data", list);
		
		for (int i = 0 ; i < list.size() ; i++) {
			Map<String,Object> map = list.get(i);
			String code1 = (String) map.get("code");
			String symbol1 = (String) map.get("symbol");
			String rate1 = (String) map.get("rate");
			String description1 = (String) map.get("description");
			Double rate_float1 = (Double) map.get("rate_float");
			
			System.out.println("====");
			System.out.println(i);
			System.out.println(code1);
			System.out.println(symbol1);
			System.out.println(rate1);
			System.out.println(description1);
			System.out.println(rate_float1);
			System.out.println("====");
		}
		
		return "Hello";
	}
	
	@RequestMapping("/Update")
	public String Update(@RequestParam(value="code") String code, 
			             @RequestParam(value="symbol") String symbol, 
			             @RequestParam(value="rate") String rate,
			             @RequestParam(value="description") String description,
			             Model model) {
		model.addAttribute("name", "Liu");
		model.addAttribute("message", "Update complete.");
//		System.out.println("Update Data");
//		System.out.println("code = " + code);
//		System.out.println("symbol = " + symbol);
//		System.out.println("rate = " + rate);
//		System.out.println("description = " + description);

		float rate_float = Float.parseFloat(rate);
		
		currency.setCode(code);
		currency.setSymbol(symbol);
		currency.setRate(rate);
		currency.setDescription(description);
		currency.setRate_float(rate_float);
		
		currencyService.UpdateCurrencyByCode(currency);
		
		
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = SelectAllCurrency();
		model.addAttribute("data", list);
		
		for (int i = 0 ; i < list.size() ; i++) {
			Map<String,Object> map = list.get(i);
			String code1 = (String) map.get("code");
			String symbol1 = (String) map.get("symbol");
			String rate1 = (String) map.get("rate");
			String description1 = (String) map.get("description");
			Double rate_float1 = (Double) map.get("rate_float");
			
			System.out.println("====");
			System.out.println(i);
			System.out.println(code1);
			System.out.println(symbol1);
			System.out.println(rate1);
			System.out.println(description1);
			System.out.println(rate_float1);
			System.out.println("====");
		}
		
		return "Hello";
	}
	
	@RequestMapping("/Delete")
	public String Delete(@RequestParam(value="code") String code, 
			             @RequestParam(value="symbol") String symbol, 
			             @RequestParam(value="rate") String rate,
			             @RequestParam(value="description") String description,
			             Model model) {
		model.addAttribute("name", "Liu");
		model.addAttribute("message", "Delete complete.");
//		System.out.println("Update Data");
//		System.out.println("code = " + code);
//		System.out.println("symbol = " + symbol);
//		System.out.println("rate = " + rate);
//		System.out.println("description = " + description);

		float rate_float = Float.parseFloat(rate);
		
		currency.setCode(code);
		currency.setSymbol(symbol);
		currency.setRate(rate);
		currency.setDescription(description);
		currency.setRate_float(rate_float);
		
		currencyService.DeleteCurrencyByCode(currency);
		
		
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = SelectAllCurrency();
		model.addAttribute("data", list);
		
		for (int i = 0 ; i < list.size() ; i++) {
			Map<String,Object> map = list.get(i);
			String code1 = (String) map.get("code");
			String symbol1 = (String) map.get("symbol");
			String rate1 = (String) map.get("rate");
			String description1 = (String) map.get("description");
			Double rate_float1 = (Double) map.get("rate_float");
			
			System.out.println("====");
			System.out.println(i);
			System.out.println(code1);
			System.out.println(symbol1);
			System.out.println(rate1);
			System.out.println(description1);
			System.out.println(rate_float1);
			System.out.println("====");
		}
		
		return "Hello";
	}
	
	public List<Map<String,Object>> SelectAllCurrency() {
		return currencyService.SelectAllCurrency();
	}
}
