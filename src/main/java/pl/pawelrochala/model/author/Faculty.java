/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pawelrochala.model.author;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import pl.pawelrochala.users.User;

@Entity

public class Faculty {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	
	String name;
	
	/*
	@ManyToOne(targetEntity=UniversityAuthor.class,cascade=CascadeType.ALL)
	@JoinTable
	private Map<Integer, UniversityAuthor> memebrs = new HashMap<Integer, UniversityAuthor>();
*/

	

//	public Map<Integer, UniversityAuthor> getMemebrs() {
//		return memebrs;
//	}
//
//	public void setMemebrs(HashMap<Integer, UniversityAuthor> memebrs) {
//		this.memebrs = memebrs;
//	}

	
	
	public Faculty() {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return name;
	}

	
}
