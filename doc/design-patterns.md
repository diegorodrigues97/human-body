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