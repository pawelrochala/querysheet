package pl.pawelrochala.model.publicationMonograph;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
public class Questionnaire {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;

	
	int year;

	@OneToMany
	@PrimaryKeyJoinColumn
//	@JoinTable(name = "QUESTIONNAIRE_PUBLICATIONS", joinColumns = { @JoinColumn(name = "ID_QUESTIONNAIRE") }, inverseJoinColumns = { @JoinColumn(name = "ID_PUBLICATIONS") })
	Set<Publication> publications = new HashSet<Publication>();

	@OneToMany
	@PrimaryKeyJoinColumn
//	@JoinTable(name = "QUESTIONNAIRE_MONOGRAPHYS", joinColumns = { @JoinColumn(name = "ID_QUESTIONNAIRE") }, inverseJoinColumns = { @JoinColumn(name = "ID_MONOGRAPHY") })
	Set<Monograph> monographys = new HashSet<Monograph>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<Publication> getPublications() {
		return publications;
	}

	public void setPublications(Set<Publication> publications) {
		this.publications = publications;
	}

	public Set<Monograph> getMonographys() {
		return monographys;
	}

	public void setMonographys(Set<Monograph> monographys) {
		this.monographys = monographys;
	}





}
