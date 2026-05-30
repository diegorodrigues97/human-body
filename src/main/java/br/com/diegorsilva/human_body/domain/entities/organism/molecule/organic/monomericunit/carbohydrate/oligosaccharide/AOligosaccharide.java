package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.oligosaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.ACarbohydrate;

/**
 * Represents an oligosaccharide, a saccharide polymer containing a small number (typically 3 to 10) of monosaccharides.
 * <p>
 * Oligosaccharides can have many functions including cell recognition and cell binding.
 * They are normally present as glycans linked to lipids or to compatible amino acid side chains in proteins.
 */
public abstract class AOligosaccharide extends ACarbohydrate {
    
    /**
     * Constructs an Oligosaccharide.
     *
     * @param molecule The underlying molecular structure.
     */
    public AOligosaccharide(AMolecule molecule) {
        super(molecule);
    }
}
