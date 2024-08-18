
public class Main
{
    public static void main(String[] args)
    {
        //FIRST STATEMENT
        int x = 28;
        
        if(x>10 && x<=20)
          System.out.println("Hello");
        else
          System.out.println("Bye");

        
        //SECOND STATEMENT
        int a = 5;
        int b = 7;

        if(a>b)
        {
            System.out.println(a);
            System.out.println("Thank you");
        }
        else
        System.out.println(b);

        //THIRD STATEMENT
        int i = 8;
        int j = 7;
        int k = 9;

        if(i>j && i>k)
        {
            System.out.println(i);
            System.out.println(i + " is greatest");
        }
        else if (j>k) {
            System.out.println(j);
            System.out.println(j + " is greatest");
        }
        else
            System.out.println(k);
            System.out.println(k + " is greatest");
        
    }
}