package Part2.poly;

public class TV implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("TV 채널 위로");
    }

    @Override
    public void chDown() {
        System.out.println("TV 채널 아래로");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 접속");
    }
}
