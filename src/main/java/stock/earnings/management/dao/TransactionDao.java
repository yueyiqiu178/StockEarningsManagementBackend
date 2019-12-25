package stock.earnings.management.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import stock.earnings.management.model.Transaction;

@Mapper
public interface TransactionDao {
	
	@Insert("insert into transaction(stock_id,transaction_type,transaction_price,transaction_amuont,transaction_date,is_settled) values(stock_id,transaction_type,transaction_price,transaction_amuont,transaction_date,is_settled)")
    int insert(Transaction transaction);
	
}
