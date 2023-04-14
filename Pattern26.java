class Pattern26{
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
            System.out.print("*");
        }
        for(j=i-1;j>=1;j--)
        { 
            System.out.print("*");
        }
        System.out.println();
       }

       for(i=1;i<=4;i=i+1)
       {
       for(j=1;j<=i;j=j+1)
       {
       System.out.print(" "); 
       }
       for(j=i;j<=4;j=j+1)
       {
       System.out.print("*"); 
       }
       for(j=i-1;j<=2;j=j+1)
       {
       System.out.print("*"); 
       }
       System.out.println();
    }
        
       
}
}
    
