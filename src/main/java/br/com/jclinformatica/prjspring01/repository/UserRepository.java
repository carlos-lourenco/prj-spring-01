package br.com.jclinformatica.prjspring01.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.jclinformatica.prjspring01.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
