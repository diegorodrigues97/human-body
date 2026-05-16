package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.modulatory;

import br.com.diegorsilva.human_body.domain.entities.neurotransmitter.INeurotransmitter;

public interface IModulatoryNeurotransmitter extends INeurotransmitter {
    void modulateSignal();
    void bindToModulatoryReceptor();
    void transmitSignal();
    void bindToReceptor();
    String getChemicalFormula();
}
