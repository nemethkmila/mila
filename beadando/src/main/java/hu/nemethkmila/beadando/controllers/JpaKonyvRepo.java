package hu.nemethkmila.beadando.controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hu.nemethkmila.beadando.Konyv;

import java.util.List;

public interface JpaKonyvRepo extends CrudRepository<Konyv, Long> {
	
	public final static String GET_KONYV_BY_ID = "select et from Konyv et where ID = :id";
	public final static String GET_KONYV_BY_RY = "select et from Konyv et where kiadaseve = :kiadaseve";

    List<Konyv> findByCim(String cim);
    
    @Query(GET_KONYV_BY_ID)
    Konyv findById(@Param("id") int id);
    
    @Query(GET_KONYV_BY_RY)
    List<Konyv> findByRY(@Param("kiadaseve") int kiadaseve);

}