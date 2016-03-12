package controllers;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import models.User;
import play.Logger;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller {

	public Result getUsers() {
		List<User> users = User.find.all();

	    return ok(Json.toJson(users));
	}

	@BodyParser.Of(BodyParser.Json.class)
	public Result setupUser() {
		JsonNode json = request().body().asJson();
		Logger.info(json.toString());
		
		User user = Json.fromJson(json, User.class);
		Logger.info(user.toString());
		user.save();
		return ok("saved");

	}
	

	@BodyParser.Of(BodyParser.Json.class)
	public Result setupMentor() {
		JsonNode json = request().body().asJson();
		Logger.info(json.toString());
		
		User user = Json.fromJson(json, User.class);

		Logger.info(user.toString());
		user.save();
		return ok("saved");

	}	

}
