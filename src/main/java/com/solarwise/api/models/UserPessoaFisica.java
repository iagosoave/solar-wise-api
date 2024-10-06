package com.solarwise.api.models;

import java.util.Set; 

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("PESSOA_FISICA")
public class UserPessoaFisica extends User {

	static final long serialVersionUID = 1L;

	@NotBlank
	private String cpf;

	public UserPessoaFisica(Long id, String name, String email, String password, Set<Role> roles, String cpf) {
		super(id, name, email, password, roles);
		this.cpf = cpf;
	}
}
