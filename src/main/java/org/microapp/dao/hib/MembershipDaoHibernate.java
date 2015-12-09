package org.microapp.dao.hib;

import java.util.List;

import org.microapp.dao.base.MembershipDao;
import org.microapp.dao.hib.base.GenericDaoHibernate;
import org.microapp.model.Membership;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("membershipDao")
@Transactional
public class MembershipDaoHibernate extends
		GenericDaoHibernate<Membership, Long> implements MembershipDao {

	public MembershipDaoHibernate() {
		super(Membership.class);
		// TODO Auto-generated constructor stub
	}

	public List<Membership> getAllForPerson(long personId) {
		// TODO Auto-generated method stub
		return null;
	}

}
