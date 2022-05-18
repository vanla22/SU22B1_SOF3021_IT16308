package su22.sof3021.demo_bean_config;

import su22.sof3021.beans.admin.User;

public interface UserDaoInterface {
	public void insert(User user);
	public void update(User user);
	public void delete(User user);
}
