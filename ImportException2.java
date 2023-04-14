import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

class ImportException2{
    public void show()throws FileNotFoundException,IOException,SQLException{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int a=sc.nextInt();

    if(a<0) throw new FileNotFoundException();
    else if(a>0) throw new IOException();
    else throw new SQLException();
    }

    public static void main(String[] args){
        ImportException2 m=new ImportException2();
try{
 m.show();   
}
catch(FileNotFoundException ex){
    System.out.println("Error File not found.");
}

catch(IOException ex){
    System.out.println("IOEXCEPTION.");
}

catch(SQLException ex){
    System.out.println("SQLEXCEPTION.");
}
    }
}