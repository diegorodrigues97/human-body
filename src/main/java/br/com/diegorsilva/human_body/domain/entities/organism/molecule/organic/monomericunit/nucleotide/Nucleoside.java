package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nucleotide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide.pentose.APentose;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nitrogenousbase.ANitrogenousBase;
import lombok.Getter;

/**
 * Represents a nucleoside, a structural subunit of nucleic acids.
 * <p>
 * A nucleoside consists of exactly two fundamental molecular components covalently bonded together:
 * <ul>
 *   <li>A nitrogenous base (e.g., Adenine, Guanine, Cytosine, Thymine, Uracil).</li>
 *   <li>A five-carbon sugar (a pentose: either Ribose or Deoxyribose).</li>
 * </ul>
 * <p>
 * It serves as the immediate precursor to a nucleotide. When one or more phosphate groups
 * are attached to the pentose sugar of a nucleoside, the entire complex becomes a nucleotide.
 */
@Getter
public abstract class Nucleoside {
    
    /**
     * The nitrogenous base component (purine or pyrimidine) attached to the pentose sugar.
     */
    protected final ANitrogenousBase nitrogenousBase;
    
    /**
     * The five-carbon sugar component (Ribose or Deoxyribose).
     */
    protected final APentose pentose;

    /**
     * Constructs a Nucleoside.
     *
     * @param nitrogenousBase The specific nitrogenous base.
     * @param pentose         The specific pentose sugar.
     */
    public Nucleoside(ANitrogenousBase nitrogenousBase, APentose pentose) {
        this.nitrogenousBase = nitrogenousBase;
        this.pentose = pentose;
    }
}
