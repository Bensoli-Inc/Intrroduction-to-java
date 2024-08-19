
public class Main
{
    public static void main(String[] a)
    {
        int nums[][][] = new int[3][4][5]; 
    

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    nums[i][j][k] = (int)(Math.random() * 10);
                    System.out.print(nums[i][j][k] + " ");
                } System.out.println();
            }System.out.println();
        }
            
//Enhanced for loop
    //     for(int m[][] : nums)
    //     {
    //         for (int n[] : m)
    //         {
    //                 for(int p : n)
    //             {
    //                 System.out.print(p + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    }
}