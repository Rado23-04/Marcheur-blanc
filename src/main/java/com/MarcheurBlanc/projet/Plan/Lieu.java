package com.MarcheurBlanc.projet.Plan;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Lieu {
    private String name;
    private List<Rue> rue;

    public boolean memeRueQue (Lieu AutreLieu){
        return this.rue.equals(AutreLieu.getRue());
    }
}
