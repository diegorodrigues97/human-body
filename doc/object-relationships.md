# Object Relationships in the Context of Biochemistry

This document describes the main types of relationships between objects in Object-Oriented Programming (OOP), with examples applied to the domain of biochemistry and biology, ordered from the weakest to the strongest relationship.

---

## 1. Dependency

Dependency is the weakest relationship, representing that a class **"uses-a"** an object of another class, usually as a method parameter, without storing it as an attribute.

- **Biochemical Example**: An `Enzyme` **uses a** `Substrate` to perform a reaction. The enzyme acts on the substrate to convert it into a product but does not own it. The substrate is passed as a parameter to the method that executes the catalysis.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    Enzyme ..> Substrate : uses
    class Enzyme {
      +catalyze(Substrate s)
    }
    class Substrate {
      +String name
    }
  ```

---

## 2. Association

Association is a structural relationship that indicates that objects of one class are connected to objects of another. Both can exist independently.

- **Biochemical Example**: An `IHormone` associates with a `Receptor` to transmit a signal. The hormone and the receptor are independent entities that connect to perform a function.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    IHormone -- Receptor : binds to
    class IHormone {
      <<interface>>
      +String name
    }
    class Receptor {
      +String name
    }

    style IHormone fill:#e1f5fe,stroke:#0277bd,stroke-width:2px,color:#000000
  ```

---

## 3. Aggregation

Aggregation is a weaker **"has-a"** relationship. The "part" object can exist independently of the "whole" object.

- **Biochemical Example**: A `Protein` **has** `AminoAcids`. The amino acids make up the protein, but they can exist freely in the cytoplasm even if the protein is broken down.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    Protein o-- AminoAcid : contains
    class Protein {
      +String name
    }
    class AminoAcid {
      +String name
    }
  ```

---

## 4. Composition

Composition is a strong **"part-of"** relationship. The "part" object cannot exist without the "whole" object. If the "whole" is destroyed, the "part" is also destroyed.

- **Biochemical Example**: A `Nucleus` **is part of** a `Cell`. The nucleus does not exist independently in the organism; its existence is tied to that of the cell.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    Cell *-- Nucleus : contains
    class Cell {
      +String type
    }
    class Nucleus {
      +String dna
    }
  ```

---

## 5. Inheritance

Inheritance represents an **"is-a"** relationship. A class (subclass) inherits attributes and methods from another class (superclass), allowing for the creation of specializations.

- **Biochemical Example**: An `Enzyme` **is a** type of `Protein`. It inherits the basic characteristics of a protein (like an amino acid sequence) but adds specialized behavior: the ability to catalyze reactions.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    Protein <|-- Enzyme
    class Protein {
      +String aminoAcidSequence
    }
    class Enzyme {
      +catalyzeReaction()
    }
  ```
