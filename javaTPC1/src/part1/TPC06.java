package part1;

public class TPC06
{
    public static void main(String[] args)
    {
        // 5. 메서드와 변수의 관계
        // 메서드 : 동작, 기능

        int a= 67;
        int b= 98;
        int result = sum(a,b); // 매개변수 전달기법
        System.out.println(result);
        // 메서드 이름이 변수 역할을 한다는..

        int[] arr = makeArr(); // 10,20,30 이 넘어옴
        int hap=0;
        for(int i=0; i<arr.length; i++){
            hap+=arr[i];
        }
        System.out.println(hap);
    }

    // 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오
    public static int sum(int a, int b){
        int v = a+b;
        return v;
    }

    public static int[] makeArr(){
        int x=10;
        int y=20;
        int z=30;
        int[] arr = new int[3];
        arr[0]=x;
        arr[1]=y;
        arr[2]=z;

        return arr;


    }
}
