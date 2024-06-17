package com.MarcheurBlanc.projet;

import com.MarcheurBlanc.projet.Plan.Lieu;
import com.MarcheurBlanc.projet.Plan.Rue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Marcher {
    public List<Lieu> vaMarcher(Lieu lieuDeDepart, Lieu lieuDeDestination) {
        // MARAIS
        List<Rue> listeRueMarais = new ArrayList<>();
        Rue rueOne = new Rue("One");
        Lieu Marais = new Lieu("Marais", listeRueMarais);
        listeRueMarais.add(rueOne);

        // SEKOLONTSIKA
        List<Rue> listeRueSekolontsika = new ArrayList<>();
        Lieu Sekolontsika = new Lieu("Sekolontsika", listeRueSekolontsika);
        Rue rueTwo = new Rue("Rue Sekolontsika");
        listeRueSekolontsika.add(rueOne);
        listeRueSekolontsika.add(rueTwo);

        // HEI
        List<Rue> listeRueHei = new ArrayList<>();
        Lieu HEI = new Lieu("HEI", listeRueHei);
        Rue rueThree = new Rue("Rue Andrihatsihorana");
        Rue rueFour = new Rue("Rue Balançoire");
        listeRueHei.add(rueTwo);
        listeRueHei.add(rueThree);
        listeRueHei.add(rueFour);

        //Pullman
        List<Rue> listeRuePullman = new ArrayList<>();
        Lieu Pullman = new Lieu("Pullman", listeRuePullman);
        Rue rueFive = new Rue("Rue Ranaivo");
        Rue ruesix = new Rue("Rue Nexta");
        listeRuePullman.add(rueThree);
        listeRuePullman.add(rueFive);
        listeRuePullman.add(ruesix);

        Destination destination = new Destination(HEI);
        Marcheur marcheur = new Marcheur(Marais);
        List<Lieu> resultat = new ArrayList<>();
        List<Lieu> listeLieu = new ArrayList<>();
        listeLieu.add(Marais);
        listeLieu.add(HEI);
        listeLieu.add(Pullman);
        listeLieu.add(Sekolontsika);
        Lieu lieuAleatoire = selectionAleatoire(listeLieu);


        while (marcheur.getLieuDeDepart() != destination.getLieuDestination()) {
            if (lieuAleatoire.getRue() == marcheur.getLieuDeDepart().getRue()) {
                lieuAleatoire = marcheur.getLieuDeDepart();
                resultat.add(lieuAleatoire);
            }

        }

        return resultat;

    }

    public static Lieu selectionAleatoire(List<Lieu> listeLieu) {
        Random rand = new Random();
        int indexAleatoire = rand.nextInt(listeLieu.size());
        return listeLieu.get(indexAleatoire);
    }

    public static void main(String[] args) {
        // MARAIS
        List<Rue> listeRueMarais = new ArrayList<>();
        Rue rueOne = new Rue("One");
        Lieu Marais = new Lieu("Marais", listeRueMarais);
        listeRueMarais.add(rueOne);

        // SEKOLONTSIKA
        List<Rue> listeRueSekolontsika = new ArrayList<>();
        Lieu Sekolontsika = new Lieu("Sekolontsika", listeRueSekolontsika);
        Rue rueTwo = new Rue("Rue Sekolontsika");
        listeRueSekolontsika.add(rueOne);
        listeRueSekolontsika.add(rueTwo);

        // HEI
        List<Rue> listeRueHei = new ArrayList<>();
        Lieu HEI = new Lieu("HEI", listeRueHei);
        Rue rueThree = new Rue("Rue Andrihatsihorana");
        Rue rueFour = new Rue("Rue Balançoire");
        listeRueHei.add(rueTwo);
        listeRueHei.add(rueThree);
        listeRueHei.add(rueFour);

        //Pullman
        List<Rue> listeRuePullman = new ArrayList<>();
        Lieu Pullman = new Lieu("Pullman", listeRuePullman);
        Rue rueFive = new Rue("Rue Ranaivo");
        Rue ruesix = new Rue("Rue Nexta");
        listeRuePullman.add(rueThree);
        listeRuePullman.add(rueFive);
        listeRuePullman.add(ruesix);

        Marcher marcher = new Marcher();
        System.out.println(marcher.vaMarcher(Marais, HEI));
    }
}
/*
 while (marcheur.getLieuDeDepart()!=destination.getLieuDestination()){
            List<Lieu> listeLieu = new ArrayList<>();
            listeLieu.add(Marais);
            listeLieu.add(HEI);
            listeLieu.add(Pullman);
            listeLieu.add(Sekolontsika);
            Lieu lieuAleatoire = selectionAleatoire(listeLieu);

           if(lieuAleatoire.getRue()== marcheur.getLieuDeDepart().getRue()){
               resultat.add(lieuAleatoire);
           }


        }
 */