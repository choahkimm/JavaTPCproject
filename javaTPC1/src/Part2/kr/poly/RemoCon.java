package Part2.kr.poly;

public interface RemoCon {
    // 인터페이스는 객체 생성 X  : RemoteCon r = new RemoteCon(); 안된다는 소리

    // 상수를 수정 가능
    public int MAXCH = 100; // RemoCon.MAXCH  이런 식으로 접근
    public final static int MINCH = 1;


    // 추상 메서드
    public abstract void chUp(); // 인터페이스에선 암묵적으로 abstract
    public void chDown();
    public void internet();
}
