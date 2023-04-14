class Pattern21{
    public static void main(String[] args){
    int i,j;
    for(i=1;i<=5;i=i+1)
       {
        for(j=1;j<=i;j=j+1)
        {
            System.out.print(j);
        }
        for(j=i-1;j>=1;j=j-1)
        {
            System.out.print(j);
        }
        System.out.println();
       }
 }
}
    
