package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.monosaccharide.pentose;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Ribose, a pentose monosaccharide with the chemical formula C5H10O5.
 * <p>
 * Ribose is a critical component of ribonucleic acid (RNA) and serves as the structural
 * backbone of the RNA polymer. It is also a component of ATP (adenosine triphosphate),
 * NADH, and various other important biomolecules.
 */
public class Ribose extends APentose {

    /**
     * Constructs a new Ribose instance.
     * It is initialized with its specific chemical formula ("C5H10O5") and its characteristic covalent bond type.
     */
    public Ribose() {
        super(new AMolecule("C5H10O5", EMoleculeBondType.COVALENT) {});
    }
}
