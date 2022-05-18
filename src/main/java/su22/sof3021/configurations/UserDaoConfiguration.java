package su22.sof3021.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import su22.sof3021.demo_bean_config.UserDaoInterface;
import su22.sof3021.demo_bean_config.UserDaoMySql;
import su22.sof3021.demo_bean_config.UserDaoSqlServer;

@Configuration
public class UserDaoConfiguration {
	@Bean("user_dao_mysql")
//	@Primary
	public UserDaoInterface getUserDAOMySQL()
	{
		UserDaoMySql dao = new UserDaoMySql();
		return dao;
	}
	
	@Bean("user_dao_sqlserver")
	public UserDaoInterface getUserDAOSQLServer()
	{
		UserDaoSqlServer dao = new UserDaoSqlServer();
		return dao;
	}
}
