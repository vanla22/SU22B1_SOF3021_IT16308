package su22.sof3021.demo_bean_config;

import su22.sof3021.beans.admin.User;

public class UserDaoMySql implements UserDaoInterface {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("Them MYSQL");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Cap nhat MYSQL");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Xoa MYSQL");
	}

}
