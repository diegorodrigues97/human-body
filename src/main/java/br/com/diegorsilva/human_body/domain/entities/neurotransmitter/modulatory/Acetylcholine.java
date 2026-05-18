package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.modulatory;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.Ester;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents Acetylcholine (ACh), an organic chemical that functions in the brain and body of many types of animals
 * (including humans) as a neurotransmitter—a chemical message released by nerve cells to send signals to other cells.
 * Biochemically, it is an ester of acetic acid and choline.
 */
@Slf4j
public class Acetylcholine extends Ester implements IModulatoryNeurotransmitter {

    @Override
    public void modulateSignal() {
        log.info("Acetylcholine is modulating neural activity, participating in memory, learning, and muscle activation.");
    }

    @Override
    public void bindToModulatoryReceptor() {
        log.info("Acetylcholine is binding to nicotinic (nAChR) and muscarinic (mAChR) receptors.");
    }

    @Override
    public String getChemicalFormula() {
        return "C7H16NO2+";
    }

    @Override
    public String getName() {
        return "Acetylcholine";
    }

    @Override
    public void transmitSignal() {

    }

    @Override
    public void bindToReceptor() {

    }

    @Override
    public boolean isAcetateEster() {
        return true;
    }
}