package com.spngjps.jpaconn.accessingmysqldb;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spngjps.jpaconn.accessingmysqldb.model.CreateUserRequestModel;

@RestController
public class FrontController {

	private UserRepository userRepo;


	public FrontController(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@PostMapping(path="/add") // Map ONLY POST Requests
	  public ResponseEntity<User> addNewUser (@RequestBody CreateUserRequestModel userDtls) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request


	    User n = new User();
	    
	    n.setEmail(userDtls.getEmail());
	    n.setName(userDtls.getName());
	    userRepo.save(n);
	    return ResponseEntity.status(HttpStatus.CREATED).body(n);
	  }

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepo.findAll();
	}
}
