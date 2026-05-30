package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.polysaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.ACarbohydrate;

/**
 * Represents a polysaccharide, a long chain of carbohydrate molecules, specifically polymers of monosaccharides.
 * <p>
 * These complex carbohydrates can be linear or highly branched in structure. They often have a role in structural
 * support (e.g., cellulose) or energy storage (e.g., glycogen, starch).
 */
public abstract class APolysaccharide extends ACarbohydrate {
    
    /**
     * Constructs a Polysaccharide.
     *
     * @param molecule The underlying molecular structure.
     */
    public APolysaccharide(AMolecule molecule) {
        super(molecule);
    }
}
