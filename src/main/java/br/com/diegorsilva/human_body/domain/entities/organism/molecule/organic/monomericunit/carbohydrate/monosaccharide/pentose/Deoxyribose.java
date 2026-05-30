package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide.pentose;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Deoxyribose (more precisely 2-deoxyribose), a pentose monosaccharide with the chemical formula C5H10O4.
 * <p>
 * It is a modified sugar, differing from ribose by the absence of one oxygen atom at the 2' carbon position.
 * Deoxyribose is the fundamental sugar component of the sugar-phosphate backbone in DNA (deoxyribonucleic acid).
 */
public class Deoxyribose extends APentose {

    /**
     * Constructs a new Deoxyribose instance.
     * It is initialized with its specific chemical formula ("C5H10O4") and its characteristic covalent bond type.
     */
    public Deoxyribose() {
        super(new AMolecule("C5H10O4", EMoleculeBondType.COVALENT) {});
    }
}
