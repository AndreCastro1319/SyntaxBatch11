package Class22.example1;

import Class22.example1.Father;

public class Son2 extends Father {
    Son2(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println(name + "i like to eat fish");
    }
}
