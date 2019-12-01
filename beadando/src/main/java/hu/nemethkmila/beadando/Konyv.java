package hu.nemethkmila.beadando;

import javax.persistence.*;

@Entity
@Table(name = "KONYV")
public class Konyv {
	
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;
 
    @Column(nullable = false)
    private String cim;
    
    @Column(nullable = false)
    private String szerzo;
 
    @Column(nullable = false)
    private int ajanlottkorhatar;
    
   
    
    public Konyv()
    {
    }
    
    public Konyv(String cim, String szerzo, int ajanlottkorhatar) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ajanlottkorhatar = ajanlottkorhatar;
    }
    
    public String toString() {
    	return id + ": " + cim + " " + szerzo + " " + ajanlottkorhatar + "ev " ;
    }
    
    public String getDetails()
    {
    	return id + ";" + cim + ";" + szerzo + " " + ajanlottkorhatar + "ev " ;
    }
}
