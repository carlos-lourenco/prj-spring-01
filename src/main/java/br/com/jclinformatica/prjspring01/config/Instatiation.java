package br.com.jclinformatica.prjspring01.config;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.jclinformatica.prjspring01.domain.User;
import br.com.jclinformatica.prjspring01.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");	
		
		userRepository.insert(Arrays.asList(maria, alex, bob));
	}

}
