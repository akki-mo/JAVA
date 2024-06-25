public class Strdemo
{
    public static void main(String[] args)
    {
        String s = new String("Hello");
        System.out.println("S :"+s);
        //String st = "Hello";

        //System.out.println("Hashcode :" +s.hashCode());

        String st = new String("Hello");
        System.out.println("St :"+st);
        //System.out.println("Hashcode :" +s.hashCode());


        if (s == st)
        {
            System.out.println("same");

        }
        else{
            System.out.println("Not same");
        }

        if(s.equals(st))
        {
            System.out.println("same");

        }
        else{
            System.out.println("Not same");
        
        
        }
        

    }
}