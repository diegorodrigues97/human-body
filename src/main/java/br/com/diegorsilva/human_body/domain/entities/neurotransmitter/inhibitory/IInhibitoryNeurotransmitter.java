package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.inhibitory;

import br.com.diegorsilva.human_body.domain.entities.neurotransmitter.INeurotransmitter;

public interface IInhibitoryNeurotransmitter extends INeurotransmitter {
    void inhibitSignal();
    void bindToInhibitoryReceptor();
    void transmitSignal();
    void bindToReceptor();
    String getChemicalFormula();
}
