package javapractice.practide;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Singletion {
    public static List<Integer> itemsort(List<Integer> arr) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        arr.sort((k1,k2)->{
            int freqcomp=freq.get(k1).compareTo(freq.get(k2));
            return (freqcomp==0)?Integer.compare(k1,k2):freqcomp;
        });
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> in= Arrays.asList(1,2,3,3,5,6);
        System.out.println(itemsort(in));
    }

}
