package br.com.diegorsilva.human_body.neurotransmitter.excitatory;

import br.com.diegorsilva.human_body.neurotransmitter.INeurotransmitter;

public interface IExcitatoryNeurotransmitter extends INeurotransmitter {
    void transmitSignal();
    void bindToReceptor();
    String getChemicalFormula();
}