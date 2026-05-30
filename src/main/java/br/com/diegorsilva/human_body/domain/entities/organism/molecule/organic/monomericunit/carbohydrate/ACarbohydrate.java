package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.monomericunit.carbohydrate;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import lombok.Getter;

/**
 * Represents a carbohydrate (saccharide), an organic biomolecule consisting of carbon (C), hydrogen (H), and oxygen (O) atoms.
 * Carbohydrates are one of the main structural and energetic components of living organisms.
 * <p>
 * Their general empirical formula is often written as Cm(H2O)n, which led to the term "hydrate of carbon",
 * though there are many exceptions.
 */
@Getter
public abstract class ACarbohydrate {

    protected final AMolecule molecule;

    public ACarbohydrate(AMolecule molecule) {
        this.molecule = molecule;
    }
}
