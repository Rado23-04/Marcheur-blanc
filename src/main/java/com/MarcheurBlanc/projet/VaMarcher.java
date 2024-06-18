package com.MarcheurBlanc.projet;


import com.MarcheurBlanc.projet.Plan.Lieu;


import java.util.*;

public class VaMarcher {

    public static void main(String[] args) {
        List<Lieu> heiConnecte = new ArrayList<>();
        List<Lieu> Pullman = new ArrayList<>();
        List<Lieu> Esti = new ArrayList<>();
        List<Lieu> Nexta = new ArrayList<>();
        List<Lieu> Balancoire = new ArrayList<>();
        List<Lieu> Boulevard = new ArrayList<>();
        List<Lieu> Sekolontsika = new ArrayList<>();
        List<Lieu> Marais = new ArrayList<>();

        // Création des lieux
        Lieu hei = new Lieu("HEI",heiConnecte);
        Lieu pullman = new Lieu("Pullman",Pullman);
        Lieu balangoire = new Lieu("Balangoire",Balancoire);
        Lieu esti = new Lieu("ESTI",Esti);
        Lieu nexta = new Lieu("Nexta",Nexta);
        Lieu boulevard = new Lieu("Boulevard de l'Europe",Boulevard);
        Lieu sekolintsika = new Lieu("Sekolintsika",Sekolontsika);
        Lieu marais = new Lieu("Marais",Marais);

        heiConnecte.add(pullman);
        heiConnecte.add(sekolintsika);
        heiConnecte.add(balangoire);

        Pullman.add(hei);
        Pullman.add(nexta);
        Pullman.add(balangoire);

        Esti.add(balangoire);
        Esti.add(boulevard);

        Nexta.add(pullman);

        Balancoire.add(hei);
        Balancoire.add(pullman);
        Balancoire.add(boulevard);
        Balancoire.add(esti);

        Boulevard.add(balangoire);
        Boulevard.add(esti);

        Sekolontsika.add(marais);
        Sekolontsika.add(hei);

        Marais.add(sekolintsika);

        randomWalk(hei, esti);
    }
    public static void randomWalk(Lieu start, Lieu destination) {
        Random rand = new Random();
        List<Lieu> visited = new ArrayList<>();
        Lieu current = start;

        System.out.println("Départ: " + current.getName());

        while (!current.getName().equals(destination.getName())) {
            visited.add(current);
            List<Lieu> neighbors = current.getLieuConnecte();
            List<Lieu> unvisitedNeighbors = new ArrayList<>();

            for (Lieu neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    unvisitedNeighbors.add(neighbor);
                }
            }

            if (unvisitedNeighbors.isEmpty()) {
                System.out.println("Aucun chemin non visité trouvé, la marche aléatoire s'arrête.");
                return;
            }

            current = unvisitedNeighbors.get(rand.nextInt(unvisitedNeighbors.size()));
            System.out.println("Visite: " + current.getName());
        }


    }
}
