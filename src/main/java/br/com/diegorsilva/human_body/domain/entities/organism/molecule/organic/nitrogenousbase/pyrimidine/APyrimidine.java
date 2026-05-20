package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase.pyrimidine;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase.ANitrogenousBase;

public abstract class APyrimidine extends ANitrogenousBase {
    public APyrimidine(String chemicalFormula, EMoleculeBondType bondType) {
        super(chemicalFormula, bondType);
    }
}
