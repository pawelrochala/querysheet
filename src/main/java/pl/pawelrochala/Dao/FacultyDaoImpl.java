package pl.pawelrochala.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pl.pawelrochala.model.author.Faculty;

public class FacultyDaoImpl extends HibernateDaoSupport implements FacultyDao
{

	@Override
	public List<Faculty> findAll() {
		List<Faculty> list=getHibernateTemplate().find("from pl.pawelrochala.model.author.Faculty");
		if(list==null){
			list=new ArrayList<Faculty>(0);
		}
		return list;
	}

	
	public void save(Faculty faculty) {
		getHibernateTemplate().save(faculty);				
	}


}
