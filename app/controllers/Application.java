package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
    public static Result index() {
        return redirect(routes.Application.tasks());
    }

    public static Result tasks() {
        return TODO;
    }

    public static Result newTask() {
        return TODO;
    }

    public static Result deleteTask(Long id) {
        return TODO;
    }
}
