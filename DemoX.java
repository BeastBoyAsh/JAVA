import java.sql.*;
class Demox{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecord","root","mysql/8422");
        Statement stmt=con.createStatement();
        String q="insert into profile value(101,'A',40)";
        int rs=stmt.executeUpdate(q);
        if(rs!=0)
        {
            System.out.println("SAVE");
        }
        con.close();
    }
}