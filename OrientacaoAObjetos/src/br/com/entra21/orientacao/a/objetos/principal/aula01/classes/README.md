# Classes and Objects in Java

Classes and Objects are basic concepts of Object Oriented Programming which revolve around the real life entities.

<br>

## Class
A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order: 

- Modifiers: A class can be public or has default access (Refer this for details).

- class keyword: class keyword is used to create a class.

- Class name: The name should begin with an initial letter (capitalized by convention).

- Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.

- Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.

- Body: The class body surrounded by braces, { }.

Constructors are used for initializing new objects. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.
There are various types of classes that are used in real time applications such as nested classes, anonymous classes, lambda expressions.

## Object

It is a basic unit of Object-Oriented Programming and represents the real life entities.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of : 

- State: It is represented by attributes of an object. It also reflects the properties of an object.

- Behavior: It is represented by methods of an object. It also reflects the response of an object with other objects.

- Identity: It gives a unique name to an object and enables one object to interact with other objects.

Example of an object: dog

![Example of an object: dog](/gif_img/Blank-Diagram-Page-1-5.png)

<br>

## Declaring Objects
Declaring Objects (Also called instantiating a class)
When an object of a class is created, the class is said to be instantiated. All the instances share the attributes and the behavior of the class. But the values of those attributes, i.e. the state are unique for each object. A single class may have any number of instances.

![Example of an object: dog](/gif_img/Blank-Diagram-Page-1-3.png)

<br>

As we declare variables like (type name;). This notifies the compiler that we will use name to refer to data whose type is type. With a primitive variable, this declaration also reserves the proper amount of memory for the variable. So for reference variable, type must be strictly a concrete class name. In general, we can’t create objects of an abstract class or an interface.  

```java
Dog tuffy;
```
If we declare reference variable(tuffy) like this, its value will be undetermined(null) until an object is actually created and assigned to it. Simply declaring a reference variable does not create an object.


## Initializing an object
The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the class constructor. 

```java
public class Dog
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
 
    // Constructor Declaration of Class
    public Dog(String name, String breed,
                   int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getColor()
    {
        return color;
    }
 
    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
 
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
```




