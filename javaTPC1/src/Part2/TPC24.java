package Part2;

import Part2.kr.bit.Animal;
import Part2.kr.bit.Cat;
import Part2.kr.bit.Dog;

public class TPC24 {
    public static void main(String[] args) {
        // 다형성 활용 방법

        // 2. 다형성 배열(서로 다른 객체를 담을 수 있다.)
        //    부모 배열을 만들면 자식 타입이 다르다 하더라도 배열에 담을 수 있다.
        Animal[] ani = new Animal[2];
        ani[0] = new Dog();
        ani[1] = new Cat();

        for (int i = 0; i < ani.length; i++) { //다형성 배열
            ani[i].eat();
            if (ani[i] instanceof Cat) {
                ((Cat)ani[i]).night();
            }
        }
        display(ani); // 별도의 메서드를 만들어서 출력할 수도 있다!
    }

    private static void display(Animal[] ani) {

        for (int i = 0; i < ani.length; i++) { // 다형성 배열
            ani[i].eat();
            if (ani[i] instanceof Cat) {
                ((Cat) ani[i]).night();
            }
        }
    }
}