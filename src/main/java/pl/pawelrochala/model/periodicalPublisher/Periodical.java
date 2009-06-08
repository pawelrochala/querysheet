/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pawelrochala.model.periodicalPublisher;

import javax.persistence.Entity;


@Entity
public class Periodical extends Publisher {

	PeriodicalType periodicalType;
    String ministryName;

    public String getMinistryName() {
        return ministryName;
    }

    public void setMinistryName(String nameFromIIN) {
        this.ministryName = nameFromIIN;
    }
    

	public PeriodicalType getPeriodicalType() {
		return periodicalType;
	}

	public void setPeriodicalType(PeriodicalType periodicalType) {
		this.periodicalType = periodicalType;
	}

	public Periodical() {
    
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ministryName == null) ? 0 : ministryName.hashCode());
		result = prime * result
				+ ((periodicalType == null) ? 0 : periodicalType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Periodical other = (Periodical) obj;
		if (ministryName == null) {
			if (other.ministryName != null)
				return false;
		} else if (!ministryName.equals(other.ministryName))
			return false;
		if (periodicalType == null) {
			if (other.periodicalType != null)
				return false;
		} else if (!periodicalType.equals(other.periodicalType))
			return false;
		return true;
	}
	

}
