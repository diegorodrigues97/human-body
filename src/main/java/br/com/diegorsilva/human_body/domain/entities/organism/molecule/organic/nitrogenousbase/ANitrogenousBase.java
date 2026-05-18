package br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase;

import br.com.diegorsilva.human_body.domain.entities.organism.molecule.organic.nitrogenousbase.family.ENitrogenousBaseFamily;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Represents a nitrogenous base (base nitrogenada).
 * Nitrogenous bases are organic molecules containing nitrogen that have the chemical properties of a base.
 * They are the fundamental building blocks of nucleic acids, such as DNA and RNA.
 * <p>
 * These molecules are primarily categorized into two groups:
 * <ul>
 *   <li><b>Purines:</b> Adenine (A) and Guanine (G)</li>
 *   <li><b>Pyrimidines:</b> Cytosine (C), Thymine (T) and Uracil (U)</li>
 * </ul>
 */
@Getter
@RequiredArgsConstructor
public abstract class ANitrogenousBase {
    private final ENitrogenousBaseFamily family;
}
