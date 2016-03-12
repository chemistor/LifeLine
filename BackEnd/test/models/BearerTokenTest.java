package models;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BearerTokenTest {

	

	@Test
	public void testTokenNotEmpty() throws Exception {

		byte[] bytes = BearerToken.createBearerToken();
		assertFalse(Arrays.equals(bytes, new byte[32]));


	}

}
