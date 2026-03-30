package br.com.diegorsilva.human_body.domain.entities.neurotransmitter.excitatory;

import br.com.diegorsilva.human_body.domain.entities.neurotransmitter.INeurotransmitter;

public interface IExcitatoryNeurotransmitter extends INeurotransmitter {
    void transmitSignal();
    void bindToReceptor();
    String getChemicalFormula();
}