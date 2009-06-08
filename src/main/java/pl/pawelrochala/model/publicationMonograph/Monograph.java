/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.pawelrochala.model.publicationMonograph;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import pl.pawelrochala.model.author.Author;
import pl.pawelrochala.model.periodicalPublisher.Publisher;

/**
 * 
 * @author rogal
 */
@Entity
public class Monograph  {

	
	
	int volume;
	String place;
	@ManyToOne
	@JoinColumn
	Publisher publisher;
	MonographType monographyType;
	int maxPoints;
	@ManyToMany(targetEntity = Author.class, mappedBy = "monographs", cascade = CascadeType.ALL)
	@JoinColumn
	Set<Author> autors = new HashSet<Author>();


	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int year;
	int page;
	String title;
	int amountAutors;
	
	public String getPlace() {
		return place;
	}

	public int getMaxPoints() {
		return maxPoints;
	}

	public void addAutor(Author autor) {
		autors.add(autor);
	}

	public Set<Author> getAutors() {
		return autors;
	}

	public void setAutors(Set<Author> persons) {
		this.autors = persons;
	}

	public void setMaxPoints(int maxPoints) {
		this.maxPoints = maxPoints;
	}

	public MonographType getMonographyType() {
		return monographyType;
	}

	public void setMonographyType(MonographType monographyType) {
		this.monographyType = monographyType;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Monograph() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autors == null) ? 0 : autors.hashCode());
		result = prime * result + maxPoints;
		result = prime * result
				+ ((monographyType == null) ? 0 : monographyType.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result
				+ ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + volume;
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
		Monograph other = (Monograph) obj;
		if (autors == null) {
			if (other.autors != null)
				return false;
		} else if (!autors.equals(other.autors))
			return false;
		if (maxPoints != other.maxPoints)
			return false;
		if (monographyType == null) {
			if (other.monographyType != null)
				return false;
		} else if (!monographyType.equals(other.monographyType))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}
	

}
