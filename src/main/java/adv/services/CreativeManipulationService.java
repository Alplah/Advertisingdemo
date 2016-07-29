package adv.services;

import adv.domains.Creative;
import adv.dtos.AdvRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class CreativeManipulationService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Creative> getCreatives(AdvRequest request) {
        String hqlQuery = "FROM Creative c WHERE c.country = :country and os = :os ORDER BY RAND()";
        Query query = entityManager.createQuery(hqlQuery);
        query.setParameter("country", request.getCountry());
        query.setParameter("os", request.getOs());
        query.setMaxResults(request.getLimit());
        return (List<Creative>)query.getResultList();
    }
}
