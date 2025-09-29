package br.com.diegorsilva.human_body.neurotransmitter.excitatory;

import br.com.diegorsilva.human_body.aminoacid.IAminoAcid;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents Glutamate, an abundant excitatory neurotransmitter that is also a non-essential amino acid.
 */
@Slf4j
public class Glutamate implements IExcitatoryNeurotransmitter, IAminoAcid {

    @Override
    public void transmitSignal() {
        log.info("Glutamate is transmitting an excitatory signal.");
    }

    @Override
    public void bindToReceptor() {
        log.info("Glutamate is binding to NMDA and AMPA receptors.");
    }

    @Override
    public String getChemicalFormula() {
        return "C5H9NO4";
    }

    @Override
    public String getName() {
        return "Glutamate";
    }

    @Override
    public String getThreeLetterCode() {
        return "Glu";
    }

    @Override
    public String getOneLetterCode() {
        return "E";
    }

    @Override
    public boolean isEssential() {
        return false;
    }
}