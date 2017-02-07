package org.marcops.springmvcang1.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.marcops.springmvcang1.Application;
import org.marcops.springmvcang1.model.CurrentUser;
import org.marcops.springmvcang1.service.CurrentUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CurrentUserDetailsServiceTest {

	@Autowired
	private CurrentUserDetailsService currentUserDetailsService;

	private final String USERNAME_MARCO = "marco";
	private final String USERNAME_INVALID = "**INVALID**";

	@Test
	public void loadUserByUsernameSuccess() {
		CurrentUser currentUser = currentUserDetailsService.loadUserByUsername(USERNAME_MARCO);
		assertNotNull(currentUser);
		assertEquals(USERNAME_MARCO, currentUser.getUsername());
	}
	
	@Test(expected=UsernameNotFoundException.class)
	public void loadUserByUsernameException() {
		currentUserDetailsService.loadUserByUsername(USERNAME_INVALID);
	}

}
