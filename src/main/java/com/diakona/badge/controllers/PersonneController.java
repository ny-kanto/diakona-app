package com.diakona.badge.controllers;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.diakona.badge.models.Categorie;
import com.diakona.badge.models.Groupe;
import com.diakona.badge.models.Personne;
import com.diakona.badge.services.PersonneService;
import com.diakona.badge.utils.IdGenerator;
import com.diakona.badge.services.GroupeService;
import com.diakona.badge.services.CategorieService;

@Controller
@RequestMapping("/personnes")
@RequiredArgsConstructor
public class PersonneController {

    private final PersonneService personneService;
    private final GroupeService groupeService;
    private final CategorieService categorieService;
    private final IdGenerator idGenerator;

    // ── Liste ──────────────────────────────────────────────────────────────
    @GetMapping
    public String index(@RequestParam(required = false) String groupeId, Model model) {

        List<Personne> personnes = (groupeId != null && !groupeId.isEmpty())
                ? personneService.getByGroupeId(groupeId)
                : List.of(); // tableau vide tant qu'aucun groupe n'est sélectionné

        model.addAttribute("femmes",
                personnes.stream().filter(p -> p.getGenre() == 2).toList());
        model.addAttribute("hommes",
                personnes.stream().filter(p -> p.getGenre() == 1).toList());

        model.addAttribute("groupes", groupeService.getAll());
        model.addAttribute("categories", categorieService.getAll());
        model.addAttribute("groupeSelectionne", groupeId);
        return "personnes/index";
    }

    @PostMapping
    public String create(
            @RequestParam String anarana,
            @RequestParam int genre,
            @RequestParam(required = false) String laharana,
            @RequestParam String groupeId,
            @RequestParam String categorieId,
            RedirectAttributes ra) {

        try {
            Personne personne = new Personne();
            personne.setAnarana(anarana);
            personne.setGenre(genre);
            personne.setLaharana(laharana);

            Groupe groupe = groupeService.getById(groupeId);
            personne.setGroupe(groupe);

            Categorie categorie = categorieService.getById(categorieId);
            personne.setCategorie(categorie);

            personne.setId(idGenerator);
            personneService.save(personne);

            ra.addFlashAttribute("success", "Personne créée avec succès.");
        } catch (Exception e) {
            ra.addFlashAttribute("error", "Erreur : " + e.getMessage());
        }

        return "redirect:/personnes?groupeId=" + groupeId;
    }

    @PostMapping("/{id}")
    public String update(
            @PathVariable String id,
            @RequestParam String anarana,
            @RequestParam int genre,
            @RequestParam(required = false) String laharana,
            @RequestParam String groupeId,
            @RequestParam String categorieId,
            RedirectAttributes ra) {

        try {
            Personne personne = new Personne();
            personne.setAnarana(anarana);
            personne.setGenre(genre);
            personne.setLaharana(laharana);

            Groupe groupe = groupeService.getById(groupeId);
            personne.setGroupe(groupe);

            Categorie categorie = categorieService.getById(categorieId);
            personne.setCategorie(categorie);

            personneService.update(id, personne);

            ra.addFlashAttribute("success", "Personne mise à jour.");
        } catch (Exception e) {
            ra.addFlashAttribute("error", "Erreur : " + e.getMessage());
        }

        return "redirect:/personnes?groupeId=" + groupeId;
    }
}
