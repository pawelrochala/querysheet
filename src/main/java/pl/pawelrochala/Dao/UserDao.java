package pl.pawelrochala.Dao;

import java.util.List;

import pl.pawelrochala.users.User;

public interface UserDao {

	public User authenticateUser(String login,String password);
	public void save(User user);
	public void delete (Long id);
	public void update(User user);
	public List<User> findAll();
	public User findUser(Long id);
	public boolean checkLoginUnique(String login);
	
}
