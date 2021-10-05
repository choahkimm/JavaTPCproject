package Part2;

import Part2.kr.Animal;
import Part2.kr.Cat;
import Part2.kr.Dog;

public class TPC22 {
    public static void main(String[] args) {
        // 객체 형 변환 : 상속 관계에 있는 클래스들 간의 형(data type)을 바꾸는 것
        // upcasting, downcasting

        // 업 캐스팅
        Animal ani = new Cat();
        Object ani2 = new Cat(); // 이것도 가능
        ani.eat(); // 컴파일 시점에서는 Animal이지만, 실행 시점에선 Cat

        //ani.night();  // animal에는 없으니까 에러
        Cat c = (Cat) ani;
        c.night();
        ((Cat)ani).night(); // 다운 캐스팅

        ani = new Dog();
        ani.eat();

        // 여기서 다형성 개념이 나옴!
        // 상위 클래스가 하위 클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리
        // -> 그럼 어떤 경우에 활용하는가?

    }
}
