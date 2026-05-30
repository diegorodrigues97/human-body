package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Glucose, a simple sugar (monosaccharide) with the chemical formula C6H12O6.
 * <p>
 * Glucose is the most abundant monosaccharide and a central molecule in biology. It is the primary source of energy
 * for most living organisms through cellular respiration and serves as a key building block for larger carbohydrates,
 * such as starch, cellulose, and glycogen.
 * <p>
 * It is classified as a hexose, meaning it contains six carbon atoms.
 */
public class Glucose extends AMonosaccharide {

    /**
     * Constructs a new Glucose instance.
     * It is initialized with its specific chemical formula ("C6H12O6"), its characteristic covalent bond type,
     * and its classification as a 6-carbon sugar.
     */
    public Glucose() {
        super(new AMolecule("C6H12O6", EMoleculeBondType.COVALENT) {});
    }
}
