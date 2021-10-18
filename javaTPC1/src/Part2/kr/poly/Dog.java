package Part2.kr.poly;

public class Dog extends Animal {

    public Dog() { // 생성자
        super();
    }

    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}
