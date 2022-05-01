public class Main {

    public static void main(String[] args){

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
       // short s2 = 40000; esta ultrapasando o limite

       // int i1 = -100000000000; esta ultrapassando o limite
        int i2 = 20500;

        long l1 = 1000000000000000000L; //precisa colocar o L no final para ser long
        long l2 = 1000000000000000000L;

        //float f1 = 4.5; precisa colocar o F para ser float
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.84d;

        char c1 = 'W';
       // char c2 = 'Tw'; o char so recebe um caracter
        char c3 = '\u0057'; //

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se at t ";

        //String dt1 = "09/02/1931"; a um tipo de dado especifico para datas

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);






    }
}
