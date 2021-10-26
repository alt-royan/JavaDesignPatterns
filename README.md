# Java Design Patterns
Here you can find the basic programming patterns implemented in the **Java** language.

The Patterns have been implemented based on the book ***Design Patterns:
Elements of Reusable
Object-Oriented Software*** *Erich Gamma* and _Richard Helm_ and using the information from www.java-design-patterns.com/

* [Creational](#creational)
  * [Abstract factory](#abstract-factory)
  * [Factory method](#factory-method)
  * [Builder](#builder)
  * [Singleton](#singleton)
  * [Prototype](#prototype)
* [Structural](#structural)
  * [Adapter](#adapter) 
  * [Bridge](#bridge) 
  * [Composite](#composite) 
  * [Decorator](#decorator) 
  * [Facade](#facade) 
  * [Flyweight](#flyweight) 
  * [Proxy](#proxy) 
* [Behavioral](#behavioral)
  * [Chain of responsibility](#chain-of-responsibility)
  * [Command](#command)
  * [Interpreter](#interpreter)
  * [Iterator](#Iterator)
  * [Mediator](#mediator)
  * [Memento](#memento)
  * [Observer](#observer)
  * [State](#state)
  * [Strategy](#strategy)
  * [Template method](#template-method)
  * [Visitor](#visitor)
---
## Creational

### Abstract factory
The **abstract factory** pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. 
The client does not know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products.
This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface.

___Example:___ _The pattern is implemented using the example of creating kingdoms. It is necessary to create kingdoms of different races. Each kingdom has its own factory._

__Implementation__ is [here](src/Creation/AbstractFactory)

### Factory method
In class-based programming, the __factory method__ pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. 
This is done by creating objects by calling a factory method — either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes — rather than by calling a constructor.

___Example:___ _A coin factory is established. A coin type is passed to the factory, and a specific coin object of the passed type is expected._

__Implementation__ is [here](src/Creation/Factory)

### Builder
The __builder__ pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. 
The intent of the Builder design pattern is to separate the construction of a complex object from its representation. By doing so, the same construction process can create different representations

___Example:___ _There is a book publisher that needs to publish various books. In the example, a publisher is releasing a history book._

__Implementation__ is [here](src/Creation/Builder)

### Singleton
In software engineering, the __singleton__ pattern is a software design pattern that restricts the instantiation of a class to one "single" instance. 
This is useful when exactly one object is needed to coordinate actions across the system.

___Example:___ _Here are 3 implementations of the singleton pattern: a simple singleton, a synchronized singleton for working in multi-threaded applications, and a more advanced version of a multi-threaded singleton - double-checked._

__Implementation__ is [here](src/Creation/Singleton)

### Prototype
The __prototype__ pattern is a creational design pattern in software development. 
It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. 
This pattern is used to avoid subclasses of an object creator in the client application, like the factory method pattern does and to avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.

___Example:___ _There is a project factory, which creates projects not by the factory method (since it is quite costly to create a large project from scratch), but by copying an existing project._

__Implementation__ is [here](src/Creation/Prototype)

## Structural

### Adapter
The __adapter__ pattern is a software design pattern that allows the interface of an existing class to be used as another interface.
It is often used to make existing classes work with others without modifying their source code. An adapter allows two incompatible interfaces to work together. This is the real-world definition for an adapter. 
Interfaces may be incompatible, but the inner functionality should suit the need. The adapter design pattern allows otherwise incompatible classes to work together by converting the interface of one class into an interface expected by the clients.

___Example:___ _The application needs to interact with the database through the service, however they have different interfaces. The adapter pattern solves this problem._

__Implementation__ is [here](src/Structure/Adapter)

### Bridge
__Bridge__ is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies — abstraction and implementation — which can be developed independently of each other.

___Example:___ _We have shapes that can be drawn using a drawer. 
We can draw the same shape (circle) using different drawer, getting different implementations of this shape._

__Implementation__ is [here](src/Structure/Bridge)

### Composite
The __composite__ pattern describes a group of objects that are treated the same way as a single instance of the same type of object. 
The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. 
Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

___Example:___ _There are many graphics objects to draw. We can combine all the graphics into one structure and draw it completely._

__Implementation__ is [here](src/Structure/Composite)

### Decorator
The __decorator__ pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.
The decorator pattern is often useful for adhering to the _Single Responsibility Principle_, as it allows functionality to be divided between classes with unique areas of concern.
Decorator use can be more efficient than subclassing, because an object's behavior can be augmented without defining an entirely new object.

___Example:___ _We can write text to a file and read it from a file. 
But besides this, we needed to write and read the encrypted and compressed text. With the help of the decorator pattern, we can combine the already implemented methods of working with files, as well as add new ones later._

__Implementation__ is [here](src/Structure/Decorator)

### Facade
The __facade__ is an object that serves as a front-facing interface masking more complex underlying or structural code. 
Developers often use the facade design pattern when a system is very complex or difficult to understand because the system has many interdependent classes or because its source code is unavailable. 
This pattern hides the complexities of the larger system and provides a simpler interface to the client. 
It typically involves a single wrapper class that contains a set of members required by the client. 
These members access the system on behalf of the facade client and hide the implementation details.

___Example:___ _There is a navigation system, its device is quite complex: starting gps, loading maps, building a route, etc. 
A simple interface is created for the client, encapsulating the work of the system itself._

__Implementation__ is [here](src/Structure/Facade)

### Flyweight
The __flyweight__ software design pattern refers to an object that minimizes memory usage by sharing some of its data with other similar objects.
The flyweight pattern is useful when dealing with large numbers of objects with simple repeated elements that would use a large amount of memory if individually stored. 
It is common to hold shared data in external data structures and pass it to the objects temporarily when they are used.

___Example:___ _We issue English letters as objects of the corresponding classes upon request to the flyweight factory._

__Implementation__ is [here](src/Structure/FlyWeight)

### Proxy
The __proxy__ could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or impossible to duplicate. 
A proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes.
Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy, extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked. 
For the client, usage of a proxy object is similar to using the real object, because both implement the same interface.

___Example:___ _You need to watch a video from YouTube, but the video is too large to fully load when creating an object. We use a proxy to implement "lazy" loading and link checking (is it really a link to a YouTube video)._

__Implementation__ is [here](src/Structure/Proxy)

## Behavioral

### Chain of responsibility
The __chain-of-responsibility__ pattern is a behavioral design pattern consisting of a source of command objects and a series of processing objects.
Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. 
A mechanism also exists for adding new processing objects to the end of this chain.

___Example:___ _Logger with different types of logging: console logger, file logger and dialog massage. Each logger will log only those messages, the logging level of which is higher or equal to the logger level._

__Implementation__ is [here](src/Behavior/Chain)

### Command
The __command__ pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. 
This information includes the method name, the object that owns the method and values for the method parameters.
A command object knows about receiver and invokes a method of the receiver. 
Values for parameters of the receiver method are stored in the command. 
The receiver object to execute these methods is also stored in the command object by aggregation. 
The receiver then does the work when the `execute()` method in command is called. An invoker object knows how to execute a command, and optionally does bookkeeping about the command execution. 
The invoker does not know anything about a concrete command, it knows only about the command interface.

___Example:___ _The lamp has commands to turn on the light and turn it off. We set them first, and then we call them._

__Implementation__ is [here](src/Behavior/Command)

### Interpreter
The __interpreter__ pattern is a design pattern that specifies how to evaluate sentences in a language. 
The basic idea is to have a class for each symbol (terminal or nonterminal) in a specialized computer language. 
The syntax tree of a sentence in the language is an instance of the composite pattern and is used to evaluate (interpret) the sentence for a client.

___Example:___ _Interpreting a mathematical expression._

__Implementation__ is [here](src/Behavior/Interpreter)

### Iterator
The __iterator__ pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. 
The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.

___Example:___ _The list iterator._

__Implementation__ is [here](src/Behavior/Iterator)

### Mediator
The __mediator__ pattern defines an object that encapsulates how a set of objects interact.
With the mediator pattern, communication between objects is encapsulated within a mediator object. Objects no longer communicate directly with each other, but instead communicate through the mediator. 
This reduces the dependencies between communicating objects, thereby reducing coupling.

___Example:___ _Colleagues at work do not communicate directly, but through a general chat, in which additional business logic can be added._

__Implementation__ is [here](src/Behavior/Mediator)

### Memento
The __memento__ pattern provides the ability to restore an object to its previous state (undo via rollback).
The memento pattern is implemented with three objects: the originator, a caretaker and a memento. The originator is some object that has an internal state. The caretaker is going to do something to the originator, but wants to be able to undo the change. The caretaker first asks the originator for a memento object. Then it does whatever operation (or sequence of operations) it was going to do. To roll back to the state before the operations, it returns the memento object to the originator. The memento object itself is an opaque object (one which the caretaker cannot, or should not, change). 
When using this pattern, care should be taken if the originator may change other objects or resources—the memento pattern operates on a single object.

___Example:___ _Standard implementation of the Memento pattern using Originator, Caretaker, Memento._

__Implementation__ is [here](src/Behavior/Memento)

### Observer
The __observer__ pattern is a software design pattern in which an object, named the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
This pattern then perfectly suits any process where data arrives from some input that is not available to the CPU at startup, but instead arrives "at random" (HTTP requests, GPIO data, user input from keyboard/mouse/..., distributed databases and blockchains, ...). 
Most modern programming-languages comprise built-in "event" constructs implementing the observer-pattern components.

___Example:___ _Weather station. When the temperature changes, it informs about it._

__Implementation__ is [here](src/Behavior/Observer)

### State
The __state__ pattern allows an object to alter its behavior when its internal state changes. This pattern is close to the concept of finite-state machines. 
It can be interpreted as a strategy pattern, which is able to switch a strategy through invocations of methods defined in the pattern's interface.
The state pattern is used in computer programming to encapsulate varying behavior for the same object, based on its internal state. 
This can be a cleaner way for an object to change its behavior at runtime without resorting to conditional statements and thus improve maintainability.

___Example:___ _After some time, a person becomes hungry and after eating, he becomes well-fed._

__Implementation__ is [here](src/Behavior/State

### Strategy
The __strategy__ pattern enables selecting an algorithm at runtime. 
Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.
Strategy lets the algorithm vary independently from clients that use it.
Deferring the decision about which algorithm to use until runtime allows the calling code to be more flexible and reusable.
For instance, a class that performs validation on incoming data may use the strategy pattern to select a validation algorithm depending on the type of data, the source of the data, user choice, or other discriminating factors. These factors are not known until run-time and may require radically different validation to be performed. The validation algorithms (strategies), encapsulated separately from the validating object, may be used by other validating objects in different areas of the system (or even different systems) without code duplication.

___Example:___ _A simple example: under the strategy we will take a mathematical action._

__Implementation__ is [here](src/Behavior/Strategy)

### Template method
The __template__ method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms of a number of high-level steps. 
These steps are themselves implemented by additional helper methods in the same class as the template method.
The helper methods may be either abstract methods, in which case subclasses are required to provide concrete implementations, or hook methods, which have empty bodies in the superclass. 
Subclasses can (but are not required to) customize the operation by overriding the hook methods. 
The intent of the template method is to define the overall structure of the operation, while allowing subclasses to refine, or redefine, certain steps.

___Example:___ _Creation of site pages. Each page of the site has a header and footer, so there is no need to rewrite them every time, you just need to create a page template with ready-made headers and footers and add the content of the page itself there._

__Implementation__ is [here](src/Behavior/Template)

### Visitor
The __visitor__ design pattern is a way of separating an algorithm from an object structure on which it operates. 
A practical result of this separation is the ability to add new operations to existing object structures without modifying the structures. 
It is one way to follow the open/closed principle.
In essence, the visitor allows adding new virtual functions to a family of classes, without modifying the classes. 
Instead, a visitor class is created that implements all of the appropriate specializations of the virtual function. 
The visitor takes the instance reference as input, and implements the goal through double dispatch.

___Example:___ _There is a point on the plane and two visitors who, when visiting this point, perform their actions._

__Implementation__ is [here](src/Behavior/Visitor)
