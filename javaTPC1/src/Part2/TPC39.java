package Part2;

public class TPC39 {
    public static void main(String[] args) {
        // 기본자료형을 객체 자료형으로 사용할 수 있도록 만들어 놓은 자료형 (포장 클래스)
        // 기본자료형    객체자료형
        // int          Integer
        // float        Float
        // char         Character
        // boolean      Boolean

        int a=1;
        Integer b = new Integer(1); // Boxing
        System.out.println(b.intValue()); // 1
        System.out.println(b.toString()); // "1"

        Object[] obj = new Object[3];
        // Object 같은 배열에 저장하기 위해선 객체 자료형으로 바꿔서 저장해야하기 때문
        obj[0] = new Integer(1);
        obj[1] = new Integer(2);
        obj[2] = new Integer(3);
        // 근데 new 없이 그냥 쓰는 게 바람직 (boxing)

        System.out.println(obj[0]);
        System.out.println(obj[1]);
        System.out.println(obj[2]);

        // "100" + "100" = 200
        String x = "100";
        String y = "100";
        int v1 = Integer.parseInt(x);
        int v2 = Integer.parseInt(y);

        System.out.println(v1 + v2);

        // 100 + 100 = "100100"
        String s1 = String.valueOf(v1);
        String s2 = String.valueOf(v2);
        System.out.println(s1+s2);

    }
}
