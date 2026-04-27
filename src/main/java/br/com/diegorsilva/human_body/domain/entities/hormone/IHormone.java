package br.com.diegorsilva.human_body.domain.entities.hormone;

/**
 * Defines the contract for a hormone in the human body.
 */
public interface IHormone {
    
    /**
     * Gets the name of the hormone.
     * @return the hormone's name
     */
    String getName();

    /**
     * Performs the regulatory functions of the hormone.
     */
    void regulate();
}
