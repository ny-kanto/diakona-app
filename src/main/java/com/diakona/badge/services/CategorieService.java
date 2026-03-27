package com.diakona.badge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diakona.badge.models.Categorie;
import com.diakona.badge.repositories.CategorieRepository;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getAll() {
        return categorieRepository.findAll();
    }

    public Categorie getById(String id) {
        return categorieRepository.findById(id).orElse(null);
    }
}
