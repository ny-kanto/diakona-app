package com.diakona.badge.models;

import com.diakona.badge.utils.IdGenerator;
import com.diakona.badge.utils.Utils;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categorie")
public class Categorie {
    @Id
    private String id;

    private String anarana;

    private String acronyme;

    public void setId(IdGenerator idGenerator) {
        String id = "";
        id = idGenerator.generateId("CAT", "categorie_seq");
        this.id = id;
    }

    public String getAnarana() {
        return Utils.capitalizeFirstLetter(anarana);
    }

    public void setAnarana(String anarana) {
        String cleanAnarana = anarana.trim();
        cleanAnarana = cleanAnarana.replaceAll("\\s+", " ");
        this.anarana = cleanAnarana.toLowerCase();
    }
}
