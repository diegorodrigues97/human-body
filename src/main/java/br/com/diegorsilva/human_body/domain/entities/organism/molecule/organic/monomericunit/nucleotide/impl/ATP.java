package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nucleotide.impl;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate.monosaccharide.pentose.Ribose;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nitrogenousbase.purine.Adenine;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.nucleotide.Nucleotide;

/**
 * Represents Adenosine Triphosphate (ATP), a complex organic chemical that provides energy to drive many processes in living cells.
 * <p>
 * ATP is often referred to as the "molecular unit of currency" of intracellular energy transfer. It captures chemical energy
 * obtained from the breakdown of food molecules and releases it to fuel other cellular processes.
 * <p>
 * As a nucleotide, ATP consists of three components:
 * <ul>
 *   <li>A nitrogenous base: {@link Adenine}</li>
 *   <li>A pentose sugar: {@link Ribose}</li>
 *   <li>Three phosphate groups, linked in series.</li>
 * </ul>
 * The high-energy bonds between the second and third phosphate groups are the source of its power. When a bond is broken
 * (hydrolyzed), energy is released, and ATP is converted to ADP (Adenosine Diphosphate).
 */
public class ATP extends Nucleotide {
    
    /**
     * Constructs a new ATP instance.
     * It is initialized by calling the super constructor with the specific components that define ATP:
     * an Adenine base, a Ribose sugar, and a count of 3 phosphate groups.
     */
    public ATP() {
        super(new Adenine(), new Ribose(), 3);
    }
}
