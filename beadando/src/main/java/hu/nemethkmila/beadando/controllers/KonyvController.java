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
	  public String ujKonyv(@RequestParam(value="cim", defaultValue="") String cim, @RequestParam(value="szerzo", defaultValue="") String szerzo, @RequestParam(value="kiadaseve", defaultValue="0") int kiadaseve) {
		if(cim != "" && szerzo != "") {
			Konyv ujkonyv = new Konyv(cim, szerzo, kiadaseve);
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
	
	@RequestMapping("/rest/KonyvSzures")
	  public String konyvSzures(@RequestParam(value="year", defaultValue="2000") int year) {
		String[] tmp= {""};
	    repository.findByRY(year).forEach(x -> tmp[0]+=x.fgv()+"\n");
	    return tmp[0];
	  }
	
	@RequestMapping("/rest/Polc")
	  public String polc() {
		String[] tmp= {""};
		repository.findAll().forEach(x -> tmp[0]+=x.fgv()+"\n");
		return tmp[0];
	  }
}
