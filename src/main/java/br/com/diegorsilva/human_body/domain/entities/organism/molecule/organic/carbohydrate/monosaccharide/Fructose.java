package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.monosaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Fructose, a simple ketonic monosaccharide found in many plants.
 * <p>
 * It is an isomer of glucose, meaning it has the same chemical formula (C6H12O6) but a different
 * structural arrangement of its atoms. Fructose is known as "fruit sugar" and is the sweetest
 * of all naturally occurring carbohydrates.
 */
public class Fructose extends AMonosaccharide {

    /**
     * Constructs a new Fructose instance.
     * It is initialized with its specific chemical formula ("C6H12O6") and its characteristic covalent bond type.
     */
    public Fructose() {
        super(new AMolecule("C6H12O6", EMoleculeBondType.COVALENT) {});
    }
}
