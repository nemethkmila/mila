package hu.nemethkmila.beadando.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class styleController {
	   @RequestMapping(value =  {"/style.css"})
	   public String index() {
	      return "style.css";
	   }
}