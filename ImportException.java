import java.io.IOException;
class ImportException{
    public void show()throws IOException{
     throw new IOException();
    }
    public static void main(String[] args){
        ImportException m=new ImportException();
     
     try{ 
        m.show(); 
        } catch(IOException ex) {
            System.out.println("IOError");
        }
    }
}