package stock.earnings.management.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stock.earnings.management.service.StockService;

@RestController
public class StockController {
	
	private static final Logger logger = LogManager.getLogger(StockController.class);
	
	@Autowired
	StockService stockService;
	
	
	@RequestMapping(value="/hello",method= RequestMethod.GET)
    public String sayHello(){
		
		//stockService.insertConfig();
		
		logger.info("sayHello");
		
        return "hello";
    }
	
	
	@RequestMapping(value="/hellopost",method= RequestMethod.POST)
    public String sayHelloPost(){
		
		//stockService.insertConfig();
		logger.info("sayHelloPost");
        return "sayHelloPost";
    }
	
	
	@RequestMapping(value="/checkStockExists",method= RequestMethod.POST)
    public String checkStockExists(String stockId){
		
		
		
        return "checkStockExists";
    }
	
}
