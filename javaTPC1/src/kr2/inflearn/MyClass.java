package kr2.inflearn;

public class MyClass
{
    // default 접근 권한

    public int sum(int a, int b) {
        int hap=0;
        for(int i=0; i<b; i++){
            hap+=i;
        }
        return hap;
    }
}
