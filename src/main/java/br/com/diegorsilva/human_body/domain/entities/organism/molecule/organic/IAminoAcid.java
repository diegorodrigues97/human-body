package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic;

public interface IAminoAcid {
    String getName();
    String getThreeLetterCode();
    String getOneLetterCode();
    boolean isEssential();
}
