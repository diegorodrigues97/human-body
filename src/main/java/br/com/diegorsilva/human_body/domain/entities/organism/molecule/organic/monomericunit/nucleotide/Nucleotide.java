package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nucleotide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide.pentose.APentose;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nitrogenousbase.ANitrogenousBase;
import lombok.Getter;

/**
 * Represents a nucleotide, the basic building block (monomer) of nucleic acids like DNA and RNA.
 * <p>
 * A nucleotide is an organic molecule that extends a nucleoside (a nitrogenous base + a pentose sugar)
 * by adding at least one phosphate group to the sugar component.
 * <p>
 * The three distinct components of a nucleotide are:
 * <ul>
 *   <li>A nitrogenous base (inherited from {@link Nucleoside}).</li>
 *   <li>A five-carbon sugar (inherited from {@link Nucleoside}).</li>
 *   <li>At least one phosphate group.</li>
 * </ul>
 * <p>
 * Nucleotides also play central roles in cellular metabolism (e.g., ATP), cell signaling, and enzymatic reactions.
 */
@Getter
public abstract class Nucleotide extends Nucleoside {
    
    /**
     * The number of phosphate groups attached to the pentose sugar of the nucleoside base.
     * Usually 1 (monophosphate), 2 (diphosphate), or 3 (triphosphate).
     */
    protected int phosphateCount;

    /**
     * Constructs a Nucleotide.
     *
     * @param nitrogenousBase The specific nitrogenous base.
     * @param pentose         The specific pentose sugar.
     * @param phosphateCount  The number of phosphate groups.
     */
    public Nucleotide(
            ANitrogenousBase nitrogenousBase,
            APentose pentose,
            int phosphateCount) {
        
        super(nitrogenousBase, pentose);
        
        this.phosphateCount = phosphateCount;
    }
}
