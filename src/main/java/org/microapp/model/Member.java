package org.microapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.microapp.model.base.BaseObject;

/**
 * Used to mock member table.
 * @author Zdenda
 *
 */
@Entity
@Table(name="member")
public class Member extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length=50)
	private String name;
	
	@OneToMany(mappedBy="member")
	private List<Membership> memberships;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
