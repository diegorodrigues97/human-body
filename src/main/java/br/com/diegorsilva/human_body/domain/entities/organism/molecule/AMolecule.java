package br.com.diegorsilva.human_body.domain.entities.organism.molecule;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Represents a fundamental molecule, an electrically neutral group of two or more atoms
 * held together by chemical bonds. Molecules are the smallest fundamental units of a
 * chemical compound that can take part in a chemical reaction.
 * <p>
 * This abstract base class provides the fundamental properties common to all specific
 * molecules, such as its chemical formula and the primary type of chemical bond holding
 * its atoms together.
 */
@Getter
@RequiredArgsConstructor
public abstract class AMolecule {

    /**
     * The chemical formula of the molecule (e.g., "H2O", "C6H12O6", "O2").
     * Represents the types and numbers of atoms in the molecule.
     */
    protected final String chemicalFormula;

    /**
     * The primary type of chemical bond holding the molecule together (e.g., Covalent).
     */
    protected final EMoleculeBondType bondType;

}
