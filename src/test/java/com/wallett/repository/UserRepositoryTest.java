package com.wallett.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.wallett.entity.User;

@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {
	private static final String EMAIL = "email@teste.com";
	
	@Autowired
	UserRepository repository;
	
	@BeforeEach
	public void setUp() {
		User u = new User();
		
		u.setName(" Set up User");
		u.setPassword("Senha123");
		u.setEmail(EMAIL);
		
		repository.save(u);
	}
	
	@AfterEach
	public void tearDown() {
		
		repository.deleteAll();
	}
	
	@Test
	public void testSave() {
		User u = new User();
		
		u.setName("Teste");
		u.setPassword("1234");
		u.setEmail("teste@teste.com");
		
		User response = repository.save(u);
		
		assertNotNull(response);
	}
	
	public void testFindByEamil() {
		Optional< User > response = repository.findByEmailEquals(EMAIL);
		
		assertTrue(response.isPresent());
		
		assertEquals(response.get().getEmail(), EMAIL);
		
	}
}
