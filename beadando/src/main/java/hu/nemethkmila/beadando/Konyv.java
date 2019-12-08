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
    
    @Column(nullable = false)
    private int kiadaseve;
 
    
   
    
    public Konyv()
    {
    }
    
    public Konyv(String cim, String szerzo, int kiadaseve) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadaseve = kiadaseve;
    }
    
    public String fgv()
    {
    	return this.cim + " " + this.szerzo + " " + this.kiadaseve +"<br>";
    }
}
