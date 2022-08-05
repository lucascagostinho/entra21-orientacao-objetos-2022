# Inheritance in Java

> Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class. 

<br>

# Important terminology: 

* Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).

* Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.

* Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

Syntax:

```java
class derived-class extends base-class  
{  
   //methods and fields  
}
```

Example: In the below example of inheritance, class Bicycle is a base class, class MountainBike is a derived class that extends Bicycle class and class Test is a driver class to run program. 

```java
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;
  
    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
  
    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
  
    public void speedUp(int increment)
    {
        speed += increment;
    }
  
    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
  
// derived class
class MountainBike extends Bicycle {
  
    // the MountainBike subclass adds one more field
    public int seatHeight;
  
    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
  
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
  
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
  
// driver class
public class Test {
    public static void main(String args[])
    {
  
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
```
<br>

In the above program, when an object of MountainBike class is created, a copy of all methods and fields of the superclass acquire memory in this object. That is why by using the object of the subclass we can also access the members of a superclass. 

<center>

![Inheritance](/gif_img/inheritence1.png)

</center>

<br>

## Types of Inheritance in Java

1. Single Inheritance: In single inheritance, subclasses inherit the features of one superclass. In the image below, class A serves as a base class for the derived class B.

```java
class one {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one {
    public void print_for() { System.out.println("for"); }
}
// Driver class
public class Main {
    public static void main(String[] args)
    {
        two g = new two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
```

<br>

<center>

![Single Inheritance](/gif_img/single_inheritance.png)

</center>

<br>

2. Multilevel Inheritance: In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class. In the below image, class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. In Java, a class cannot directly access the grandparent’s members.

```java
class one {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one {
    public void print_for() { System.out.println("for"); }
}
  
class three extends two {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
// Drived class
public class Main {
    public static void main(String[] args)
    {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
```

<br>

<center>

![Multilevel Inheritance](/gif_img/multilevel_inheritance.png)

</center>

<br>

3. Hierarchical Inheritance: In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. In the below image, class A serves as a base class for the derived class B, C and D.

```java
class A {
    public void print_A() { System.out.println("Class A"); }
}
  
class B extends A {
    public void print_B() { System.out.println("Class B"); }
}
  
class C extends A {
    public void print_C() { System.out.println("Class C"); }
}
  
class D extends A {
    public void print_D() { System.out.println("Class D"); }
}
  
// Driver Class
public class Test {
    public static void main(String[] args)
    {
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();
  
        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();
  
        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();
    }
}
```


<br>

<center>

![Single Inheritance](/gif_img/hierarchical_inheritance.png)

</center>

<br>

4. Multiple Inheritance (Through Interfaces): In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. Please note that Java does not support multiple inheritances with classes. In java, we can achieve multiple inheritances only through Interfaces. In the image below, Class C is derived from interface A and B.

```java
interface one {
    public void print_geek();
}
  
interface two {
    public void print_for();
}
  
interface three extends one, two {
    public void print_geek();
}
class child implements three {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }
  
    public void print_for() { System.out.println("for"); }
}
  
// Drived class
public class Main {
    public static void main(String[] args)
    {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
```


<br>

<center>

![Multiple Inheritance](/gif_img/multiple_inheritance.png)

</center>

<br>

5. 5. Hybrid Inheritance(Through Interfaces): It is a mix of two or more of the above types of inheritance. Since java doesn’t support multiple inheritances with classes, hybrid inheritance is also not possible with classes. In java, we can achieve hybrid inheritance only through Interfaces.

<center>

![Hybrid Inheritance](/gif_img/hybrid_inheritance.png)

</center>

