package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.disaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Sucrose, a common disaccharide naturally found in many plants and plant parts.
 * <p>
 * It is often referred to as table sugar. Sucrose is formed by the condensation of one
 * molecule of glucose and one molecule of fructose, joined by a glycosidic bond.
 * <p>
 * Its chemical formula is C12H22O11.
 */
public class Sucrose extends ADisaccharide {

    /**
     * Constructs a new Sucrose instance.
     * It is initialized with its specific chemical formula ("C12H22O11") and its characteristic covalent bond type.
     */
    public Sucrose() {
        super(new AMolecule("C12H22O11", EMoleculeBondType.COVALENT) {});
    }
}
