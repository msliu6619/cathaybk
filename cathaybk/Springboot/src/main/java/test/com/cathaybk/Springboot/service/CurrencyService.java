package test.com.cathaybk.Springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.cathaybk.Springboot.dao.CurrencyDao;
import test.com.cathaybk.Springboot.entity.Currency;

@Service
public class CurrencyService {
	@Autowired
	CurrencyDao currencyDao;
	
	public void InsertCurrency(Currency currency) {
		currencyDao.InsertCurrency(currency);
	}
	
	public void UpdateCurrencyByCode(Currency currency) {
		currencyDao.UpdateCurrencyByCode(currency);
	}
	
	public void DeleteCurrencyByCode(Currency currency) {
		currencyDao.DeleteCurrencyByCode(currency);
	}
	
	public List<Map<String,Object>> SelectAllCurrency() {
		return currencyDao.SelectAllCurrency();
	}
}
