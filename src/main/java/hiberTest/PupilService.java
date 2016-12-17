package hiberTest;

import hiberTest.Pupil;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by sovarugby on 12.12.16.
 */
public class PupilService {

    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();

    public Pupil add(Pupil pupil){
        em.getTransaction().begin();
        Pupil pupilFromDB = em.merge(pupil);
        em.getTransaction().commit();
        return pupilFromDB;
    }

    public void delete(int id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Pupil get(int id){
        return em.find(Pupil.class, id);
    }

    public void update(Pupil pupil){
        em.getTransaction().begin();
        em.merge(pupil);
        em.getTransaction().commit();
    }

    public List<Pupil> getAll(){
        TypedQuery<Pupil> namedQuery = em.createNamedQuery("Pupil.getAll", Pupil.class);
        return namedQuery.getResultList();
    }

}
