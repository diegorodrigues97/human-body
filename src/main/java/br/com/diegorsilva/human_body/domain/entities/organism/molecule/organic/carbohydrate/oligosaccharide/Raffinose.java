package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate.oligosaccharide;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.AMolecule;
import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.EMoleculeBondType;

/**
 * Represents Raffinose, a trisaccharide composed of galactose, fructose, and glucose.
 * <p>
 * It is found in beans, cabbage, broccoli, and other vegetables. Raffinose can be hydrolyzed
 * to D-galactose and sucrose by the enzyme α-galactosidase.
 * <p>
 * Its chemical formula is C18H32O16.
 */
public class Raffinose extends AOligosaccharide {

    /**
     * Constructs a new Raffinose instance.
     * It is initialized with its specific chemical formula ("C18H32O16") and its characteristic covalent bond type.
     */
    public Raffinose() {
        super(new AMolecule("C18H32O16", EMoleculeBondType.COVALENT) {});
    }
}
