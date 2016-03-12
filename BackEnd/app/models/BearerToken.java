package models;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;

public class BearerToken extends Model {

	@Id
	public Long id;

	@ManyToOne
	public User user;

	@Column
	public byte[] token;

	@Column
	public LocalDate expireAt;

	public static byte[] createBearerToken() {

		byte[] bytes = new byte[32];
		try {
			java.security.SecureRandom.getInstanceStrong().nextBytes(bytes);
			byte[] encodedBytes = Base64.getEncoder().encode(bytes);
			return encodedBytes;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new IllegalStateException("Missing random number generator.");
		}
	}

}
