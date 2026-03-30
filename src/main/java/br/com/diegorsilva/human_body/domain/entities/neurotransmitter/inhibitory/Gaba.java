package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.inhibitory;

import lombok.extern.slf4j.Slf4j;

/**
 * Represents Gamma-Aminobutyric Acid (GABA), the primary inhibitory neurotransmitter in the central nervous system.
 * It is derived from the amino acid Glutamate but is classified primarily as a neurotransmitter.
 */
@Slf4j
public class Gaba implements IInhibitoryNeurotransmitter {

    @Override
    public void inhibitSignal() {
        log.info("GABA is inhibiting neuronal excitability.");
    }

    @Override
    public void bindToInhibitoryReceptor() {
        log.info("GABA is binding to GABA_A and GABA_B receptors.");
    }

    @Override
    public String getChemicalFormula() {
        return "C4H9NO2";
    }

    @Override
    public String getName() {
        return "Gamma-Aminobutyric Acid";
    }

    @Override
    public void transmitSignal() {

    }

    @Override
    public void bindToReceptor() {

    }
}
