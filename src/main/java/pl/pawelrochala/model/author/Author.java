/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pawelrochala.model.author;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import pl.pawelrochala.model.publicationMonograph.Monograph;
import pl.pawelrochala.model.publicationMonograph.Publication;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Author {

	@Id()
    private long id;
	
    private String forename,  surename;
   
    @ManyToMany(cascade=CascadeType.ALL)
	@JoinTable
	private Set<Publication>publications=new HashSet<Publication>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable
	private Set<Monograph>monographs=new HashSet<Monograph>();

	
	

    public boolean add(Publication e) {
		return publications.add(e);
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Publication> getPublications() {
		return publications;
	}

	public void setPublications(Set<Publication> publications) {
		this.publications = publications;
	}

	public Set<Monograph> getMonographs() {
		return monographs;
	}

	public void setMonographs(Set<Monograph> monographs) {
		this.monographs = monographs;
	}

	public void setForename(String forename) {
        this.forename = forename;
    }

    

    public void setId(int id) {
        this.id = id;
    }

  

    public void setSurename(String surename) {
        this.surename = surename;
    }

   

    public String getForename() {
        return forename;
    }

    

    public long getId() {
        return id;
    }

  

    public String getSurename() {
        return surename;
    }

    public Author() {
    }
    
    

    public Author(String forename, String surename) {
		super();
		this.forename = forename;
		this.surename = surename;
		
	}
    		
	

	@Override
    public String toString() {
        return getForename().charAt(0) + ". " + getSurename();
    }
}
