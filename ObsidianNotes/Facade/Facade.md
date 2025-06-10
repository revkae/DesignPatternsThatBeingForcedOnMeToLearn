The **Facade pattern** is a structural design pattern that provides a simplified interface to a complex subsystem. It acts as a unified gateway that hides the intricacies of multiple components behind a single, easy-to-use interface.

#### Why Use It?

- **Simplifies Complexity**: Reduces cognitive load by hiding subsystem details
    
- **Decouples Systems**: Minimizes client dependencies on internal components
    
- **Improves Maintainability**: Changes to subsystem don't affect clients
    
- **Provides Entry Point**: Single access point to complex functionality
    
- **Enhances Readability**: Makes code more intuitive and self-documenting
    

---

### Core Components

1. **Facade**:
    
    - Provides simplified methods that delegate to subsystem
        
    - Knows which subsystem classes handle requests
        
2. **Subsystem Classes**:
    
    - Implement specialized functionality
        
    - Have no knowledge of the facade
        
3. **Client**:
    
    - Interacts with facade instead of subsystem directly
        
    - Benefits from simplified interface
        

---

### Real-World Analogy: Restaurant Ordering

1. **Subsystem**: Kitchen (Chef), Inventory (Manager), Payment (Cashier)
    
2. **Facade**: Waiter (takes order, coordinates subsystems)
    
3. **Client**: Customer (interacts only with waiter)
    
4. **Process**:
    
    - Customer places order with waiter
        
    - Waiter coordinates kitchen, inventory, payment
        
    - Customer receives simplified experience


### UML Class Diagram
[[FacadeUML]]