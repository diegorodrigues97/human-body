package br.com.diegorsilva.human_body.domain.entities.organism;

import br.com.diegorsilva.human_body.domain.entities.organism.cell.ICell;

public abstract class CellularOrganism extends Organism {
    private ICell cell;
}
