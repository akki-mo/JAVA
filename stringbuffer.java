public class stringbuffer {

    public static void main(String[] args) {
        String  s = "Hello";
        System.out.println(s);

        StringBuffer b = new StringBuffer("hello");
        
        System.out.println(b);
        b.append(" World");
       // b.insert(2,"java");
        System.out.println(b.hashCode());
        System.out.println(b);
        System.out.println(b.hashCode());
        b.insert(2,"java");
        System.out.println(b);
        System.out.println(b.hashCode());
        

    }
    
}
