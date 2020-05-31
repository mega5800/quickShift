package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private int id;
    private String username;
    private String password;
    static int idGenerator = 0;

    public Login() {
    }

    public Login(String username, String password) throws SQLException {
        idGenerator = getCurrId();
        this.id = ++idGenerator;
        this.username = username;
        this.password = password;
    }


    static int getCurrId() throws SQLException {
        Connection con = ConnectionManager.getConnection();

        int id=0;

        try{
            String sql = "SELECT MAX(id) FROM user_info";
            PreparedStatement st = con.prepareStatement(sql);
            if(st != null){
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    if(rs.getString(1) != null){
                        id = Integer.parseInt(rs.getString(1));
                    }
                }
            }

        }catch(SQLException e){
            System.out.println("Unable to retrieve data from DB");
        }
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
