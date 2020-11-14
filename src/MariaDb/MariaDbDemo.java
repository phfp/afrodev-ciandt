package MariaDb;

import java.sql.Statement;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.StatementEvent;

public class MariaDbDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;

        try {
            try {

                String nome = "Maria";
                String sobrenome = "Pereira";
                String paisOrigem = "Brasil";

                String insertAutor = "insert into authors (name_last, name_first, country) values('"+sobrenome+"', '"+nome+"','"+paisOrigem+"')";
                String updatetAutor = "update authors set name_last = 'José' where author_id = '37'";
                String deletetAutor = "delete from authors where author_id = '39'";
                String selectAutor = "select *from authors";

                con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bookstore?user=phfp");
                //con.setAutoCommit(false);

                pstmt = con.prepareStatement(insertAutor);
                pstmt.execute();

                pstmt = con.prepareStatement(updatetAutor);
                pstmt.execute();

                pstmt = con.prepareStatement(deletetAutor);
                pstmt.execute();

                ResultSet resultado = pstmt.executeQuery(selectAutor);

                while(resultado.next()){
                    int idAutor = resultado.getInt("author_id");
                    String ultimoNome = resultado.getString("name_last");
                    String primeiroNome = resultado.getString("name_first");
                    String pais = resultado.getString("country");     
                    System.out.println("ID: "+idAutor+" | Último nome: "+ultimoNome+" | Primeiro nome: "+primeiroNome+" | País: "+pais);                 
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
                
        } finally{
            
        }
    }
    
}
