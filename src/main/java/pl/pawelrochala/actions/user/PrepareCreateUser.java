package pl.pawelrochala.actions.user;

import java.util.List;

import pl.pawelrochala.Dao.FacultyDao;
import pl.pawelrochala.model.author.Faculty;

import com.opensymphony.xwork2.ActionSupport;

public class PrepareCreateUser extends ActionSupport {
	List<Faculty> list;
	FacultyDao facultyDao;
	
	public String execute() throws Exception {

		
		list=facultyDao.findAll();
		return ActionSupport.SUCCESS;
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
