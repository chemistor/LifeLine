package models;

import javax.persistence.Column;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;

public class Organization extends Model {

	@Column(length = 256, unique = true, nullable = false)
	@Constraints.MaxLength(256)
	@Constraints.Required
	@Constraints.Email
	public String emailAddress;
	
	public String organizationName;


}
