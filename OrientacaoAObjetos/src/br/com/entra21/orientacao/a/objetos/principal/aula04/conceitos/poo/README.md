# OOP Concepts

## Coupling:

In object oriented design, Coupling refers to the degree of direct knowledge that one element has of another. In other words, how often do changes in class A force related changes in class B.
There are two types of coupling:

1. Tight coupling : In general, Tight coupling means the two classes often change together. In other words, if A knows more than it should about the way in which B was implemented, then A and B are tightly coupled.
Example:

<br>

```java
class Subject {
    Topic t = new Topic();
    public void startReading()
    {
        t.understand();
    }
}
class Topic {
    public void understand()
    {
        System.out.println("Tight coupling concept");
    }
}
```

2. Loose coupling : In simple words, loose coupling means they are mostly independent. If the only knowledge that class A has about class B, is what class B has exposed through its interface, then class A and class B are said to be loosely coupled.

Example:

<br>

```java
public interface Topic
{
    void understand();
}
class Topic1 implements Topic {
public void understand()
    {
        System.out.println("Got it");
    }
} class Topic2 implements Topic {
public void understand()
    {
        System.out.println("understand");
    }
} public class Subject {
public static void main(String[] args)
    {
        Topic t = new Topic1();
        t.understand();
    }
}
```

### Which one is better?
In general, Tight Coupling is bad in but most of the time, because it reduces flexibility and re-usability of code, it makes changes much more difficult, it impedes test ability etc. loose coupling is a better choice because A loosely coupled will help you when your application need to change or grow.

<br>

<center>

![Tight Coupling vs Loose coupling](/OrientacaoAObjetos/gif_img/coupling.png)

</center>

### Difference between tight coupling and loose coupling

* Tight coupling is not good at the test-ability. But loose coupling improves the test ability.
* Tight coupling does not provide the concept of interface. But loose coupling helps us follow the GOF principle of program to interfaces, not implementations.
*In Tight coupling, it is not easy to swap the codes between two classes. But it’s much easier to swap other pieces of code/modules/objects/components in loose coupling.
* Tight coupling does not have the changing capability. But loose coupling is highly changeable.

<br>

## Cohesion
Cohesion in Java is the Object-Oriented principle most closely associated with making sure that a class is designed with a single, well-focused purpose. In object-oriented design, cohesion refers all to how a single class is designed. 

>Note: The more focused a class is, the more is the cohesiveness of that class. 

The advantage of high cohesion is that such classes are much easier to maintain (and less frequently changed) than classes with low cohesion. Another benefit of high cohesion is that classes with a well-focused purpose tend to be more reusable than other classes.

```java
class Multiply {
   
    int a = 5;
    int b = 5;
   
    public int mul(int a, int b)
    {
        this.a = a;
        this.b = b;
        return a * b;
    }
}
 
class Display {
    public static void main(String[] args)
    {
        Multiply m = new Multiply();
        System.out.println(m.mul(5, 5));
    }
}
```
### Pictorial view of high cohesion and low cohesion

<br>

<center>

![Tight Coupling vs Loose coupling](/OrientacaoAObjetos/gif_img/cohesion.png)

</center>

<br>

### Difference between high cohesion and low cohesion
* High cohesion is when you have a class that does a well-defined job. Low cohesion is when a class does a lot of jobs that don’t have much in common.
  
* High cohesion gives us better-maintaining facility and Low cohesion results in monolithic classes that are difficult to maintain, understand and reduce re-usability.

<br>

## Association
Association is a relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many. In Object-Oriented programming, an Object communicates to another object to use functionality and services provided by that object. Composition and Aggregation are the two forms of association. 

```java
// Class 1
// Bank class
class Bank {
 
    // Attributes of bank
    private String name;
 
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
}
 
// Class 2
// Employee class
class Employee {
    // Attributes of employee
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}
 
// Class 3
// Association between both the
// classes in main method
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
 
        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                           + " is employee of "
                           + bank.getBankName());
    }
}
```

Output: 
```java 
Ridhi is employee of ICICI
```
<br>

## Aggregation
* It represents Has-A’s relationship.
  
* It is a unidirectional association i.e. a one-way relationship. For example, a department can have students but vice versa is not possible and thus unidirectional in nature.
  
