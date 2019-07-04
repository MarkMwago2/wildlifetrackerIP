package models;
import static spark.Spark.*;
import org.sql2o.Connection;
import spark.ModelAndView;
import spark.template.handlebars.*;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        },new HandlebarsTemplateEngine());

    }}
