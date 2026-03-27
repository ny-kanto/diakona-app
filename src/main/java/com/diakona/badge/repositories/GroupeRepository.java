package com.diakona.badge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diakona.badge.models.Groupe;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, String> {
}
