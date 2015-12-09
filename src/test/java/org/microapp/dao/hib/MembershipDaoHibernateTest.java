package org.microapp.dao.hib;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.microapp.dao.base.MembershipDao;
import org.microapp.model.Membership;
import org.springframework.beans.factory.annotation.Autowired;

import org.microapp.dao.hib.base.BaseDaoTestCase;

public class MembershipDaoHibernateTest extends BaseDaoTestCase {

	@Autowired
	private MembershipDao membershipDao;
	
	@Test
	public void getAllTest() {
		//there are memberships
		List<Membership> mships = membershipDao.getAll();
		assertFalse(mships.isEmpty());
	}
	
}
