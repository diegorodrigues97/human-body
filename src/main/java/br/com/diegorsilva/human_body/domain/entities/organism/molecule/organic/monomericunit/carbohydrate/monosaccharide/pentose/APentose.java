package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide.pentose;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide.AMonosaccharide;

/**
 * Represents a pentose, a monosaccharide (simple sugar) with five carbon atoms.
 * <p>
 * Pentoses are crucial in biochemistry, most notably as fundamental structural components
 * of nucleic acids. The most biologically significant pentoses are Ribose (found in RNA)
 * and Deoxyribose (found in DNA).
 */
public abstract class APentose extends AMonosaccharide {
    
    /**
     * Constructs a Pentose.
     *
     * @param molecule The underlying molecular structure.
     */
    public APentose(AMolecule molecule) {
        super(molecule);
    }
}
