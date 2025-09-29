package br.com.diegorsilva.human_body.neurotransmitter.excitatory;

import br.com.diegorsilva.human_body.aminoacid.IAminoAcid;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents Aspartate, an excitatory neurotransmitter that is also a non-essential amino acid.
 */
@Slf4j
public class Aspartate implements IExcitatoryNeurotransmitter, IAminoAcid {

    @Override
    public void transmitSignal() {
        log.info("Aspartate is transmitting an excitatory signal.");
    }

    @Override
    public void bindToReceptor() {
        log.info("Aspartate is binding to NMDA receptors.");
    }

    @Override
    public String getChemicalFormula() {
        return "C4H7NO4";
    }

    @Override
    public String getName() {
        return "Aspartate";
    }

    @Override
    public String getThreeLetterCode() {
        return "Asp";
    }

    @Override
    public String getOneLetterCode() {
        return "D";
    }

    @Override
    public boolean isEssential() {
        return false;
    }
}
