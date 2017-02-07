package org.marcops.springmvcang1.repository;

import org.marcops.springmvcang1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByLoginName(String loginName);

}
