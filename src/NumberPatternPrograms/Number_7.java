package NumberPatternPrograms;
/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
public class Number_7 {
    public static void main(String args[]){
        int j,i;
       for(i=1;i<=5;i++)
       {
           int no=i;
           for(j=1;j<=i;j++)
           {
               System.out.print(no+" ");
               no=no+5-j;
           }
           System.out.println();
       }
    }
}
