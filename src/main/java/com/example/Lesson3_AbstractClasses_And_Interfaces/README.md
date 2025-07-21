### Abstract class And Interface

### What is Abstract Class ?
- We cannot instantiate an abstract class.
- Means we can't initialize an object out of it.
- Purpose : Generally it is used as a base class for other classes. To provide common definition that multiple derived classes can share.
- Abstract class can support two types of methods 
  - Abstract method : Which do not have an implementation, only signature.
  - Non-abstract method (Concrete Method) : These have an implementation.
- Any class inherits from abstract class can override abstract method and non-abstract method also and abstract method don't have an implementation, so it is mandatory to override the abstract method.


### What is Interface ?
- They are simple contract.
- They don't have any implementation.
- They define a contract for classes and do not dictate them that how something should be implemented.
- You always implement the interface & you can implement multiple interfaces.
- You cannot instantiate an interface directly, you cannot create object out of interface, only abstract methods are there, they are no any concrete methods with implementation.
- A class can implements multiple interface where a class can extends only single abstract class.
- Interface do not any constructors and they do not hold any state.
- Abstraction means we don't care how things are implemented, we don't care about it.