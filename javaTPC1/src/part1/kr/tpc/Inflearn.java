package part1.kr.tpc;

public class Inflearn
{
    private Inflearn(){} //생성자 메서드가 private이면 모든 멤버는 static 붙은 멤버가 되어야 한다 !

    //public Inflearn(){}


    // 인스턴스 메서드
    public static void tpc(){
        System.out.println("I can do it!!!!");
    }
    // 클래스 메서드
    public static void java(){
        System.out.println("Java is my life");
    }
}
