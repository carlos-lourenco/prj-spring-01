package br.com.jclinformatica.prjspring01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jclinformatica.prjspring01.domain.User;
import br.com.jclinformatica.prjspring01.dto.UserDTO;
import br.com.jclinformatica.prjspring01.repository.UserRepository;
import br.com.jclinformatica.prjspring01.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
		
	}
	
	public User findById(String id) throws ObjectNotFoundException {
		return userRepository.findById(id)
				.orElseThrow(()->new ObjectNotFoundException("Usuário não encontrado"));		
	}
	
	public User insert (User obj) {
		return userRepository.insert(obj);
	}
	
	public User fromDTO (UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
	public void delete(String id) {
		findById(id);
		userRepository.deleteById(id);;
	}
}
