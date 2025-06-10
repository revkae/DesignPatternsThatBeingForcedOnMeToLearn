Mostly used to add new functionalites to old code without changing it directly.

#### Why Use It?

- **Interface compatibility**: Makes unrelated classes/objects work together
    
- **Reusability**: Integrates legacy or third-party code without modification
    
- **Single Responsibility**: Separates interface conversion from primary business logic
    
- **Flexibility**: Works with existing classes without breaking their functionality

---

### Core Components

1. **Target**:
    
    - The interface clients expect to work with
        
2. **Adaptee**:
    
    - The existing class with an incompatible interface
        
3. **Adapter**:
    
    - The class that converts the Adaptee's interface to the Target interface
        
4. **Client**:
    
    - Interacts with the Target interface

### UML Class Diagram
[[AdapterUML]]