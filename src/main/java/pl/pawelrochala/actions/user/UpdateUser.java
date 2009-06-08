package pl.pawelrochala.actions.user;

import pl.pawelrochala.Dao.UserDao;
import pl.pawelrochala.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateUser extends ActionSupport {

	UserDao userDao;
	User user;
	
	public String execute() throws Exception {	
		
		userDao.update(user);
		return ActionSupport.SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		
	
	public UserDao getUserDao() {
		return userDao;
	}	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	} 
	
	
}
