package UPI_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dao {

	public boolean withdraw(int accountNumber, double amount) {

		try (Connection c = dbcon.getMyDbConnection()) {
			PreparedStatement ps = c.prepareStatement("SELECT balance FROM user WHERE Accno=? ");
			ps.setInt(1, accountNumber);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				double balance1 = rs.getDouble("balance");

				if (balance1 > amount) {
					double newbalance = balance1 - amount;

					PreparedStatement ps1 = c.prepareStatement("UPDATE user SET balance=? WHERE Accno=?");
					ps1.setDouble(1, newbalance);
					ps1.setInt(2, accountNumber);

					ps1.executeUpdate();
					return true;

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deposit(int receiveracc, double amount, int senderacc) {
		Connection con=null;
		try  {
			con=dbcon.getMyDbConnection();
			 con.setAutoCommit(false);
			PreparedStatement ps1=con.prepareStatement("SELECT balance FROM user WHERE Accno=?");
			ps1.setInt(1, senderacc);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				double availBalanace=rs.getDouble("balance");
				if(availBalanace>=amount)
				{
					
					
					//reduces from sender
					PreparedStatement ps2=con.prepareStatement("UPDATE user SET balance=balance - ? WHERE Accno=?");
					ps2.setDouble(1, amount);
					ps2.setInt(2, senderacc);
					int row1=ps2.executeUpdate();
					
					//add to receiver
					
					PreparedStatement ps3=con.prepareStatement("UPDATE user SET balance=balance + ? WHERE Accno=?");
					ps3.setDouble(1, amount);
					ps3.setInt(2, receiveracc);
					int row2=ps3.executeUpdate();
					
					if(row1>0 && row2>0)
					{
						con.commit();
						return true;
					}
					
					
				}
			}
			
			
		}catch (Exception e) {
	        try {
	            if (con != null) con.rollback();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        e.printStackTrace();
	    }

		return false;
	}

}
