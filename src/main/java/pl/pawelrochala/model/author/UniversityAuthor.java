/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pawelrochala.model.author;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * @author rogal
 */
@Entity
public class UniversityAuthor extends Author {

	
	private Degree degree;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable
	private Map<Integer, Faculty> memebrsOf = new HashMap<Integer, Faculty>();

	
	
	public UniversityAuthor() {
	}
	
	

	public Faculty put(Integer key, Faculty value) {
	return memebrsOf.put(key, value);
	}



	public UniversityAuthor(Degree degree, boolean isMen,
			HashMap<Integer, Faculty> memebrsOf
			) {
		super();
		this.degree = degree;
		
		this.memebrsOf = memebrsOf;
	}
	
	



	public Map<Integer, Faculty> getMemebrsOf() {
		return memebrsOf;
	}

	public void setMemebrsOf(HashMap<Integer, Faculty> memebrsOf) {
		this.memebrsOf = memebrsOf;
	}

	

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	

	public Degree getDegree() {
		return degree;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		
		result = prime * result
				+ ((memebrsOf == null) ? 0 : memebrsOf.hashCode())
				;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniversityAuthor other = (UniversityAuthor) obj;
		if (degree == null) {
			if (other.degree != null)
				return false;
		} else if (!degree.equals(other.degree))
			return false;
		
		if (memebrsOf == null) {
			if (other.memebrsOf != null)
				return false;
		} else if (!memebrsOf.equals(other.memebrsOf))
			return false;
		return true;
	}
	
	

}
