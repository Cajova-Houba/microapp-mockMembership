package org.microapp.dao.jpa;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.microapp.dao.base.MembershipDao;
import org.microapp.dao.jpa.base.BaseDaoTestCase;
import org.microapp.model.Membership;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

public class MembershipDaoJpaTest extends BaseDaoTestCase {

	@Autowired
	@Qualifier("membershipDaoJpa")
	private MembershipDao membershipDao;
	
	@Test
	public void testGetAll() {
		//there are memberships
		List<Membership> mships = membershipDao.getAll();
		
		assertFalse(mships.isEmpty());
	}
}