* In Aggregation, both the entries can survive individually which means ending one entity will not affect the other entity.

```java
// Class 1
// Student class
class Student {
 
    // Attributes of student
    String name;
    int id;
    String dept;
 
    // Constructor of student class
    Student(String name, int id, String dept)
    {
 
        // This keyword refers to current instance itself
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}
 
// Class 2
// Department class contains list of student objects
// It is associated with student class through its Objects
class Department {
    // Attributes of Department class
    String name;
    private List<Student> students;
    Department(String name, List<Student> students)
    {
        // this keyword refers to current instance itself
        this.name = name;
        this.students = students;
    }
 
    // Method of Department class
    public List<Student> getStudents()
    {
        // Returning list of user defined type
        // Student type
        return students;
    }
}
 
// Class 3
//  Institute class contains list of Department
// Objects. It is associated with Department
// class through its Objects
class Institute {
 
    // Attributes of Institute
    String instituteName;
    private List<Department> departments;
 
    // Constructor of institute class
    Institute(String instituteName,List<Department> departments)
    {
        // This keyword refers to current instance itself
        this.instituteName = instituteName;
        this.departments = departments;
    }
 
    // Method of Institute class
    // Counting total students of all departments
    // in a given institute
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students;
 
        for (Department dept : departments) {
            students = dept.getStudents();
 
            for (Student s : students) {
                noOfStudents++;
            }
        }
 
        return noOfStudents;
    }
}
 
// Class 4
// main class
class GFG {
 
    // main driver method
    public static void main(String[] args)
    {
        // Creating object of Student class inside main()
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
 
        // Creating a List of CSE Students
        List<Student> cse_students = new ArrayList<Student>();
 
        // Adding CSE students
        cse_students.add(s1);
        cse_students.add(s2);
 
        // Creating a List of EE Students
        List<Student> ee_students
            = new ArrayList<Student>();
 
        // Adding EE students
        ee_students.add(s3);
        ee_students.add(s4);
 
        // Creating objects of EE and CSE class inside
        // main()
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
 
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
 
        // Lastly creating an instance of Institute
        Institute institute = new Institute("BITS", departments);
 
        // Display message for better readability
        System.out.print("Total students in institute: ");
 
        // Calling method to get total number of students
        // in institute and printing on console
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}
```

Output:
```
Total students in institute: 4
```


## Composition
Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.  

* It represents part-of relationship.
  
* In composition, both entities are dependent on each other.
  
* When there is a composition between two entities, the composed object cannot exist without the other entity.

```java
class Book {
 
    // Attributes of book
    public String title;
    public String author;
 
    // Constructor of Book class
    Book(String title, String author)
    {
 
        // This keyword refers to current instance itself
        this.title = title;
        this.author = author;
    }
}
 
// Class 2
class Library {
 
    // Reference to refer to list of books
    private final List<Book> books;
 
    // Library class contains list of books
    Library(List<Book> books)
    {
 
        // Referring to same book as
        // this keyword refers to same instance itself
        this.books = books;
    }
 
    // Method
    // To get total number of books in library
    public List<Book> getTotalBooksInLibrary()
    {
 
        return books;
    }
}
 
// Class 3
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating objects of Book class inside main()
        // method Custom inputs
        Book b1
            = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2
            = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference",
                           "Herbert Schildt");
 
        // Creating the list which contains number of books
        List<Book> books = new ArrayList<Book>();
 
        // Adding books
        // using add() method
        books.add(b1);
        books.add(b2);
        books.add(b3);
 
        Library library = new Library(books);
 
        // Calling method to get total books in library
        // and storing it in list of user0defined type -
        // Books
        List<Book> bks = library.getTotalBooksInLibrary();
 
        // Iterating over books using for each loop
        for (Book bk : bks) {
 
            // Printing the title and author name of book on
            // console
            System.out.println("Title : " + bk.title
                               + " and "
                               + " Author : " + bk.author);
        }
    }
}
```

Output:

```
Title : EffectiveJ Java and  Author : Joshua Bloch
Title : Thinking in Java and  Author : Bruce Eckel
Title : Java: The Complete Reference and  Author : Herbert Schildt
```