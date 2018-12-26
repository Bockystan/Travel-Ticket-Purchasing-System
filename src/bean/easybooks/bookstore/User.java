package bean.easybooks.bookstore;
import java.sql.*;
import org.easybooks.bookstore.jdbc.*;

public class User {
	private String username;
	private String password;

public User(){
	username = "xu";
	setPassword("123456");
	
}

public String getUsername(){
	
	return username;
}
public void setUsername(String username){
	
	this.username =  username;
}
public String getPassword(){
	
	return password;
}
public void setPassword(String password){
	
	this.password =  password;
}
public boolean isValidated(){
	
	boolean exist = false;
	String sql = "select *from user where username = '"+username+"' and password = '"+password+"'";
	MySQLConnBean jdbc = new MySQLConnBean();
	
	try{
		
		jdbc.OpenConn();
		ResultSet rs = jdbc.executeQuery(sql);
		if(rs!=null && rs.next())
			exist = true;
	}catch (Exception e){
		e.printStackTrace();
	}
	jdbc.closeStmt();
	jdbc.closeConn();
	return exist;
}

}
