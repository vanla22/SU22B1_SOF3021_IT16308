package su22.sof3021.demo_bean_config;

import su22.sof3021.beans.admin.User;

public class UserDaoSqlServer implements UserDaoInterface {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("Them SQL Server");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Cap nhat SQL Server");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Xoa SQL Server");
	}

}
