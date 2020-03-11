package com.bezkoder.springjwt;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSecurityJwtApplicationTests {

	  @Test
	  public void generate_encrypted_password() {
	    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    String rawPassword = "kailashdj";
	    String encodedPassword = encoder.encode(rawPassword);
	    
	    System.out.println(encodedPassword);
	    
	    assertThat(rawPassword, not(encodedPassword));
	  }
}
