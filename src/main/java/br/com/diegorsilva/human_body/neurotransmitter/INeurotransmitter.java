package br.com.diegorsilva.human_body.neurotransmitter;

/**
 * Defines the contract for a neurotransmitter, a type of chemical messenger
 * that transmits signals across a chemical synapse.
 */
public interface INeurotransmitter {

    /**
     * Transmits a neural signal.
     */
    void transmitSignal();

    /**
     * Binds to a specific postsynaptic receptor.
     */
    void bindToReceptor();

    String getChemicalFormula();
}