class Pattern25{
    public static void main(String[] args){
    int i,j;
    for(i=1;i<=5;i=i+1)
       {
        for(j=4;j>=i;j=j-1)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j=j+1)
        {
            {
                if(j%2!=0)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
        }
        for(j=i-1;j>=1;j--)
        {
            {
                if(j%2!=0)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
        }
        System.out.println();
       }
 }
}
    
