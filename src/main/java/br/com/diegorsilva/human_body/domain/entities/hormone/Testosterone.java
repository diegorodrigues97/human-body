package br.com.diegorsilva.human_body.domain.entities.hormone;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents Testosterone, the primary sex hormone and anabolic steroid in males.
 */
@Slf4j
public class Testosterone implements IHormone {

    @Override
    public String getName() {
        return "Testosterone";
    }

    @Override
    public void regulate() {
        log.info("Testosterone is regulating sex differentiation, producing male sex characteristics, and promoting muscle mass and strength.");
    }
}
