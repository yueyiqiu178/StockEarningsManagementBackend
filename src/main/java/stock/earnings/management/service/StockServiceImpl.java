package stock.earnings.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.earnings.management.dao.ConfigDao;
import stock.earnings.management.model.Config;

@Service
public class StockServiceImpl implements StockService{
	
	@Autowired
	private ConfigDao configDao;
	
	public void insertConfig() {
		
		System.out.println("ocnfig");
		Config config = new Config();
		config.setConfigKey("abc");
		config.setConfigValue("100");
		configDao.insert(config);
	}
	
}
