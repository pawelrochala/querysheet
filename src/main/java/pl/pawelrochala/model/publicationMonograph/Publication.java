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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import pl.pawelrochala.model.author.Author;
import pl.pawelrochala.model.periodicalPublisher.Periodical;


@Entity
public class Publication  {

	@ManyToOne
	@JoinColumn
    Periodical periodical;
    int number;
    @ManyToMany(targetEntity=Author.class,mappedBy="publications",cascade=CascadeType.ALL)
	@JoinTable
    Set <Author> autors=new HashSet<Author>();
    
    @Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int year;
	int page;
	String title;
	int amountAutors;

    public Publication() {
    }
    
    public void addAutor(Author autor){
        autors.add(autor);
    }
    
    public Set<Author> getAutors() {
        return autors;
    }

    public void setAutors(Set<Author> persons) {
        this.autors = persons;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public Periodical getPeriodical() {
        return periodical;
    }

    public void setPeriodical(Periodical periodical) {
        this.periodical = periodical;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autors == null) ? 0 : autors.hashCode());
		result = prime * result + number;
		result = prime * result
				+ ((periodical == null) ? 0 : periodical.hashCode());
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
		Publication other = (Publication) obj;
		if (autors == null) {
			if (other.autors != null)
				return false;
		} else if (!autors.equals(other.autors))
			return false;
		if (number != other.number)
			return false;
		if (periodical == null) {
			if (other.periodical != null)
				return false;
		} else if (!periodical.equals(other.periodical))
			return false;
		return true;
	}
	
    
    /*
    public void storePublication(Periodical periodical, String name, int year, int page, int number, int amountAutors) {
        Session session = HibernateUtil.getSESSION_FACTORY().getCurrentSession();
        setTitle(name);
        setNumber(number);
        setYear(year);
        setPage(page);
        setAmountAutors(amountAutors);
        session.beginTransaction();
        setPeriodical(periodical);
        session.save(this);
        session.close();
    }*/
    
    
    
}
