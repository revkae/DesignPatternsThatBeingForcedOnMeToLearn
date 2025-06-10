The **Bridge pattern** is a structural design pattern that decouples an abstraction from its implementation, allowing both to vary independently. It's particularly useful when you need to extend a class in multiple orthogonal (independent) dimensions.

#### Why Use It?

- **Decoupling**: Separates high-level logic (abstraction) from low-level implementation details
    
- **Flexibility**: Lets you change implementations without affecting clients
    
- **Extensibility**: Allows adding new abstractions and implementations independently
    
- **Avoids complexity**: Prevents class explosion when combining variations
    

> 🔑 **Core Insight**: "Prefer composition over inheritance" - the Bridge pattern embodies this principle by replacing inheritance with composition.

---

### Core Components

1. **Abstraction**:
    
    - High-level control interface
        
    - Maintains reference to the Implementor
        
    - Defines abstraction-level operations
        
2. **Refined Abstraction**:
    
    - Extends/refines the abstraction interface
        
    - Provides specialized variants
        
3. **Implementor**:
    
    - Interface for implementation classes
        
    - Declares primitive operations the abstraction needs
        
4. **Concrete Implementor**:
    
    - Actual implementation of the Implementor interface
        
    - Contains platform-specific code

---

### Real-World Analogy: Device Remote Control

- **Abstraction**: Remote control (basic functions like power/volume)
    
- **Refined Abstraction**: Advanced remote (mute, settings)
    
- **Implementor**: Device interface (TV, radio)
    
- **Concrete Implementor**: Specific device (Sony TV, Bose radio)


### UML Class Diagram
[[BridgeUML]]