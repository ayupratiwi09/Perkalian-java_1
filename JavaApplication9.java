package javaapplication9;

public class JavaApplication9 {

    public static void main(String[] args) {
        String st1 = "saya suka makan bakso";
        String st2 = "saya suka makan bakso";
        String st3 = "saya ";
        String st4 = "suka makan ";
        String st5 = "bakso";
        String st6 =st3+st4+st5;
         
        System.out.println("st1: "+ st1);
        System.out.println("st2: "+ st2);
        System.out.println("st3: "+ st3);
        System.out.println("st4: "+ st4);
        System.out.println("st5: "+ st5);
        System.out.println("st6: "+ st6);
        
        System.out.println("Membandingan dengan Operator ==");
        System.out.println("st1==st2 : "+ (st1==st2));
        System.out.println("st6==st1 : "+ (st6==st1));
        System.out.println("st6==st2 : "+ (st6==st2));
        
        System.out.println("Membandingan dengan Metode equal");
        System.out.println("s1.equal(st2): "+(st1.equals(st2)));
        System.out.println("s6.equal(st1): "+(st6.equals(st1)));
        System.out.println("s6.equal(st2): "+(st6.equals(st2)));
    }
    
}
