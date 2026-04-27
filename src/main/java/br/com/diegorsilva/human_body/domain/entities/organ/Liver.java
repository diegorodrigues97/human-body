package br.com.diegorsilva.human_body.domain.entities.organ;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents the Liver, a vital organ that detoxifies various metabolites, 
 * synthesizes proteins, and produces biochemicals necessary for digestion.
 */
@Slf4j
public class Liver implements IOrgan {

    @Override
    public String getName() {
        return "Liver";
    }

    @Override
    public void performFunctions() {
        log.info("The liver is detoxifying chemicals, metabolizing drugs, and secreting bile.");
    }
}
