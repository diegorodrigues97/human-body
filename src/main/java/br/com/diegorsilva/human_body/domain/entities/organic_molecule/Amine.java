package br.com.diegorsilva.human_body.domain.entities.organic_molecule;

/**
 * Represents an Amine, an organic compound and a functional group that contains a basic nitrogen atom with a lone pair.
 * In the human body, many neurotransmitters (like Dopamine and Serotonin) are monoamines.
 */
public abstract class Amine {
    
    /**
     * @return true if the molecule is a monoamine (contains one amino group connected to an aromatic ring).
     */
    public abstract boolean isMonoamine();
    
    /**
     * @return true if the molecule is a catecholamine (a monoamine containing a catechol group, e.g., Dopamine).
     */
    public abstract boolean isCatecholamine();
}
