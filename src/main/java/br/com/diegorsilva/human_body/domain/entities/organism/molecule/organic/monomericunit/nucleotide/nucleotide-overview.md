# Nucleotides and Nucleosides Overview

Nucleotides and their precursors, nucleosides, are fundamental biomolecules that serve as the primary building blocks of nucleic acids (DNA and RNA) and play central roles in cellular metabolism.

## Classification

The relationship between these molecules is hierarchical:

1.  **Nucleoside:** This is the base structure, formed by the covalent bonding of two components:
    *   A **Nitrogenous Base** (a purine like Adenine or a pyrimidine like Cytosine).
    *   A **Pentose Sugar** (either Ribose or Deoxyribose).

2.  **Nucleotide:** This molecule is a **phosphorylated nucleoside**. It consists of the two components of a nucleoside plus one to three phosphate groups attached to the pentose sugar.
    *   `Nucleotide = Nucleoside + Phosphate Group(s)`

The most famous example is **Adenosine Triphosphate (ATP)**, the primary energy currency of the cell. It is a nucleotide composed of an Adenine base, a Ribose sugar, and three phosphate groups. Its de-phosphorylated counterpart, **Adenosine Diphosphate (ADP)**, is a key component of the energy cycle.

## Conceptual UML Diagram

The following Mermaid diagram represents the structural hierarchy of nucleosides and nucleotides as modeled in the project.

*Note: Following our UML conventions, conceptual class names omit code-level prefixes.*

```mermaid
classDiagram

    class Nucleoside {
        <<Abstract>>
        +NitrogenousBase nitrogenousBase
        +Pentose pentose
    }

    class Nucleotide {
        <<Abstract>>
        +int phosphateCount
    }

    class NitrogenousBase {
        <<Abstract>>
    }

    class Pentose {
        <<Abstract>>
    }

    %% Concrete Implementations
    class ATP
    class ADP
    class Adenine
    class Ribose

    %% Relationships
    Nucleoside <|-- Nucleotide
    Nucleoside "1" *-- "1" NitrogenousBase : has
    Nucleoside "1" *-- "1" Pentose : has

    Nucleotide <|-- ATP
    Nucleotide <|-- ADP
    
    NitrogenousBase <|-- Adenine
    Pentose <|-- Ribose

    %% Styling
    style Nucleoside fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000
    style Nucleotide fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000
    style NitrogenousBase fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000
    style Pentose fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000

```
