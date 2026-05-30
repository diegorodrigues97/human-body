package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.polysaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Starch, a polymeric carbohydrate consisting of numerous glucose units joined by glycosidic bonds.
 * <p>
 * Starch is the most common carbohydrate in human diets and is the primary energy storage molecule for most green plants.
 * It is produced by most green plants as energy storage.
 * <p>
 * The general chemical formula is (C6H10O5)n, where 'n' is a large, variable number of monomers.
 */
public class Starch extends APolysaccharide {

    /**
     * Constructs a new Starch instance.
     * It is initialized with its general chemical formula ("(C6H10O5)n") and its characteristic covalent bond type.
     */
    public Starch() {
        super(new AMolecule("(C6H10O5)n", EMoleculeBondType.COVALENT) {});
    }
}
