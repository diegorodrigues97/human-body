package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nucleotide.impl;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide.pentose.Ribose;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nitrogenousbase.purine.Adenine;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nucleotide.Nucleotide;

/**
 * Represents Adenosine Diphosphate (ADP), an organic compound essential for energy transfer in living cells.
 * <p>
 * ADP is the product of ATP hydrolysis, where one phosphate group is removed from ATP to release energy.
 * It can be re-phosphorylated back to ATP by processes like cellular respiration and photosynthesis, thus completing the ATP-ADP cycle.
 * <p>
 * As a nucleotide, ADP consists of:
 * <ul>
 *   <li>A nitrogenous base: {@link Adenine}</li>
 *   <li>A pentose sugar: {@link Ribose}</li>
 *   <li>Two phosphate groups.</li>
 * </ul>
 */
public class ADP extends Nucleotide {
    
    /**
     * Constructs a new ADP instance.
     * It is initialized by calling the super constructor with the specific components that define ADP:
     * an Adenine base, a Ribose sugar, and a count of 2 phosphate groups.
     */
    public ADP() {
        super(new Adenine(), new Ribose(), 2);
    }
}
