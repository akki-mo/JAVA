public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder B = new StringBuilder("Hello");
        System.out.println(B);

        System.out.println(B.hashCode());

        B.append(" Akshay");
        System.out.println(B);
        System.out.println(B.hashCode());

    }
    
}    