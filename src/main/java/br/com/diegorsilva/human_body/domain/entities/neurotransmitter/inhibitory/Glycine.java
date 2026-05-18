package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.inhibitory;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.IAminoAcid;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents Glycine, a major inhibitory neurotransmitter in the spinal cord and brainstem.
 * It is also the simplest amino acid.
 */
@Slf4j
public class Glycine implements IInhibitoryNeurotransmitter, IAminoAcid {

    @Override
    public void inhibitSignal() {
        log.info("Glycine is providing inhibitory signals, primarily in the spinal cord.");
    }

    @Override
    public void bindToInhibitoryReceptor() {
        log.info("Glycine is binding to glycine receptors (GlyR).");
    }

    @Override
    public String getChemicalFormula() {
        return "C2H5NO2";
    }

    @Override
    public String getName() {
        return "Glycine";
    }

    @Override
    public void transmitSignal() {

    }

    @Override
    public void bindToReceptor() {

    }

    @Override
    public String getThreeLetterCode() {
        return "Gly";
    }

    @Override
    public String getOneLetterCode() {
        return "G";
    }

    @Override
    public boolean isEssential() {
        return false;
    }
}