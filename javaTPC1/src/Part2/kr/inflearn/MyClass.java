package Part2.kr.inflearn;

public class MyClass {
    // default 접근 권한

    public int sum(int a, int b) {
        int hap=0;
        for(int i=a; i<b; i++){
            hap+=i;
        }
        return hap;
    }
}
