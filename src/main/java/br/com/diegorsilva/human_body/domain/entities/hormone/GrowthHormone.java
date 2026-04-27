package br.com.diegorsilva.human_body.domain.entities.hormone;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents Growth Hormone (GH), a peptide hormone that stimulates growth, cell reproduction, and cell regeneration.
 */
@Slf4j
public class GrowthHormone implements IHormone {

    @Override
    public String getName() {
        return "Growth Hormone (GH)";
    }

    @Override
    public void regulate() {
        log.info("GH is stimulating growth, cell reproduction, and cell regeneration.");
    }
}
