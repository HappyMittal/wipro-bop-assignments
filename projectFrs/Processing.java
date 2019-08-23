package com.wipro.frs.service;
import com.wipro.frs.dao.DaoAdmin;
import com.wipro.frs.dao.DaoPassenger;
import com.wipro.frs.dao.DaoTicket;

import java.sql.Date;

import com.wipro.frs.bean.AdminBean;
import com.wipro.frs.bean.PassengerBean;
import com.wipro.frs.bean.TicketBean;
import com.wipro.frs.dao.DaoDate;
import com.wipro.frs.bean.DateBean;
public class Processing 
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
	public boolean checkDate(String date) throws Exception
	{
		try 
		{
			DaoDate dd= new DaoDate();
			DateBean db= new DateBean();
			db.setDate(date);
			return dd.isDate(db);
		
		}
		catch (Exception e)
		{
			System.out.println("Mistake @ validation class");
			return false;
			
		}
	}
		public int getPassengerId(String email_id, String password) throws Exception
		{
			PassengerBean p= new PassengerBean();
			DaoPassenger dp= new DaoPassenger();
			p.setEmail_id(email_id);
			p.setPassword(password);
			try {
				return dp.returnPassengerId(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
		}
		public int generateTicket(int flightId,int passId, String depTime,String date,String passengers) throws Exception
		{
			try 
			{
				TicketBean tb= new TicketBean();
				DaoTicket dt= new DaoTicket();
				tb.setFlightId(flightId);
				tb.setPassId(passId);
				tb.setTicketDate(date);
				tb.setPassNames(passengers);
				tb.setStatus("Confirmed");
				tb.setFlightDepTime(depTime);
				return dt.insertTicketDetails(tb);
						
			}
			catch(Exception e)
			{
				System.out.println("error generating ticket");
				return 0;
			}
			
		
		
		}	
	
	
}


