package pl.pawelrochala.users;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import pl.pawelrochala.model.author.Faculty;

@Entity

public  class User {
	
	@OneToOne(cascade=CascadeType.ALL)
	Faculty faculty;

	private String forename;
	
	private Boolean isAdmin;
	
	private String surename;
	

	private String login;
	
	private String password;

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User() {
		super();
	}
	@Override
	public String toString() {
		return forename+" "+surename+" "+login;
	}
	

}
