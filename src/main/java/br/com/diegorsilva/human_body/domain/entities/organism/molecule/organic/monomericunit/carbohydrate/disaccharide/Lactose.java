package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.disaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Lactose, a disaccharide sugar derived from galactose and glucose.
 * <p>
 * It makes up around 2-8% of milk (by weight) and is often referred to as milk sugar.
 * The two monosaccharides are joined by a β-1→4 glycosidic linkage.
 * <p>
 * Its chemical formula is C12H22O11.
 */
public class Lactose extends ADisaccharide {

    /**
     * Constructs a new Lactose instance.
     * It is initialized with its specific chemical formula ("C12H22O11") and its characteristic covalent bond type.
     */
    public Lactose() {
        super(new AMolecule("C12H22O11", EMoleculeBondType.COVALENT) {});
    }
}
