package pl.pawelrochala.actions.faculty;

import pl.pawelrochala.Dao.FacultyDao;
import pl.pawelrochala.model.author.Faculty;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CreateFaculty extends ActionSupport {

	String name;
	FacultyDao facultyDao;
	
	@Override
	public String execute() throws Exception {
		Faculty faculty=new Faculty();
		faculty.setName(name);
		facultyDao.save(faculty);
		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FacultyDao getFacultyDao() {
		return facultyDao;
	}

	public void setFacultyDao(FacultyDao facultyDao) {
		this.facultyDao = facultyDao;
	}
	
	
}
