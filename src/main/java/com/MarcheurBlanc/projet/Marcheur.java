package com.MarcheurBlanc.projet;

import com.MarcheurBlanc.projet.Plan.Lieu;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Marcheur {
    private Lieu lieuDeDepart;
    private Lieu lieuDarrivee;
}
