# design-patterns

Sometimes it's important to have only one instance for a class. 
For example, in a system there should be only one window manager (or only a file system or only a print spooler).
Usually singletons are used for centralized management of internal or external resources and they provide a 
global point of access to themselves.

Intent

> Ensure that only one instance of a class is created.
> Provide a global point of access to the object.

Example 1 - Logger Classes

The Singleton pattern is used in the design of logger classes. This classes are ussualy implemented as a singletons, 
and provides a global logging access point in all the application components without being necessary to create an object
each time a logging operations is performed.
