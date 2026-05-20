package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase.purine;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase.ANitrogenousBase;

public abstract class APurine extends ANitrogenousBase {

    public APurine(String chemicalFormula, EMoleculeBondType bondType) {
        super(chemicalFormula, bondType);
    }
}
