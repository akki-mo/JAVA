public class Immutable {
    public static void main(String[] args)
    {
        String s= "Hello";
        String s1 = "How Are You";
        System.out.println(s);
        System.out.println(s1);
        System.out.println("HashCode s : "+s.hashCode());
        System.out.println("HashCode s1 : "+s1.hashCode());

        




        s = s+s1;
        System.out.println(s);

        System.out.println("HashCode s : "+s.hashCode());
       // System.out.println(s);

    }
}
