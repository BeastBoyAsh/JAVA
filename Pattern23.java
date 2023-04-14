class Pattern23{
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
            System.out.print(j);
        }
        for(j=i-1;j>=1;j--)
        { 
            System.out.print(j);
        }
        System.out.println();
       }
 }
}
    
