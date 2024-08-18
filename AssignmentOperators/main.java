class  Main 
{
    public static void main(String[] args) 
    {
        int num1 = 7;
        int num2 = 5;

        int result = num1 + num2;
        int result1 = num1 - num2; 
        int result2 = num1 / num2; 
        int result3 = num1 * num2; 
        int result4 = num1 % num2;  //modulus operator shows remainder

        num1 = num1 + 2;
        num2 += 2; //shortcut
        num2 *=2;
        num1++; //fetch value then increament
        ++num1; //do the increament then fetch new value
        num2--; //decreamenting

        System.out.println(result4);
    }
}