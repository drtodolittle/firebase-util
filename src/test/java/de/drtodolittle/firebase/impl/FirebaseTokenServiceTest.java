/**
 * 
 */
package de.drtodolittle.firebase.impl;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/**
 * @author Guenther_D
 *
 */
public class FirebaseTokenServiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() throws FileNotFoundException {
		FirebaseOptions options = new FirebaseOptions.Builder()
				.setServiceAccount(new FileInputStream("DrToDoLittle-10b9f17b6eb3.json"))
				.setDatabaseUrl("https://drtodolittle.firebaseio.com/").build();
		FirebaseApp.initializeApp(options);
		FirebaseTokenService tokenService = new FirebaseTokenService();
		String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImM5OWE4YTY0YjI0NDRlOWI3N2U5MTRkZWM2M2FmMDRjYzZmMTVkODMifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vZHJ0b2RvbGl0dGxlIiwibmFtZSI6IkRpcmsgR8O8bnRoZXIiLCJwaWN0dXJlIjoiaHR0cHM6Ly9saDMuZ29vZ2xldXNlcmNvbnRlbnQuY29tLy1xQW51ZWVqQ3RuVS9BQUFBQUFBQUFBSS9BQUFBQUFBQVBDVS9pRGVSNDZCekxycy9zOTYtYy9waG90by5qcGciLCJhdWQiOiJkcnRvZG9saXR0bGUiLCJhdXRoX3RpbWUiOjE0NzA3ODAzOTYsInVzZXJfaWQiOiI2c3M5Q2liWWk5UjVCTExmNWpzT0NmNWlVUFYyIiwic3ViIjoiNnNzOUNpYllpOVI1QkxMZjVqc09DZjVpVVBWMiIsImlhdCI6MTQ3MDc4MDM5NiwiZXhwIjoxNDcwNzgzOTk2LCJlbWFpbCI6ImRpcmNoa2luZ0Bnb29nbGVtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJmaXJlYmFzZSI6eyJpZGVudGl0aWVzIjp7Imdvb2dsZS5jb20iOlsiMTA4NDkxMjQyNjU0NTQ4ODA4MTE0Il0sImVtYWlsIjpbImRpcmNoa2luZ0Bnb29nbGVtYWlsLmNvbSJdfSwic2lnbl9pbl9wcm92aWRlciI6Imdvb2dsZS5jb20ifX0.xTNb63kdX7rfw8m4JC6vQbCDnhQ6Vx4S-EmcJ2xAr7zEfip1rObngeAkTcF5kAYFu7bnrZc3ZgMUsoM0_ecxWyAkMCvW1vAZbgiVc_jgd6f9KlqEKb-k9ohbiFwiivC7_RG-2LsB1SpQHjuiG1XdtZ1Ie5C-70OL3ggemznP5_2-ZhTxyhQeNtXn562vm7OKZtBJROjTCpHUjmsAy96uBcNwzj6z9DjG0pHLtomSXOp9YKEtc_8Fs03Qh6LMFROwdRVfWvKrpG_FZlt3js360JZqhJ797jt2S6Pt_TASRFjE29bxqrA3ZB27femSlT4_9cjx4-oNbuwfgquL1oxtDw";
		String email = tokenService.verify(token);
		assertEquals("Email must be dirchking@googlemail.com", "dirchking@googlemail.com", email);
	}

}
