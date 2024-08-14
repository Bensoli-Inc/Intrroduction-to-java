
class Main 
{
    public static void main(String[] args)
    {
        byte b = 127;
        int a = 256;
        a = b; //implicit conversion

        byte d =127;
        int c =12;
        d = (byte)c; //casting

        //converting float to integer
        float f = 5.6f;
        int x = (int)f;

        byte j = 10;
        byte k = 30;
        int result = j*k;

        System.out.println(result);

    }
}