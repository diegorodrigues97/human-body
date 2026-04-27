package br.com.diegorsilva.human_body.domain.entities.hormone;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents Cortisol, a steroid hormone produced by the adrenal glands.
 */
@Slf4j
public class Cortisol implements IHormone {

    @Override
    public String getName() {
        return "Cortisol";
    }

    @Override
    public void regulate() {
        log.info("Cortisol is regulating a wide range of processes throughout the body, including metabolism and the immune response to stress.");
    }
}
