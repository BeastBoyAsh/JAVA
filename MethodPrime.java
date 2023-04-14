import java.util.Scanner;
class MethodPrime{
    public void prime(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            int a=sc.nextInt();
            System.out.println("A is  "+a);
            int i,c=0;
            for(i=1;i<=a;i=i+1){
               {
                   if(a%i==0){
                    c=c+1;
                   }
               }
            }
            if(c==2){
            System.out.println("The Number is Prime integer "+a);
            }
            else
            System.out.println("The Number is NonPrime integer "+a);
        
        } 

    public static void main(String[] args){
        MethodPrime a=new MethodPrime();
    a.prime();
    }
}



