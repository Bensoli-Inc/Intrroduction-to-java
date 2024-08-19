public class Main 
{
    public static void main(String[] a)
    {
       StringBuffer sb = new StringBuffer();
       System.out.println(sb.capacity()); //16bytes

       StringBuffer sb1 = new StringBuffer("ben");
       System.out.println(sb1.capacity()); //19bytes -extra space
       
       System.out.println(sb1.length()); //length = 3 elements

       //appendind 
       sb1.append(" soli");
       System.out.println(sb1);

       //assign buffer data to string
    //    String str = sb1; //error
       String str = sb1.toString(); //use toString to convert

       //delete something
       sb1.deleteCharAt(1);
       System.out.println(sb1);

       //inseert string at some location
       sb1.insert(0, "hello ");
       System.out.println(sb1);
    }
}