# Design Patterns in the Context of Biochemistry

This document describes common design patterns in Object-Oriented Programming (OOP), with examples applied to the domain of biochemistry and biology.

---

## 1. Simple Factory

The Simple Factory pattern is not a formal GoF (Gang of Four) pattern, but it is a common idiom in OOP. It consists of a class with a method that returns different instances of objects based on an input parameter. It encapsulates the creation logic in a single place.

- **Biochemical Example**: A `HormoneFactory` produces different hormones, such as `Insulin` or `Glucagon`, based on an input condition (like blood glucose levels). Both `Insulin` and `Glucagon` implement the `IHormone` interface.

- **UML Diagram**:
  
  ```mermaid
    classDiagram
      class IHormone {
        <<interface>>
        +action()
      }
      class Insulin {
        +action()
      }
      class Glucagon {
        +action()
      }
      class HormoneFactory {
        +createHormone(condition: String) IHormone
      }

      IHormone <|.. Insulin
      IHormone <|.. Glucagon
      HormoneFactory ..> IHormone : creates
      HormoneFactory ..> Insulin : creates
      HormoneFactory ..> Glucagon : creates

      style IHormone fill:#e1f5fe,stroke:#0277bd,stroke-width:2px,color:#000000
    ```

---

## 2. Factory Method

The Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

- **Biochemical Example**: An abstract `Cell` class defines an abstract method `secreteHormone()`. The concrete implementations `BetaCell` and `AlphaCell` override this method to produce specific hormones. The `BetaCell` secretes `Insulin`, while the `AlphaCell` secretes `Glucagon`.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    class IHormone {
      <<interface>>
      +action()
    }
    class Insulin {
      +action()
    }
    class Glucagon {
      +action()
    }
    
    class Cell {
      <<abstract>>
      +secreteHormone()* IHormone
      +processSignal()
    }
    class BetaCell {
      +secreteHormone() IHormone
    }
    class AlphaCell {
      +secreteHormone() IHormone
    }

    IHormone <|.. Insulin
    IHormone <|.. Glucagon
    Cell <|-- BetaCell
    Cell <|-- AlphaCell
    
    BetaCell ..> Insulin : creates
    AlphaCell ..> Glucagon : creates

    style IHormone fill:#e1f5fe,stroke:#0277bd,stroke-width:2px,color:#000000
    style Cell fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000
  ```

---

## 3. Singleton

The Singleton pattern ensures that a class has only one instance, while providing a global access point to this instance.

- **Biochemical Example**: In a simulated organism, there is only one `Brain` or one central `NervousSystem` responsible for coordinating overall responses. Attempting to create a second brain would be a biological and logical error. The `Brain` class manages its own single instance and prevents any other code from instantiating a new one.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    class Brain {
      -Brain instance$
      -Brain()
      +getInstance()$ Brain
      +processSensoryInput()
    }
    
    note for Brain "The constructor is private.\ngetInstance() returns the static instance."
  ```

---

## 4. Monostate (Borg)

The Monostate pattern is a variation of Singleton where all instances of a class share the same state. Unlike a standard Singleton, you can create multiple objects, but modifying the state of one modifies the state of all of them because the data is static. It focuses on single *behavior* and *state* rather than a single *identity*.

- **Biochemical Example**: Consider the `Bloodstream` within a single organism. You might instantiate `Bloodstream` objects in different organs (e.g., lungs, kidneys) to interact with it, but they all reference the same shared pool of `Blood` (which carries oxygen and nutrients). Changing the glucose level in one `Bloodstream` object changes it for the entire organism.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    class Bloodstream {
      -float bloodVolume$
      -float glucoseLevel$
      +Bloodstream()
      +getGlucoseLevel() float
      +setGlucoseLevel(level: float)
    }

    note for Bloodstream "Fields are static ($).\nMultiple instances can exist,\nbut they share the same data."
  ```

---

## 5. Builder

The Builder pattern separates the construction of a complex object from its representation. It allows the same construction process to create different representations. It is particularly useful when an object requires a significant amount of configuration or has multiple optional components.

- **Biochemical Example**: Creating a complex `Protein` (or a `Polypeptide` chain). A protein is composed of a specific sequence of amino acids and might be folded into various structures (alpha helices, beta sheets). A `ProteinBuilder` allows you to sequentially add amino acids and define the folding structure step-by-step before finally calling `build()` to assemble the complete, functional protein.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    class Protein {
      -List~AminoAcid~ sequence
      -FoldingStructure folding
      +Protein(sequence, folding)
      +function()
    }

    class ProteinBuilder {
      -List~AminoAcid~ sequence
      -FoldingStructure folding
      +addAminoAcid(aa: AminoAcid) ProteinBuilder
      +setFolding(structure: FoldingStructure) ProteinBuilder
      +build() Protein
    }
    
    class AminoAcid
    class FoldingStructure {
      <<Enumeration>>
      PRIMARY
      ALPHA_HELIX
      BETA_SHEET
    }

    ProteinBuilder ..> Protein : builds
    ProteinBuilder o-- AminoAcid : aggregates
    ProteinBuilder o-- FoldingStructure : uses
    Protein *-- AminoAcid : contains
    
    style FoldingStructure fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000
  ```

---

## 6. Prototype

The Prototype pattern is a creational design pattern that lets you copy existing objects without making your code dependent on their classes. It delegates the cloning process to the actual objects that are being cloned.

- **Biochemical Example**: Cellular division (Mitosis). When a `Cell` divides, it does not build a completely new cell from scratch using a factory; instead, it duplicates its existing state (DNA, organelles, cytoplasm) to create a perfect clone of itself. The `ICloneableCell` interface provides the `clone()` method. A `StemCell` object can clone itself to produce an identical `StemCell` without the calling system needing to know the exact internal initialization process of a stem cell.

- **UML Diagram**:
  
  ```mermaid
  classDiagram
    class ICloneableCell {
      <<interface>>
      +clone() ICloneableCell
    }
    
    class Cell {
      <<abstract>>
      -String dnaSequence
      -int organelleCount
      +Cell(dna: String)
      +clone()* ICloneableCell
    }

    class StemCell {
      +StemCell(dna: String)
      +StemCell(target: StemCell)
      +clone() ICloneableCell
    }
    
    class MuscleCell {
      +MuscleCell(dna: String)
      +MuscleCell(target: MuscleCell)
      +clone() ICloneableCell
    }

    ICloneableCell <|.. Cell
    Cell <|-- StemCell
    Cell <|-- MuscleCell
    
    StemCell ..> StemCell : clones
    MuscleCell ..> MuscleCell : clones

    style ICloneableCell fill:#e1f5fe,stroke:#0277bd,stroke-width:2px,color:#000000
    style Cell fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000
  ```
