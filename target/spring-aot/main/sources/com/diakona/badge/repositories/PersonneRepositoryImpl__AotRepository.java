package com.diakona.badge.repositories;

import com.diakona.badge.models.Personne;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.DeclaredQuery;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link PersonneRepository}.
 */
@Generated
public class PersonneRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public PersonneRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link PersonneRepository#findByGroupeId(java.lang.String,org.springframework.data.domain.Sort)}.
   */
  public List<Personne> findByGroupeId(String groupeId, Sort sort) {
    String queryString = "SELECT p FROM Personne p WHERE p.groupe.id = :groupeId";
    if (sort.isSorted()) {
      DeclaredQuery declaredQuery = DeclaredQuery.jpqlQuery(queryString);
      queryString = rewriteQuery(declaredQuery, sort, Personne.class);
    }
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("groupeId", groupeId);

    return (List<Personne>) query.getResultList();
  }
}
