package models;

import com.avaje.ebean.Ebean;

public class InitialData {
	 public InitialData() {

	        if (Ebean.find(User.class).findRowCount() == 0) {
//	        	new User("test1@demo.com").save();
//	        	new User("test2@demo.com").save();
//	        	new User("test3@demo.com").save();
	        }
	    }
}
