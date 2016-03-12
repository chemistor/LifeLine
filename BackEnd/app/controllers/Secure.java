package controllers;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.fasterxml.jackson.databind.JsonNode;

import models.BearerToken;
import models.User;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

public class Secure extends Controller{
	
	
	public Result token(){
		return ok(java.util.UUID.randomUUID().toString());
				
	}
	@BodyParser.Of(BodyParser.Json.class)	
	public Result sendAuthEmail(){
		JsonNode json = request().body().asJson();
		String email = json.get("email").asText();
		if(User.find.where().eq("email", email).findRowCount()==1){
			byte[] bytes= BearerToken.createBearerToken();
			BearerToken bt = new BearerToken();
			bt.token=bytes;
			bt.expireAt=LocalDate.now().plus(30,ChronoUnit.DAYS);
			return ok("ok");
		}else{
			return badRequest("Cannot find email:"+email );
		}

	}

}
