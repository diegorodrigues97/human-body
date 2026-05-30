package br.com.diegorsilva.human_body.domain.entities.organism.cell;

import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.Cytoplasm;
import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.PlasmaMembrane;
import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.Ribosome;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.macromolecule.geneticmaterial.IGeneticMaterial;

public class Archaeal extends Cell {
    public Archaeal(PlasmaMembrane plasmaMembrane, Cytoplasm cytoplasm, Ribosome ribosome, IGeneticMaterial geneticMaterial) {
        super(plasmaMembrane, cytoplasm, ribosome, geneticMaterial);
    }
}
