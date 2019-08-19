package com.wipro.frs.service;
import com.wipro.frs.dao.DaoAdmin;
import com.wipro.frs.dao.DaoPassenger;
import com.wipro.frs.bean.AdminBean;
import com.wipro.frs.bean.PassengerBean;
public class ValidationClass 
{
	public boolean validateAdmin(String name, String password) throws Exception
	{
		try
		{
		DaoAdmin da= new DaoAdmin();
		AdminBean ab= new AdminBean();
		ab.setName(name);
		ab.setPassword(password);
		return da.isAdmin(ab);
		}
		catch (Exception e)
		{
			System.out.println(" Admin validation error");
			return false;
		}
		
	}
	public boolean validatePassenger(String email_id, String password) throws Exception
	{
		try
		{
			DaoPassenger dp = new DaoPassenger();
			PassengerBean pb = new PassengerBean();
			pb.setEmail_id(email_id);
			pb.setPassword(password);
			return dp.isPassenger(pb);
		
		}
		catch (Exception e)
		{
			System.out.println("Passenger validation error @ validation class");
			return false;
		}
		
	}
	
	
}


