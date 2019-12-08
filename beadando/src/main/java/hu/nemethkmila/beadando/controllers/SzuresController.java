package hu.nemethkmila.beadando.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SzuresController {
	   @RequestMapping(value =  {"/szures"})
	   public String index() {
	      return "szures";
	   }
}