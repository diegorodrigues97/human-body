package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nucleotide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.monosaccharide.pentose.APentose;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase.ANitrogenousBase;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class Nucleotide {
    protected final ANitrogenousBase nitrogenousBase;
    protected final APentose pentose;
    protected int phosphateCount;
}
