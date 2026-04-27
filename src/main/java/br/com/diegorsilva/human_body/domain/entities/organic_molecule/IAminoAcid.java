package br.com.diegorsilva.human_body.domain.entities.organic_molecule;

public interface IAminoAcid {
    String getName();
    String getThreeLetterCode();
    String getOneLetterCode();
    boolean isEssential();
}
