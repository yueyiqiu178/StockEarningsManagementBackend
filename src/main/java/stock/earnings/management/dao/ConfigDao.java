package stock.earnings.management.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import stock.earnings.management.model.Config;


@Mapper
public interface ConfigDao {
	
	@Insert("insert into config(config_key,config_value) values(#{configKey}, #{configValue})")
    int insert(Config config);
}
