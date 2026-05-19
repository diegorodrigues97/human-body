package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.polysaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Cellulose, a polysaccharide consisting of a linear chain of several hundred to many thousands of β(1→4) linked D-glucose units.
 * <p>
 * Cellulose is the most abundant organic polymer on Earth. It is a major structural component of the primary cell wall of green plants,
 * many forms of algae and the oomycetes.
 * <p>
 * The general chemical formula is (C6H10O5)n, where 'n' is a large, variable number of monomers.
 */
public class Cellulose extends APolysaccharide {

    /**
     * Constructs a new Cellulose instance.
     * It is initialized with its general chemical formula ("(C6H10O5)n") and its characteristic covalent bond type.
     */
    public Cellulose() {
        super(new AMolecule("(C6H10O5)n", EMoleculeBondType.COVALENT) {});
    }
}
