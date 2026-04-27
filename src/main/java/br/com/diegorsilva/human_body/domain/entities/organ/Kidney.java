package br.com.diegorsilva.human_body.domain.entities.organ;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents the Kidney, a vital organ whose main function is to filter blood, 
 * removing waste and excess water to make urine.
 */
@Slf4j
public class Kidney implements IOrgan {

    @Override
    public String getName() {
        return "Kidney";
    }

    @Override
    public void performFunctions() {
        log.info("The kidneys are filtering blood, removing waste products, and balancing body fluids.");
    }
}
