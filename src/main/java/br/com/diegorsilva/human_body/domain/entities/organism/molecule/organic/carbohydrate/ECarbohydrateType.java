package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.carbohydrate;

/**
 * Represents the main classifications of carbohydrates based on their degree of polymerization
 * (structural complexity and number of monomer units).
 */
public enum ECarbohydrateType {
    
    /**
     * Monosaccharides: The simplest form of carbohydrates, consisting of a single sugar molecule.
     * Cannot be further hydrolyzed into simpler sugars.
     * Examples: Glucose, Fructose, Galactose.
     */
    MONOSACCHARIDE,

    /**
     * Disaccharides: Carbohydrates formed by the condensation of two monosaccharide molecules.
     * Examples: Sucrose, Lactose, Maltose.
     */
    DISACCHARIDE,

    /**
     * Oligosaccharides: Carbohydrates composed of a small number (typically 3 to 10) of monosaccharide units.
     * Examples: Raffinose, Stachyose.
     */
    OLIGOSACCHARIDE,

    /**
     * Polysaccharides: Complex carbohydrates composed of long chains of monosaccharide units bound together.
     * Examples: Glycogen, Starch, Cellulose.
     */
    POLYSACCHARIDE
}