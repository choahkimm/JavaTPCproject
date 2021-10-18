package Part2.kr.poly;

public class TV implements RemoCon {

    int currCH = 70;

    @Override
    public void chUp() {
        if(currCH < MAXCH){
            currCH++;
            System.out.println("TV 채널이 위로 간다 : " +currCH);
        }else{
            currCH=1;
            System.out.println("TV 채널이 위로 간다 : " +currCH);
        }

    }

    @Override
    public void chDown() {
        if(currCH > MAXCH){
            currCH--;
            System.out.println("TV 채널이 내려 간다 : " +currCH);
        }else{
            currCH=100;
            System.out.println("TV 채널이 내려 간다 : " +currCH);
        }

        System.out.println("TV 채널 아래로");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 접속");
    }
}
