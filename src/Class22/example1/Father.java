package Class22.example1;

public class Father {
    String name;
    Father(String name){
      this.name=name;
    }
    void sleep(){
        System.out.println(name+"I like to sleep 8 hours");
    }
    void eat(){
        System.out.println(name+"i like to eat veggies");
    }
}
