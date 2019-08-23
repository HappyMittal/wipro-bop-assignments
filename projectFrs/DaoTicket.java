package com.wipro.frs.dao;
import com.wipro.frs.util.*;
import com.wipro.frs.bean.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class DaoTicket 
{
	public int insertTicketDetails(TicketBean t) throws Exception
	{
		try 
		{
			System.out.println("accessed insert");
			Connection conn= new DBUtil().connectDatabase();
			String sql= "insert into ticket_info values(seq_ticket.nextval,?,?,?,?,to_date(?,'yyyy/mm/dd'),?)";
			PreparedStatement pstmnt= conn.prepareStatement(sql);
			pstmnt.setInt(1, t.getFlightId());
			pstmnt.setString(6,t.getFlightDepTime());
			pstmnt.setString(2,t.getStatus());
			pstmnt.setInt(3,t.getPassId());
			pstmnt.setString(4, t.getPassNames());
			pstmnt.setString(5, t.getTicketDate());
			int execute=pstmnt.executeUpdate();
			return execute;
			
		}
		catch (Exception e)
		{
			System.out.println(e);
			return 0;
		}
		
	}
	
	public int returnLastTicketId() throws Exception
	{
		try
		{
			System.out.println("accessed returnLastId");
			int lastId=0;
			int temp=0;
			Connection conn= new DBUtil().connectDatabase();
			String sql="select * from ticket_info order by ticket_id desc";
			PreparedStatement ptsmnt= conn.prepareStatement(sql);
			ResultSet rs= ptsmnt.executeQuery();
			while(rs.next())
			{
				temp=rs.getInt(1);
				lastId=temp;
				break;
				
			}
	
			return lastId;
		}
		catch(Exception e)
		{
			System.out.println("mistake @ lastId func");
			return 0;
		}
	
	}
}
