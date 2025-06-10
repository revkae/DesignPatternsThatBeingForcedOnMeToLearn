Basically it is factory of factories. You create your first factory as interface then you crate new factories out of this factory implementation. Also products should be a factory also.

### Why Use It?

1. **Decouples client code** from concrete implementations.
2. **Ensures compatibility** between related objects (e.g., all UI elements from the same OS theme).
3. **Simplifies adding new product families** without modifying existing code.

### Core Components:

1. **Abstract Factory**:  
    Declares creation methods for each product type (e.g., `createButton()`, `createCheckbox()`).  
    _Example:_ `GUIFactory`
    
2. **Concrete Factories**:  
    Implements the abstract factory to produce products for a specific variant (e.g., `WindowsFactory`, `MacFactory`).
    
3. **Abstract Products**:  
    Declares interfaces for product types (e.g., `Button`, `Checkbox`).
    
4. **Concrete Products**:  
    Implements abstract products for a specific variant (e.g., `WindowsButton`, `MacCheckbox`).
    
5. **Client**:  
    Uses **only** interfaces from `AbstractFactory` and `AbstractProduct`.

### UML Class Diagram
[[AbstractFactoryUML]]