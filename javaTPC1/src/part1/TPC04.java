package part1;

public class TPC04
{
    public static void main(String[] args)
    { // 4. 데이터를 이동하라(변수 vs 배열)
        int a,b,c;
        a=10;
        b=20;
        c=30;
        hap(a,b,c); // 메서드 호출

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        hap1(arr);
    }
    // a+b+c 메서드 처리를 hap()으로
    public static void hap(int x, int y, int z){
        int sum = x+y+z;
        System.out.println(sum);
    }
    public static void hap1(int[] x){
        // 반복문 활용하면 쉽게 가능 :  for, while
        // int sum = x[0] + x[1] + x[2];
        int sum=0;
        for(int i=0; i<x.length; i++){
            sum+=x[i];
        }
        System.out.println(sum);
    }
}
