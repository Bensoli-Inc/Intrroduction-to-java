//  integers >> integers, short, long, byte
//     float >> double, float
// character >> character
//   boolean >> true/false


class Main
{
    public static void main(String[] args) 
    {
        int num1 = 9; //4bytes
        int num2 = 0b101;
        int num3 = 1_000_000;
        byte by = 127; //1byte
        short sh =558; //2bytes
        long l = 5854l; //8bytes

        float f = 5.8f; //4 bytes
        double d= 5.8; //8bytes

        char c = 'k'; 
        char t = '7';
        boolean b = true;

        System.out.println(num3);
    }
}