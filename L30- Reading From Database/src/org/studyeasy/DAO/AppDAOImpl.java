package org.studyeasy.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.studyeasy.model.User;



public class AppDAOImpl implements AppDAO {

	// to connect to database
	private DataSource datasource;

	public AppDAOImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

	@Override
	public List<User> listUsers() {
		String SQL = "select * from users";
		List<User> listUsers = new ArrayList<User>();
		Connection conn = null;

		try {
			conn = datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User temp = new User(rs.getInt("user_id"),rs.getString("name"),rs.getString("email"));
				
				listUsers.add(temp);
			}
			rs.close();
			ps.close();
			return listUsers;
		} catch (Exception e) {
			e.printStackTrace();
			// if some exception occurs we need to return something in catch block as well.
			return null;
		}finally {

			if(conn !=null) {
				try {
					conn.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
