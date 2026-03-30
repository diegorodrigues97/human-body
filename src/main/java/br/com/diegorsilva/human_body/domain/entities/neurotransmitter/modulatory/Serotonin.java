package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.modulatory;

import br.com.diegorsilva.human_body.domain.entities.organic_molecule.Amine;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents Serotonin (5-hydroxytryptamine or 5-HT), a primary neuromodulator 
 * involved in regulating mood, appetite, sleep, and memory.
 * It is a monoamine derived from the amino acid Tryptophan.
 */
@Slf4j
public class Serotonin extends Amine implements IModulatoryNeurotransmitter {

    @Override
    public void modulateSignal() {
        log.info("Serotonin is modulating neural activity related to mood, sleep, and digestion.");
    }

    @Override
    public void bindToModulatoryReceptor() {
        log.info("Serotonin is binding to various 5-HT receptors (e.g., 5-HT1, 5-HT2).");
    }

    @Override
    public String getChemicalFormula() {
        return "C10H12N2O";
    }

    @Override
    public String getName() {
        return "Serotonin";
    }

    @Override
    public void transmitSignal() {

    }

    @Override
    public void bindToReceptor() {

    }

    @Override
    public boolean isMonoamine() {
        return true;
    }

    @Override
    public boolean isCatecholamine() {
        return false; // Serotonin is an indolamine, not a catecholamine.
    }
}