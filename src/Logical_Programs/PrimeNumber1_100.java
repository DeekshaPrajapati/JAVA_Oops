package Logical_Programs;

public class PrimeNumber1_100 {

    public static void main(String args[]){
        int temp=0;
        for(int i=1; i<=100;i++)
        {

            for(int j = 2; j<=i-1; j++)
            {
                if(i%j==0)
                {
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.printf(String.valueOf(i));
            }
            else{
                temp=0;
            }
        }
    }
}
