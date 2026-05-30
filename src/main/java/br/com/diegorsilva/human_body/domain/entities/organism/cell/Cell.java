package br.com.diegorsilva.human_body.domain.entities.organism.cell;

import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.Cytoplasm;
import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.PlasmaMembrane;
import br.com.diegorsilva.human_body.domain.entities.organism.cell.component.Ribosome;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.macromolecule.geneticmaterial.IGeneticMaterial;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Cell implements ICell {
    private PlasmaMembrane plasmaMembrane;
    private Cytoplasm cytoplasm;
    private Ribosome ribosome;
    private IGeneticMaterial geneticMaterial;

    @Override
    public void selfReplication() {

    }

    @Override
    public void catalysis() {

    }

    @Override
    public void homeostasis() {

    }
}
