package model.entities.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DBUtil {   //classe che restituisce l'Entity Manager
	
	public static final String RUBRICA_WEB_PU = "RubricaWeb"; 

	public static EntityManager getEntityManager(String s) {
		return Persistence.createEntityManagerFactory(s).createEntityManager();  //gli viene passata la persistence unit configurata nel file persistence.xml
	}
}

