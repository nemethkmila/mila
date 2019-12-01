package hu.nemethkmila.beadando;

import javax.persistence.*;

@Entity
@Table(name = "KONYV")
public class Konyv {
	
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(nullable = false)
    private String cim;
    
    @Column(nullable = false)
    private String szerzo;
 
    
   
    
    public Konyv()
    {
    }
    
    public Konyv(String cim, String szerzo) {
        this.cim = cim;
        this.szerzo = szerzo;
    }
    
    public String ekrhghjergh()
    {
    	return this.cim + " " + this.szerzo;
    }
}
