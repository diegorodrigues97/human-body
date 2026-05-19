# UML Conventions

This document defines the visual and structural conventions to be used when creating UML diagrams (e.g., using Mermaid) in this project.

## Diagram Styling

To ensure clarity, consistency, and readability, apply the following visual styles to UML components using the `style` directive directly on the classes (to maximize compatibility across markdown renderers).

### 1. Interfaces
- Apply a light blue background (`fill:#e1f5fe`) with a dark blue border (`stroke:#0277bd`).
- Text color must be black for contrast (`color:#000000`).
- **Mermaid Style Directive**: 
  ```mermaid
  style [InterfaceName] fill:#e1f5fe,stroke:#0277bd,stroke-width:2px,color:#000000
  ```

### 2. Abstract Classes
- Apply a light orange/yellow background (`fill:#fff3e0`) with a darker orange, dashed border (`stroke:#e65100`, `stroke-dasharray: 5 5`).
- Text color must be black for contrast (`color:#000000`).
- **Mermaid Style Directive**: 
  ```mermaid
  style [AbstractClassName] fill:#fff3e0,stroke:#e65100,stroke-width:2px,stroke-dasharray: 5 5,color:#000000
  ```

## Naming Conventions
- While the source code follows a strict prefixing convention (e.g., `ACarbohydrate`, `ECarbohydrateType`), **all names within UML diagrams must omit these prefixes**.
- The goal is to represent the conceptual model, not the literal implementation. For example, in a diagram, use `Carbohydrate` instead of `ACarbohydrate` and `CarbohydrateType` instead of `ECarbohydrateType`.
- The diagram's visual styling (e.g., dashed borders for abstract classes) is sufficient to indicate the nature of the component.
