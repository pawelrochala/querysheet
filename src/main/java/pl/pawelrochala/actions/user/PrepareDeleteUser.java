package pl.pawelrochala.actions.user;

import pl.pawelrochala.Dao.UserDao;
import pl.pawelrochala.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class PrepareDeleteUser extends ActionSupport{
	
	User user;
	UserDao userDao;
	Long id;
	public String execute() throws Exception {

		user = userDao.findUser(id);
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	} 
	
	
	

}
