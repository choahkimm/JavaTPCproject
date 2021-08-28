package part1;

public class TPC08 {
    public static void main(String[] args) {
/*
JVM이  TPC08 class(실행 클래스)를 실행하는 절차

1. 해당 클래스를 현재 디렉토리에서 찾는다.
2. 찾으면 클래스 내부에 있는 static 키워드가 있는 메서드를 메모리로 로딩 한다.
 - method Area의 static zone에 로딩 한다.
3. static zone 에서 main() 메서드를 실행한다(호출, 시작)
 - main() 메서드가 호출되면 호출 정보다 Stack Area로 들어간다.
 - 프로그램이 시작되는 부분이다. (PC의 위치가 현재 동작되고 있는 메서드다)
4. Stack Area가 비어 있으면 프로그램이 종료된 것이다.
 */
        int a=30;
        int b=40;
        int v=add(a,b); //static method call
        System.out.println(v);
    }

    public static int add(int a, int b){
        int sum= a+b;
        return sum;
    }
}
