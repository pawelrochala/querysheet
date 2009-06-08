package pl.pawelrochala.actions.user;

import java.util.List;

import pl.pawelrochala.Dao.UserDao;

import com.opensymphony.xwork2.ActionSupport;

public class PrepareUserView extends ActionSupport {
	UserDao userDao;
	List users;

	@Override
	public String execute() throws Exception {

		users = userDao.findAll();
		return ActionSupport.SUCCESS;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List getUsers() {
		return users;
	}

	public void setUsers(List users) {
		this.users = users;
	}

}
