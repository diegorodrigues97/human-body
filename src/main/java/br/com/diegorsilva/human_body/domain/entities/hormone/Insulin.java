package br.com.diegorsilva.human_body.domain.entities.hormone;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents Insulin, a peptide hormone produced by beta cells of the pancreatic islets.
 */
@Slf4j
public class Insulin implements IHormone {

    @Override
    public String getName() {
        return "Insulin";
    }

    @Override
    public void regulate() {
        log.info("Insulin is regulating the metabolism of carbohydrates, fats, and protein by promoting the absorption of glucose from the blood.");
    }
}
