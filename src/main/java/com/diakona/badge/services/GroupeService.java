package com.diakona.badge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.diakona.badge.models.Groupe;
import com.diakona.badge.repositories.GroupeRepository;

@Service
public class GroupeService {
    @Autowired
    private GroupeRepository groupeRepository;

    public List<Groupe> getAll() {
        return groupeRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Groupe getById(String id) {
        return groupeRepository.findById(id).orElse(null);
    }
}
