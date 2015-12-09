package org.microapp.dao.jpa;

import java.util.List;

import org.microapp.dao.base.MembershipDao;
import org.microapp.dao.jpa.base.GenericDaoJpa;
import org.microapp.model.Membership;
import org.springframework.stereotype.Repository;

@Repository("membershipDaoJpa")
public class MembershipDaoJpa extends GenericDaoJpa<Membership, Long> implements
		MembershipDao {

	public MembershipDaoJpa() {
		super(Membership.class);
		// TODO Auto-generated constructor stub
	}

	public List<Membership> getAllForPerson(long personId) {
		// TODO Auto-generated method stub
		return null;
	}


}
