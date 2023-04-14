class Pattern19{
    public static void main(String[] args){
    int i,j,c=0;;
    for(i=1;i<=5;i=i+1)
       {
           c=i;
        for(j=1;j<=i;j=j+1,c++)
        {
            System.out.print(c);
        }
        System.out.println();
       }
 }
}
    
