package br.com.diegorsilva.human_body.domain.entities.organic_molecule;

/**
 * Represents an Ester, a chemical compound derived from an acid in which at least one -OH group
 * is replaced by an -O-alkyl group. Acetylcholine is an example of an ester (an ester of acetic acid and choline).
 */
public abstract class Ester {

    /**
     * @return true if the ester is derived from acetic acid, which is a key trait of Acetylcholine.
     */
    public abstract boolean isAcetateEster();
}
