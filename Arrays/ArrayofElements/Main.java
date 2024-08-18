public class Main
{
    public static void main(String[] a)
    {
        int nums[] = {5, 7,8,9};

        nums[1] = 6;
        for(int i=0;i<4;i++)
        System.out.println(nums[i]);
        

        //dynamic allocation to the heap
        int numss[] = new int[4];
        numss[0] = 3;
        numss[1] = 7;
        numss[2] = 13;
        numss[3] = 23;

        for(int j=0;j<4;j++)
        System.out.println(numss[j]);
        
    }
}