package com.payme.payme.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payme.payme.entity.Contact;

/*extends veut dire heriter dans la classe ContactRepo de type interface tout les templates des requetes sql de  la classe
 * JpaRepository ( un repository des requetes qui a deja les modeles de queries select,insert,update,delete que la library JPA nous offres)
 * Contact,Integer> veut dire en héritant des modeles de JPA reformatte les requetes p/rapport aux noms des champs
 * se trouvant dans l'entité Contact (qui est mappé a la table payme_db.contact dans la db)
 * ainsi Integer voudrais dire qu'il s'y trouve un champ qui a une clé primaire de type Integer qui doit etre preservée
 * l'annotation @Repository pour dire a springboot que c'est une classe qui va aider à manipuler la DB
 * extends fait heriter de la classe de type interface ContactRepo des propriétés de JpaRepository
 * */

@Repository
public interface ContactRepo extends JpaRepository<Contact,Integer> {
	
}
