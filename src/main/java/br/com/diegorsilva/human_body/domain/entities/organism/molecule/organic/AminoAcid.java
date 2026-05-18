package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic;

/**
 * Defines the contract for an amino acid, the organic compounds that combine to form proteins.
 */
public abstract class AminoAcid {

    /**
     * Gets the common name of the amino acid.
     *
     * @return The name of the amino acid (e.g., "Alanine").
     */
    public abstract String getName();

    /**
     * Gets the three-letter code for the amino acid.
     *
     * @return The three-letter abbreviation (e.g., "Ala").
     */
    public abstract String getThreeLetterCode();

    /**
     * Gets the one-letter code for the amino acid.
     *
     * @return The one-letter abbreviation (e.g., "A").
     */
    public abstract String getOneLetterCode();

    /**
     * Checks if the amino acid is essential, meaning it cannot be synthesized
     * by the human body and must be obtained from the diet.
     * @return true if the amino acid is essential, false otherwise.
     */
    public abstract boolean isEssential();
}
