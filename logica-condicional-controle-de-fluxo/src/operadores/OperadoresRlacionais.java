package operadores;
public class OperadoresRlacionais {
    public static void main(String[] args) throws Exception {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'Y';
        String s1 = "Danny";
        String s2 = "Cris";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 12346;
        long l2 = 12346;
        byte y1 = 1;
        short h1 = 25;


        System.out.println("i1 = i2" + (i1 == i2));
        System.out.println("i1 != i2" + (i1 != i2));
        System.out.println("i1 <= i2" + (i1 <= i2));
        System.out.println("i1 >= i2" + (i1 >= i2));

        System.out.println("f1 = f2" + (f1 == f2));
        System.out.println("f1 != f2" + (f1 != f2));
        System.out.println("f1 <= f2" + (f1 <= f2));
        System.out.println("f1 >= f2" + (f1 >= f2));

        System.out.println("c1 = c2" + (c1 == c2));
        System.out.println("c1 != c2" + (c1 != c2));
        System.out.println("c1 <= c2" + (c1 <= c2));
        System.out.println("c1 >= c2" + (c1 >= c2));

        System.out.println("s1 = s2" + (s1 == s2));
        System.out.println("s1 != s2" + (s1 != s2));
        //System.out.println("s1 <= s2" + (s1 <= s2));
        //System.out.println("s1 >= s2" + (s1 >= s2));

        System.out.println("b1 = b2" + (b1 == b2));
        System.out.println("b1 != b2" + (b1 != b2));
        //System.out.println("b1 <= b2" + (b1 <= b2));
        //System.out.println("b1 >= b2" + (b1 >= b2));

        System.out.println("l1 = l2" + (l1 == l2));
        System.out.println("l1 != l2" + (y1 != h1));
        System.out.println("l1 <= l2" + (l1 <= l2));
        System.out.println("l1 >= l2" + (l1 >= l2));

        
    }
}
