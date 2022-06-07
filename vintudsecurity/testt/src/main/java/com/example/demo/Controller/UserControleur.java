package com.example.demo.Controller;

import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.example.demo.DTO.UserDto;
import com.example.demo.Entity.UserImpl;
import com.example.demo.Service.UserService;
import com.example.demo.security.JWTUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class UserControleur {

	public UserControleur() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private UserService userService;

	
	
    @PreAuthorize("hasAuthority('USER')")
	 @GetMapping("/users")	
	public  List<UserImpl> getuser() {
	    return userService.getuserService();
	}
    
	 
	 
    @GetMapping("/usersbyid/{id}")	
   	public  Optional<UserImpl> getUserById(@PathVariable(value="id") int id) {   	
  	    return userService.getUserByIdService(id);
   	}
    
    
    @PostMapping("/addUser")
    public void addUser(@RequestBody UserImpl user) {
    	userService.addUserService(user);
    	
    }
    
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUserByid(@PathVariable(value="id") int id) {
    	userService.deleteUser(id);
    }
    

    @GetMapping("/getbyid/{role}")
    	public  List<UserDto> getUserByRole(@PathVariable(value="role") int role) {
	    return userService.getUserByRoleService(role);

    	}
    
    @GetMapping("/mail/{mail}")
	public  UserDto getUserByMail(@PathVariable(name="mail" )String mail) {
    return userService.getUserByMail(mail);

	}
    
    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
    @GetMapping("/refreshToken")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String authorizationHeader = request.getHeader(AUTHORIZATION);
        if (authorizationHeader != null && authorizationHeader.startsWith(JWTUtil.PREFIX)) {
            try {
                String refresh_token = authorizationHeader.substring(JWTUtil.PREFIX.length());
                Algorithm algorithm = Algorithm.HMAC256(JWTUtil.SECRET.getBytes());
                JWTVerifier verifier = JWT.require(algorithm).build();
                DecodedJWT decodedJWT = verifier.verify(refresh_token);
                String username = decodedJWT.getSubject();
                UserDto user = userService.getUserByUsername(username);
                String access_token = JWT.create()
                        .withSubject(user.getPseudo())
                        .withExpiresAt(new Date(System.currentTimeMillis() + JWTUtil.EXPIRE_ACCESS_TOKEN))
                        .withIssuer(request.getRequestURL().toString())
                        .withClaim("roles", user.getRole().getName())
                        .sign(algorithm);
                Map<String, String> tokens = new HashMap<>();
                tokens.put("access_token", access_token);
                tokens.put("refresh_token", refresh_token);
                response.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), tokens);
            } catch (Exception exception) {
                response.setHeader("error", exception.getMessage());
                response.setStatus(FORBIDDEN.value());
            }
        }
    }
    
    
    }
    


