package com.MarcheurBlanc.projet.Plan;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Carte {
    private List<Lieu> lieu;
}
