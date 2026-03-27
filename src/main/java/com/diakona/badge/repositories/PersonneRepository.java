package com.diakona.badge.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.diakona.badge.models.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, String> {
    List<Personne> findByGroupeId(String groupeId, Sort sort);
}
