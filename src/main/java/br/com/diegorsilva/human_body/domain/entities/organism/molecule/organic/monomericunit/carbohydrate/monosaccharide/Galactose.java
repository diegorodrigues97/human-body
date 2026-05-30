package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Galactose, a monosaccharide sugar that is about as sweet as glucose.
 * <p>
 * It is an isomer of glucose, having the same chemical formula (C6H12O6) but a different
 * structural arrangement. Galactose is a critical component of glycoproteins and glycolipids
 * and is most commonly found combined with glucose to form the disaccharide lactose (milk sugar).
 */
public class Galactose extends AMonosaccharide {

    /**
     * Constructs a new Galactose instance.
     * It is initialized with its specific chemical formula ("C6H12O6") and its characteristic covalent bond type.
     */
    public Galactose() {
        super(new AMolecule("C6H12O6", EMoleculeBondType.COVALENT) {});
    }
}
