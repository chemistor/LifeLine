package models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;

@Entity
public class User extends Model {

	@Id
	public UUID user_id;

	@Column(length = 256, unique = true, nullable = false)
	@Constraints.MaxLength(256)
	@Constraints.Required
	@Constraints.Email
	public String email;
	
	public User(String email){
		super();
		this.email=email;
	}

	@Column
	public String roles;

	public static Finder<String, User> find = new Finder<String, User>(User.class);

}
