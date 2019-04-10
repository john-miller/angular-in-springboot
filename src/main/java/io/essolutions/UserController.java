package io.essolutions;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
public class UserController {

	private List<User> users = Arrays.asList(
		new User("123", "jmill", "Jonathan"),
		new User("123", "jdoe", "Jane"),
		new User("123", "tuser", "Test")
	);
	
	@GetMapping("/api/users")
	public ResponseEntity<?> getUsers() {
		return ResponseEntity.ok(users);
	}
	
	
	@Data
	@AllArgsConstructor
	public static class User {
		private String userId;
		private String username;
		private String firstName;
	}
	
	
}
