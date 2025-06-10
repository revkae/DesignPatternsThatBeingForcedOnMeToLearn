The **Composite pattern** is a structural design pattern that composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions uniformly through a common interface.

#### Why Use It?

- **Simplifies Client Code**: Clients interact with all components uniformly
    
- **Flexible Hierarchies**: Builds recursive tree structures dynamically
    
- **Scalability**: Easily add new component types
    
- **Natural Representation**: Models real-world part-whole relationships
    
- **Centralized Control**: Manage entire structures through single entry points
    

---

### Core Components

1. **Component**:
    
    - Declares common interface for all objects in composition
        
    - (Optional) Implements default behavior for child management
        
2. **Leaf**:
    
    - Represents primitive/terminal objects (no children)
        
    - Implements Component operations
        
3. **Composite**:
    
    - Stores child components (Leaf or Composite)
        
    - Implements child management operations (add/remove)
        
    - Delegates operations to children
        
4. **Client**:
    
    - Manipulates objects via Component interface
        

---

### Real-World Analogy: Military Hierarchy

1. **Component Interface** (`FileSystemComponent`):
    
    - Defines common operations (`display`, `getSize`)
        
    - Includes default child management methods with exception throwing
        
    - Enables uniform treatment of files and directories
        
2. **Leaf Implementation** (`File`):
    
    - Implements core operations with actual behavior
        
    - Throws exceptions for child management operations
        
    - Contains file-specific data (name, size)
        
3. **Composite Implementation** (`Directory`):
    
    - Manages collection of child components
        
    - Implements recursive size calculation
        
    - Delegates display operation to children
        
    - Supports hierarchical nesting (directories within directories)
        
4. **Client Usage**:
    
    - Builds complex structures from simple components
        
    - Treats files and directories uniformly
        
    - Leverages recursive operations for size calculation


### UML Class Diagram
[[CompositeUML]]