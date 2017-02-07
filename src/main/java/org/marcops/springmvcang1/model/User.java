package org.marcops.springmvcang1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(nullable = false)
	private String loginName;

	@Column(nullable = false)
	private String pwd;

	@Column(nullable = false)
	private Boolean enabled;

	@Column(name = "role", nullable = false)
	@Enumerated(EnumType.STRING)
	private Role role;

}
