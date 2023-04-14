class Pattern30v2{
    public static void main(String[] args){
    int i,j;
    for(i=1;i<=5;i=i+1)
       {
        for(j=2;j<=i;j=j+1)
        {
            System.out.print(" ");
        }
        for(j=1;j<=1;j=j+1)
        {
            System.out.print("*");
        }
        for(j=i;j<=5;j=j+1)
        {
            System.out.print(" ");
        }
        for(j=5-i;j>=1;j=j-1)
        { 
            System.out.print(" ");
        }
        for(j=1;j<=1;j=j+1)
        {
            System.out.print("*");
        }
        System.out.println();
       }
 }
}
    
