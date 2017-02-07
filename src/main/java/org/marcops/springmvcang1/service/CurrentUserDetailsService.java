package org.marcops.springmvcang1.service;

import java.util.Optional;

import org.marcops.springmvcang1.model.CurrentUser;
import org.marcops.springmvcang1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CurrentUserDetailsService implements UserDetailsService {

	private UserRepository userRepository;

	@Override
	public CurrentUser loadUserByUsername(String loginName) throws UsernameNotFoundException {
		return new CurrentUser(Optional.ofNullable(userRepository.findByLoginName(loginName))
				.orElseThrow(() -> new UsernameNotFoundException(String.format("User %s was not found", loginName))));
	}

}
