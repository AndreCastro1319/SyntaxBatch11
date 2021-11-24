package Class22.example2;



public class PersonTester {
    public static void main(String[] args) {
           Person [] persons={new Employee("Carlos"),new Student("Jimmy"),new Teacher("Ashgar")};
            for(Person person:persons) {
                person.performDailyTasks();

               if (person instanceof Teacher) {
                    ((Teacher) person).designClass();
                }


             //  Person person1=new Teacher("Blues Clues");
            //     Teacher teacher=(Teacher) person1;
             //     teacher.designClass();


            }
    }
            }

     //   Teacher teacher = new Teacher("Jimmy");
      //  teacher.eat();




