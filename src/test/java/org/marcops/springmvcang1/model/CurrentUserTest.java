package org.marcops.springmvcang1.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.marcops.springmvcang1.model.CurrentUser;
import org.marcops.springmvcang1.model.Role;
import org.marcops.springmvcang1.model.User;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CurrentUserTest {

	private User user;
	private final Long ID = 1l;
	private final String LOGIN_NAME = "USER";
	private final String PASSWD = "PASSWD";

	@Before
	public void setup() throws Exception {
		user = new User();
		user.setRole(Role.NORMAL);
		user.setLoginName(LOGIN_NAME);
		user.setId(ID);
		user.setPwd(PASSWD);
	}

	@Test
	public void contructorOK() {
		CurrentUser currentUser = new CurrentUser(user);
		assertNotNull(currentUser);
	}

	@Test
	public void getUserOK() {
		CurrentUser currentUser = new CurrentUser(user);
		assertNotNull(currentUser);
		assertEquals(user, currentUser.getUser());
	}

	@Test
	public void getIdOK() {
		CurrentUser currentUser = new CurrentUser(user);
		assertNotNull(currentUser);
		assertEquals(ID, currentUser.getId());
	}

	@Test
	public void getRoleOK() {
		CurrentUser currentUser = new CurrentUser(user);
		assertNotNull(currentUser);
		assertEquals(Role.NORMAL, currentUser.getRole());
	}

}