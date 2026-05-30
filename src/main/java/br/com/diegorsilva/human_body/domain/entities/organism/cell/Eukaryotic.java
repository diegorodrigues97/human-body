package br.com.diegorsilva.human_body.domain.entities.organism.cell;

import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.Cytoplasm;
import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.PlasmaMembrane;
import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.Ribosome;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.macromolecule.geneticmaterial.IGeneticMaterial;

public class Eukaryotic extends Cell{
    public Eukaryotic(PlasmaMembrane plasmaMembrane, Cytoplasm cytoplasm, Ribosome ribosome, IGeneticMaterial geneticMaterial) {
        super(plasmaMembrane, cytoplasm, ribosome, geneticMaterial);
    }
}
