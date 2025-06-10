The **Command pattern** is a behavioral design pattern that turns a request into a stand-alone object containing all information about the request. This transformation allows you to parameterize methods with different requests, delay or queue a request's execution, and support undoable operations.

#### Why Use It?

- **Decouples invoker and receiver**: Separates the object issuing commands from objects performing operations
    
- **Enables undo/redo functionality**: Maintains command history
    
- **Supports queuing and scheduling**: Commands can be queued, scheduled, or executed remotely
    
- **Simplifies complex operations**: Encapsulates complete request details
    
- **Enables macro commands**: Combines multiple commands into one
    

---

### Core Components

1. **Command**:
    
    - Interface declaring execution method (e.g., `execute()`)
        
2. **Concrete Command**:
    
    - Implements Command interface
        
    - Defines binding between Receiver and action
        
    - Contains request parameters
        
3. **Receiver**:
    
    - Knows how to perform operations
        
    - Contains business logic
        
4. **Invoker**:
    
    - Asks command to execute request
        
    - Manages command history (optional)
        
5. **Client**:
    
    - Creates commands and sets receivers
        

---

### Real-World Analogy: Restaurant Order

1. **Client**: Customer
    
2. **Command**: Order slip
    
3. **Invoker**: Waiter
    
4. **Receiver**: Chef
    
5. **Process**:
    
    - Customer (Client) creates order (Command)
        
    - Waiter (Invoker) queues and submits order
        
    - Chef (Receiver) executes cooking operations

### UML Class Diagram
[[CommandUML]]