package NumberPatternPrograms;
/*
1
21
321
4321

 */
public class Number_4 {
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<5;i++)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
