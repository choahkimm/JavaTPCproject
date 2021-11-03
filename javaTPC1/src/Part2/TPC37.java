package Part2;


import Part2.kr.tpc.A;
import Part2.kr.tpc.B;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import kr2.inflearn.ObjectArray;

import java.util.ArrayList;

public class TPC37 {
    public static void main(String[] args) {
        //ObjectArray arry = new ObjectArray(5); // 만든 api
        ArrayList arry = new ArrayList(5); // arrayList() : 길이 제약 x
        arry.add(new A());
        arry.add(new B());
        arry.add(new A());
        arry.add(new B());

        for(int i=0; i< arry.size(); i++){
            Object o = arry.get(i);
            if(o instanceof A){
                ((A)o).go();
            }else{
                ((B)o).go();
            }
        }
    }
}
