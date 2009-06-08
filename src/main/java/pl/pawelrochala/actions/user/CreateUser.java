package pl.pawelrochala.actions.user;

import pl.pawelrochala.Dao.UserDao;
import pl.pawelrochala.users.User;

import com.opensymphony.xwork2.ActionSupport;

public class CreateUser extends ActionSupport {
	String forename, surename, password, login, retypePassword;
	User user;
	UserDao userDao;

	@Override
	public String execute() {

		user = new User();
		user.setForename(forename);
		user.setLogin(login);
		user.setPassword(password);
		user.setSurename(surename);
		getUserDao().save(user);
		return SUCCESS;

	}

	public String getForename() {
		return forename;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getSurename() {
		return surename;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void validate() {
/*
		if (!login.matches("[a-z0-9]{4,}")) {
			addFieldError(forename, "Nieprawidłowy format loginu!");
		}

		if (!password.equals(retypePassword)) {
			addFieldError(password, "Hasła nie zgadzają się!");
		}
		if (password.length() < 4) {
			addFieldError(password, "Hasło zbyt krótkie!");
			addActionMessage("Hasło zbyt krótkie!");
		}
		if (!surename.matches("[A-Z][a-z-.]+")) {
			addFieldError(surename, "Nieprawidłowę imię!");
		}
		if (!forename.matches("[A-Z][a-z-.]+")) {
			addFieldError(forename, "Nieprawidłowę nazwisko!");
			
		}

		if (getUserDao().checkLoginUnique(login) == false) {
			addFieldError(login, "Podany login już istnieje!");
		}
*/
	}

}
