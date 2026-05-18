package br.com.diegorsilva.human_body.domain.entities.organism;

import br.com.diegorsilva.human_body.domain.entities.organism.cell.ICell;

import java.util.List;

public abstract class MulticellularOrganism extends Organism {
    private List<ICell> cells;
}
