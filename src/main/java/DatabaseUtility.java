

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtility {
	Connection con=null;
	
	/**
	 * This method is used to get connection to Database.
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException
	{
		con=DriverManager.getConnection(IPathConstants.DBURL, IPathConstants.DBUSERNAME, IPathConstants.DBPASSWORD);
		
	}
	
	
	/**
	 * This method is used to execute a query in database and return a result.
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @throws Throwable
	 */
	public void executeQueryAndGetData(String query,int columnIndex,String expData ) throws Throwable 
	{
		ResultSet res = con.createStatement().executeQuery(query);
		boolean flag = false;
		while(res.next())
		{
			String data = res.getString(columnIndex);
			if(data.equalsIgnoreCase(expData))
			{
				System.out.println(expData+" is Verified");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(expData+" is not Verified");
		}
	}
	
	
	/**
	 * This method is used to close the database
	 * @throws Throwable
	 */
	public void closeDB() throws Throwable	
	{
		con.close();
		System.out.println("Database connection closed");
	}

}
