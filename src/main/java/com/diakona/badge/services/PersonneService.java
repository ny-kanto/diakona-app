package com.diakona.badge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Sort;

import com.diakona.badge.models.Personne;
import com.diakona.badge.repositories.PersonneRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonneService {
    @Autowired
    private PersonneRepository personneRepository;

    public List<Personne> getAll() {
        return personneRepository.findAll();
    }

    public Personne getById(String id) {
        return personneRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Personne introuvable : " + id));
    }

    public Personne save(Personne personne) {
        return personneRepository.save(personne);
    }

    public Personne update(String id, Personne personne) {
        Personne existing = getById(id);
        existing.setAnarana(personne.getAnarana());
        existing.setGenre(personne.getGenre());
        existing.setLaharana(personne.getLaharana());
        existing.setGroupe(personne.getGroupe());
        existing.setCategorie(personne.getCategorie());
        return personneRepository.save(existing);
    }

    public List<Personne> getByGroupeId(String groupeId) {
        return personneRepository.findByGroupeId(
                groupeId,
                Sort.by(Sort.Direction.ASC, "id"));
    }

    // public void deleteById(String id) {
    // if (!personneRepository.existsById(id)) {
    // throw new EntityNotFoundException("Personne introuvable : " + id);
    // }
    // personneRepository.deleteById(id);
    // }
}
