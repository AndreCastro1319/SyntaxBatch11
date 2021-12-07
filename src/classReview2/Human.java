package classReview2;

public abstract class Human {



   protected String name,lastName;
   public static boolean brain;

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public void printInfo(){
        System.out.println(name+" "+lastName);
    }
   static void eat(){
        System.out.println("All humans eat");
    }
   static void sleep(){
        System.out.println("All humans sleep");
    }
    private void live(){
        System.out.println("This method is useless");
    }
    abstract void speak();
}
