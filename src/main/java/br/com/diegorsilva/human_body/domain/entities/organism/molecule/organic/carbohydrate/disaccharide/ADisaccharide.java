package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.disaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.ACarbohydrate;

/**
 * Represents a disaccharide, a type of carbohydrate formed when two monosaccharide
 * molecules are joined together by a glycosidic linkage.
 * <p>
 * Like monosaccharides, they are simple sugars and are soluble in water. Disaccharides
 * are one of the four chemical groupings of carbohydrates. The most common examples
 * include Sucrose (table sugar, formed by glucose and fructose) and Lactose (milk sugar,
 * formed by galactose and glucose).
 */
public abstract class ADisaccharide extends ACarbohydrate {
   
    /**
     * Constructs a Disaccharide.
     *
     * @param molecule The underlying molecular structure representing the bonded disaccharide.
     */
    public ADisaccharide(AMolecule molecule) {
        super(molecule);
    }
}
