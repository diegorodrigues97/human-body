package br.com.diegorsilva.human_body.aminoacid;

/**
 * Defines the contract for an amino acid, the organic compounds that combine to form proteins.
 */
public interface IAminoAcid {

    /**
     * Gets the common name of the amino acid.
     *
     * @return The name of the amino acid (e.g., "Alanine").
     */
    String getName();

    /**
     * Gets the three-letter code for the amino acid.
     *
     * @return The three-letter abbreviation (e.g., "Ala").
     */
    String getThreeLetterCode();

    /**
     * Gets the one-letter code for the amino acid.
     *
     * @return The one-letter abbreviation (e.g., "A").
     */
    String getOneLetterCode();

    /**
     * Checks if the amino acid is essential, meaning it cannot be synthesized
     * by the human body and must be obtained from the diet.
     * @return true if the amino acid is essential, false otherwise.
     */
    boolean isEssential();
}