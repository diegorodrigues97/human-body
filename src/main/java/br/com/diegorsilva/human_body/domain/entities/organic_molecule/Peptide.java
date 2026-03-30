package br.com.diegorsilva.human_body.domain.entities.organic_molecule;

/**
 * Represents a Peptide, which is a short chain of amino acids linked by peptide bonds.
 * They can act as hormones, neurotransmitters (neuropeptides), or building blocks for proteins.
 */
public abstract class Peptide {

    /**
     * @return the number of amino acids in the peptide chain.
     */
    public abstract int getChainLength();

    /**
     * A neuropeptide is a peptide used by neurons to communicate.
     * @return true if this peptide acts as a neuropeptide in the nervous system.
     */
    public abstract boolean isNeuropeptide();
}
