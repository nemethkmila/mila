package hu.nemethkmila.beadando.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.nemethkmila.beadando.Konyv;

@RestController
public class KonyvController {
	
	@Autowired
	private JpaKonyvRepo repository;

	@RequestMapping(value = "/rest/UjKonyv", method = RequestMethod.POST)
	  public String ujKonyv(@RequestParam(value="cim", defaultValue="") String cim, @RequestParam(value="szerzo", defaultValue="") String szerzo) {
		if(cim != "" && szerzo != "") {
			Konyv ujkonyv = new Konyv(cim, szerzo);
			repository.save(ujkonyv);
			return "Konyv rogzitve";
			}
		else
			return "Sikertelen";
	  }
	
	@RequestMapping("/rest/KonyvAdatok")
	  public String konyvAdatok(@RequestParam(value="id", defaultValue="0") int id) {
	    return repository.findById(id).toString();
	  }
	
	@RequestMapping("/rest/Polc")
	  public String polc() {
		String[] tmp= {""};
		repository.findAll().forEach(x -> tmp[0]+=x.ekrhghjergh()+"\n");
		return tmp[0];
	  }
}
