package Part2;

import Part2.kr.Animal;
import Part2.kr.Cat;
import Part2.kr.Dog;

public class TPC23 {
    public static void main(String[] args) {
        // 다형성 (polymorphism)   --- 리모콘
        // 상속 관계에 있는 클래스에서 상위 클래스가 동일한 메시지로 하위 클래스들을 서로 다르게 동작시키는 객체지향 원리
        // ex) Animal클래스가 하위 클래스인 Dog, Cat에게 동일하게 먹어라(eat)고 메시지 보냈을 때 서로 다르게 동작
        
        // 다형성 이론의 전제조건 => 부모 클래스를 잘 사용하라
        // [동적 바인딩]을 통해 실현된다 (실행시점에서 사용될 메서드가 결정되는 바인딩. 프로그램 속도 저하 원인)

        // 다형성 활용 방법
        // 1. 다형성 인수(데이터 이동) : 다양한 형태의 파라미터를 받을 수 있다!
        //    ex: public static void display(부모타입)
        Dog d= new Dog();
        display(d);
        Cat c= new Cat();
        display(c);
    }

    private static void display(Animal r) { //다형성 인수
        r.eat();
        if(r instanceof Cat){  // instanceof는 객체 타입을 확인하는 연산자
            ((Cat) r).night(); // downcasting
        }
    }
}
