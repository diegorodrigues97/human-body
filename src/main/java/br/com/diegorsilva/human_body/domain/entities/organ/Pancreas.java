package br.com.diegorsilva.human_body.domain.entities.organ;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents the Pancreas, an organ of the digestive system and endocrine system 
 * of vertebrates.
 */
@Slf4j
public class Pancreas implements IOrgan {

    @Override
    public String getName() {
        return "Pancreas";
    }

    @Override
    public void performFunctions() {
        log.info("The pancreas is producing digestive enzymes and secreting hormones like insulin and glucagon.");
    }
}
