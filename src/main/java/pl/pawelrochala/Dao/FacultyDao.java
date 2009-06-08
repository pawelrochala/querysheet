package pl.pawelrochala.Dao;

import java.util.List;

import pl.pawelrochala.model.author.Faculty;

public interface FacultyDao {

	List<Faculty> findAll();
	void save(Faculty faculty);
		
	
}
