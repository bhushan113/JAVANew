package javapractice.practide;
//randomnumber,char,UUID,
import java.util.Random;

class Hello1 {
    public static void main(String[] args) {
        Random random = new Random();
        char ran = (char)(random.nextInt(26)+'a');
        System.out.println(ran);
        int ran1 = random.nextInt(1000);
        System.out.println(ran1);
         new Hello1(ran1);
        String s="abcd";
        new Hello1(s);
    }
    public Hello1(String nm){
        System.out.println(nm);
    };

    public Hello1(int age) {
        System.out.println(age);
    };

}