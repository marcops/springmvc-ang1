package org.marcops.springmvcang1.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.marcops.springmvcang1.model.Role;
import org.marcops.springmvcang1.model.User;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

	private User user;
	private final Long ID = 1l;
	private final String LOGIN_NAME = "USER";
	private final String PASSWD = "PASSWD";

	@Before
	public void setup() throws Exception {
		user = new User();
		user.setRole(Role.ADMIN);
		user.setLoginName(LOGIN_NAME);
		user.setId(ID);
		user.setPwd(PASSWD);
		user.setEnabled(Boolean.TRUE);
	}

	@Test
	public void getRoleOK() {
		assertNotNull(user);
		assertEquals(Role.ADMIN, user.getRole());
	}

	@Test
	public void getLoginNameOK() {
		assertNotNull(user);
		assertEquals(LOGIN_NAME, user.getLoginName());
	}

	@Test
	public void getPasswordOK() {
		assertNotNull(user);
		assertEquals(PASSWD, user.getPwd());
	}

	@Test
	public void getIdOK() {
		assertNotNull(user);
		assertEquals(ID, user.getId());
	}

	@Test
	public void getEnabledOK() {
		assertNotNull(user);
		assertEquals(Boolean.TRUE, user.getEnabled());
	}
}
