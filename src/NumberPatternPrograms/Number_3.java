package NumberPatternPrograms;
/*
      1
      23
      456
      78910
 */
public class Number_3 {
    public static void main(String args[]){
        int i,j,count=0;

        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                count=count+1;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
