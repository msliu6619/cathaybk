package test.com.cathaybk.Springboot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import test.com.cathaybk.Springboot.entity.Currency;

@Repository
public class CurrencyDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void InsertCurrency(Currency currency) {
		System.out.println("EXECUTE INSERT CURRENCY");
//		jdbcTemplate.update("INSERT INTO Currency(CODE, SYMBOL, RATE, DESCRIPTION, RATE_FLOAT) "
//			+ "VALUES (?,?,?,?,?)",currency.getCode(), currency.getSymbol(),
//			currency.getRate(),currency.getDescription(),currency.getRate_float());
		String sql = "INSERT INTO CURRENCY " + 
					 "(CODE, SYMBOL, RATE, DESCRIPTION, RATE_FLOAT) " + 
					 "VALUES (" + 
					 "'" + currency.getCode() +  "', " + 
					 "'" + currency.getSymbol() + "', " + 
					 "'" + currency.getRate() + "', " + 
					 "'" + currency.getDescription() + "', " + 
					 currency.getRate_float() + "" + 
					 ")";
		
//		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(currency);
//		KeyHolder keyHolder = new GeneratedKeyHolder();
		
//		jdbcTemplate.update(sql, null, keyHolder);
		jdbcTemplate.update(sql);
//		return keyHolder.getKey().intValue();
	}
	
	public void UpdateCurrencyByCode(Currency currency) {
		System.out.println("EXECUTE UPDATE CURRENCY");
		
		String sql = "UPDATE CURRENCY SET " + 
					 "CODE='" + currency.getCode() + "', " + 
					 "SYMBOL='" + currency.getSymbol() + "', " + 
					 "RATE='" + currency.getRate() + "', " + 
					 "DESCRIPTION='" + currency.getDescription() + "', " +
					 "RATE_FLOAT=" + currency.getRate_float() + " " + 
					 "WHERE CODE='" + currency.getCode() + "'";
		
		jdbcTemplate.update(sql);
	}
	
	public void DeleteCurrencyByCode(Currency currency) {
		System.out.println("EXECUTE DELETE CURRENCY");
		
		String sql = "DELETE CURRENCY " + 
					 "WHERE CODE='" + currency.getCode() + "'";
		
		jdbcTemplate.update(sql);
	}
	
	public List<Map<String,Object>> SelectAllCurrency() {
		String sql = "SELECT * FROM CURRENCY";
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		
		result = jdbcTemplate.queryForList(sql);
		
		return result;
	}
}
