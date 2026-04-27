package br.com.diegorsilva.human_body.domain.entities.organ;

/**
 * Defines the contract for an organ in the human body.
 */
public interface IOrgan {
    
    /**
     * Gets the name of the organ.
     * @return the organ's name
     */
    String getName();

    /**
     * Performs the primary functions of the organ.
     */
    void performFunctions();
}
