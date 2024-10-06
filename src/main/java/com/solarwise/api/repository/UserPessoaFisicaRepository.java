package com.solarwise.api.repository;

import org.springframework.stereotype.Repository;

import com.solarwise.api.models.UserPessoaFisica;

@Repository
public interface UserPessoaFisicaRepository extends UserRepository {

	UserPessoaFisica findByCpf(String cpf);
}
