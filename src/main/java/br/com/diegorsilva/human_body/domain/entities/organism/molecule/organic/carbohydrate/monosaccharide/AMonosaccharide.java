package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.monosaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.ACarbohydrate;

/**
 * Represents a monosaccharide, the most basic form of carbohydrate (simple sugars).
 * <p>
 * Monosaccharides are the fundamental building blocks (monomers) from which all larger
 * carbohydrates (such as disaccharides, oligosaccharides, and polysaccharides) are constructed.
 * They typically consist of a single polyhydroxy aldehyde or ketone unit and cannot be
 * further hydrolyzed into simpler carbohydrates.
 * <p>
 * Common examples include Glucose (blood sugar), Fructose (fruit sugar), and Galactose.
 * They are essential sources of energy for biological processes.
 */
public abstract class AMonosaccharide extends ACarbohydrate {

    /**
     * Constructs a Monosaccharide.
     *
     * @param molecule The underlying molecular structure.
     */
    public AMonosaccharide(AMolecule molecule) {
        super(molecule);
    }
}