package Part2;

import Part2.kr.poly.Animal;
import Part2.kr.poly.Cat;
import Part2.kr.poly.Dog;

public class TPC25 {
    public static void main(String[] args) {
        // 추상클래스 활용 (일부 다형성 보장)
        // 다형성이 프로그램 내부에서 적용이 되기 위해서는?

        // 추상 클래스 = 구현부가 없다 = 불완전한 메서드 = 혼자서는 사용 불가 = 자식이 추상 메서드를 반드시 재정의(Override) 해야
        // abstract class

        // 부모가 인터페이스인 경우 다형성을 100% 보장(=부모가 명령 내렸을 때 자식이 반드시 동작 하게 하는 것)
        // upcasting (부모의 역할로 사용 -> 명령 내리는 쪽)
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();


    }
}
