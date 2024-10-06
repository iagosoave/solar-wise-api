package com.solarwise.api.repository;

import org.springframework.stereotype.Repository;

import com.solarwise.api.models.UserPessoaJuridica;

@Repository
public interface UserPessoaJuridicaRepository extends UserRepository {

	UserPessoaJuridica findByCnpj(String cnpj);
}
