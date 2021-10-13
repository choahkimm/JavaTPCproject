package Part2.poly;

public class Cat extends Animal {

    public void night() {
        System.out.println("밤에 야옹 하고 운다");
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("고양이처럼 먹다");
    }
}
