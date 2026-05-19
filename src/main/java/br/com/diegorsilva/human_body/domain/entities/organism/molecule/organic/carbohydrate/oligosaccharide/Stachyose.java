package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.oligosaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Stachyose, a tetrasaccharide consisting of two α-D-galactose units,
 * one α-D-glucose unit, and one β-D-fructose unit sequentially linked.
 * <p>
 * Stachyose is naturally found in numerous vegetables and plants, especially in legumes like
 * soybeans and beans. Like raffinose, it is not completely digestible by humans.
 * <p>
 * Its chemical formula is C24H42O21.
 */
public class Stachyose extends AOligosaccharide {

    /**
     * Constructs a new Stachyose instance.
     * It is initialized with its specific chemical formula ("C24H42O21") and its characteristic covalent bond type.
     */
    public Stachyose() {
        super(new AMolecule("C24H42O21", EMoleculeBondType.COVALENT) {});
    }
}
