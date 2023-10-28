package Com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class UserDAO {
	private Connection conn;

	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean addUser(User u)
	{
		boolean f=false;
		try {
			String sql = "insert into user (name, qualification, email, password, role) values (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement (sql);
			ps.setString(1, u.getName());
			ps.setstring(2, u.getQualification());
			ps.setstring(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.setString(5, "user");
			int i= ps.executeUpdate();
			if (i ==1) {

				f= true;
}

} catch (Exception e) {

e.printStackTrace();
			
		
		}
		return f;	
		}
	

}
