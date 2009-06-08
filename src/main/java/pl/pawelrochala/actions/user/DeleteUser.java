package pl.pawelrochala.actions.user;

import pl.pawelrochala.Dao.UserDao;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteUser  extends ActionSupport {

	UserDao userDao;
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
