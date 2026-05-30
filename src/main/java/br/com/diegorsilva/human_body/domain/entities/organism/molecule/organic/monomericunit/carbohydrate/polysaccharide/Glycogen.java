package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.polysaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Glycogen, a multibranched polysaccharide of glucose that serves as a form of energy storage in animals, fungi, and bacteria.
 * <p>
 * It is the main form of glucose storage in the body, primarily stored in the liver and skeletal muscle.
 * Its structure is similar to amylopectin (a component of starch) but is more extensively branched.
 * <p>
 * The general chemical formula is (C6H10O5)n, where 'n' represents a large number of repeating glucose units.
 */
public class Glycogen extends APolysaccharide {

    /**
     * Constructs a new Glycogen instance.
     * It is initialized with its general chemical formula ("(C6H10O5)n") and its characteristic covalent bond type.
     */
    public Glycogen() {
        super(new AMolecule("(C6H10O5)n", EMoleculeBondType.COVALENT) {});
    }
}
