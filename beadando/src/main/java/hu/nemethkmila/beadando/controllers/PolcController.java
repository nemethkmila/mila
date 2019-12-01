package hu.nemethkmila.beadando.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PolcController {
   @RequestMapping(value =  {"/polc"})
   public String index() {
      return "polc";
   }
}