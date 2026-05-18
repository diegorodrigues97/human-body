package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.modulatory;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.Amine;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents Dopamine, a major neuromodulator in the brain involved in reward, motivation, memory, and attention.
 * It is a catecholamine derived from the amino acid Tyrosine.
 */
@Slf4j
public class Dopamine extends Amine implements IModulatoryNeurotransmitter {

    @Override
    public void modulateSignal() {
        log.info("Dopamine is modulating neural activity related to reward and motor control.");
    }

    @Override
    public void bindToModulatoryReceptor() {
        log.info("Dopamine is binding to D1-like and D2-like dopamine receptors.");
    }

    @Override
    public String getChemicalFormula() {
        return "C8H11NO2";
    }

    @Override
    public String getName() {
        return "Dopamine";
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
        return true; // Dopamine is the precursor to norepinephrine and epinephrine.
    }
}