package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase.family;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.IMolecule;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Represents the two main families of nitrogenous bases found in nucleic acids (DNA and RNA).
 * The primary distinction between the families is their chemical structure, specifically the number of carbon-nitrogen rings.
 */
@Getter
@RequiredArgsConstructor
public enum ENitrogenousBaseFamily implements IMolecule {
    
    /**
     * Purines are larger molecules composed of a double-ring structure (one six-membered ring fused to one five-membered ring).
     * The primary purines are Adenine (A) and Guanine (G).
     */
    PURINE("C5H4N4", 2),

    /**
     * Pyrimidines are smaller molecules composed of a single six-membered ring structure.
     * The primary pyrimidines are Cytosine (C), Thymine (T), and Uracil (U).
     */
    PYRIMIDINE("C4H4N2", 1);
    
    /**
     * The fundamental chemical formula of the base ring structure.
     */
    private final String chemicalFormula;

    /**
     * The number of carbon-nitrogen rings in the chemical structure of the base family.
     */
    private final int numberOfRings;
}
