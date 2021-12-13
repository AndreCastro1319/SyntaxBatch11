package Class28HW;

import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class Person {

        //Create a Person class with following private fields: name, lastName, age, salary.
        //Variables should be initialized through constructor.
        //Inside the class also create a method to print user details.
        //In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.

   private String name;
   private String lastName;
   private int age;
   private double salary;

  public Person(String name, String lastName, int age, double salary) {
      this.name = name;
      this.lastName = lastName;
      this.age = age;
      this.salary = salary;
  }

       void printInfo(){
           System.out.println(name+" "+lastName+" is "+age+" years old with a salary of "+salary);
       }
   }
   class PersonTester {
       public static void main(String[] args) {


           Person person = new Person("Jimmy", "Castro", 30, 500000);
           Person person1 = new Person("Sebastian", "Castro", 4, 1000000);
           Person person2 = new Person("Mateo", "Castro", 5, 500000);
           Person person3 = new Person("Carolina", "Rojas", 30, 800000);

           TreeMap<Integer, Person> personTreeMap = new TreeMap<>();
           personTreeMap.put(1,person);
           personTreeMap.put(2,person1);
           personTreeMap.put(3,person2);
           personTreeMap.put(4,person3);
           Collection<Person> value = personTreeMap.values();
           for(Person values:value){
               values.printInfo();
           }
       }
   }










