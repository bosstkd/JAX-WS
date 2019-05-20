/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author administrateur
 */
public class employee {
    private String id;
    private String nom;
    private String poste;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public employee(String id, String nom, String poste) {
        this.id = id;
        this.nom = nom;
        this.poste = poste;
    }
    
    
    public String toString(){
        return "je m'appel "+nom+" mon poste est "+poste+" sous l'id: "+id;
    }
    
}
