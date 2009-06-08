package pl.pawelrochala.actions.flow;

import java.util.Map;

import pl.pawelrochala.Dao.FacultyDao;
import pl.pawelrochala.Dao.UserDao;
import pl.pawelrochala.users.User;
import com.opensymphony.xwork2.ActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	User user;
	String password, login;
    UserDao userDao;
    FacultyDao facultyDao;
    public Login(){    	
    }
	
	public String execute() throws Exception {		

		user=userDao.authenticateUser(login, password);
		if(user!=null){
			 Map session = ActionContext.getContext().getSession();
			 session.put(SessionKeys.USER,user);			 
			 session.put(SessionKeys.FACULTY,facultyDao.findAll());
			 if(user.getIsAdmin()){
				 return ActionSupport.NONE;
			 }
			return ActionSupport.SUCCESS;
		}
		return ActionSupport.INPUT;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public FacultyDao getFacultyDao() {
		return facultyDao;
	}

	public void setFacultyDao(FacultyDao facultyDao) {
		this.facultyDao = facultyDao;
	}

	
	
	

}