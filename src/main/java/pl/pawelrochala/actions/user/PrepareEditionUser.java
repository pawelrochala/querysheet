package pl.pawelrochala.actions.user;

import java.util.List;

import pl.pawelrochala.Dao.FacultyDao;
import pl.pawelrochala.Dao.UserDao;
import pl.pawelrochala.model.author.Faculty;
import pl.pawelrochala.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class PrepareEditionUser extends ActionSupport {

	User user;
	UserDao userDao;
	Long id;
	
	List<Faculty> list;
	FacultyDao facultyDao;
	

	public String execute() throws Exception {

		user = userDao.findUser(id);
		list=facultyDao.findAll();
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


	public List<Faculty> getList() {
		return list;
	}

	public void setList(List<Faculty> list) {
		this.list = list;
	}

	public FacultyDao getFacultyDao() {
		return facultyDao;
	}

	public void setFacultyDao(FacultyDao facultyDao) {
		this.facultyDao = facultyDao;
	}

	
}
