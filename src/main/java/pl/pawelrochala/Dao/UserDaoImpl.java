package pl.pawelrochala.Dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pl.pawelrochala.users.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User authenticateUser(String login, String password) {

		List list = getHibernateTemplate()
				.find(
						"from pl.pawelrochala.users.User u where u.login=? and u.password =?",
						new Object[] { login, password });
		return list.size() == 1 ? (User) list.get(0) : null;
	}

	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	public List<User> findAll() {
		return getHibernateTemplate().find("from pl.pawelrochala.users.User");
	}

	public boolean checkLoginUnique(String login) {
		List list = getHibernateTemplate().find(
				"select u.login from pl.pawelrochala.users.User u");
		if (list.contains(login)) {
			return false;
		}
		return true;
	}


	public void delete(Long id) {
		getHibernateTemplate().find(
				"delete from pl.pawelrochala.users.User u where u.id=? ",
				new Object[] { id });

	}

	public User findUser(Long id) {
		List<User> list = getHibernateTemplate().find(
				"from pl.pawelrochala.users.User u where u.id=? ",
				new Object[] { id });
		return list.get(0);
	}

	@Override
	public void update(User user) {
	     getHibernateTemplate().update(user);
		
	}
	

}
