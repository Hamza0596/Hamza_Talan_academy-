package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.DTO.UserDto;
import com.example.demo.Entity.UserImpl;
import com.example.demo.Repository.UserRepository;
import com.example.demo.helper.ModelMapperConverter;


@org.springframework.stereotype.Service
public class UserService   implements UserDetailsService {
	
    private final PasswordEncoder passwordEncoder;


	UserRepository userRepository;
	
	private ModelMapperConverter modelMapperConverter;
	
	
	
	
	public UserService(PasswordEncoder passwordEncoder, UserRepository userRepository,
			ModelMapperConverter modelMapperConverter) {
		this.passwordEncoder = passwordEncoder;
		this.userRepository = userRepository;
		this.modelMapperConverter = modelMapperConverter;
	}


	public  List<UserImpl> getuserService() {
	    return userRepository.findAll();
	}
	
	
	public Optional<UserImpl> getUserByIdService(int id) {
		
		return userRepository.findById(id);
	}
	
	public String addUserService(UserImpl user) {
		    	userRepository.save(user);
		    	return "User ajouter avec succés";
	}
	
    public  void deleteUser(int id) {
    	userRepository.deleteById(id);
		
    }
    
	public  List<UserDto> getUserByRoleService(int role) {
	    return modelMapperConverter.mapAll(userRepository.findByRole(role),UserDto.class);
	}
    
	
	
	public UserDto getUserByMail(String mail) {
		return modelMapperConverter.toUserDto(userRepository.findByMail(mail));
	}
	
    public UserDto getUserByUsername(String username) {
        return modelMapperConverter.toUserDto(userRepository.findByPseudo(username));
    }
	
	   @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        UserImpl user = userRepository.findByPseudo(username);
	        if (user == null) {
	            throw new UsernameNotFoundException("User not found");
	        }
	        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
	        authorities.add(new SimpleGrantedAuthority(user.getRole().getName()));
	        return new User(user.getPseudo(), user.getPassword(), authorities);
	    }
	
	



}
