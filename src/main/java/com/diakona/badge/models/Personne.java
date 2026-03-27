package com.diakona.badge.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.diakona.badge.utils.IdGenerator;
import com.diakona.badge.utils.Utils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personne")
public class Personne {
    @Id
    private String id;

    private String anarana;

    private int genre;

    private String laharana;

    @ManyToOne
    @JoinColumn(name = "id_groupe", referencedColumnName = "id")
    private Groupe groupe;

    @ManyToOne
    @JoinColumn(name = "id_categorie", referencedColumnName = "id")
    private Categorie categorie;

    public void setId(IdGenerator idGenerator) {
        String id = "";
        String prefix =  this.getGroupe().getAcronyme() + "-" + this.getCategorie().getAcronyme() + "-" + this.getGenreAcro();
        id = idGenerator.generateId(prefix);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String genreForm() {
        if (this.genre == 1) {
            return "Lehilahy";
        } else {
            return "Vehivavy";
        }
    }

    public int getGenre() {
        return this.genre;
    }

    public String getGenreAcro() {
        return this.genre == 1 ? "L" : "V";
    }
}
