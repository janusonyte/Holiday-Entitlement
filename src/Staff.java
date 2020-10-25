
public class Staff 
{
	private String name;
	private String DOB;
	private int holidayBalance;
	private String jobRole;
	private boolean lecturingOrAdmin;
	//if lecturing = true, if admin = false.
	private int numHolidaysRequested;

	
	
	public Staff() 
	{
		//this is a blank constructor
	}
	
	
	
	public Staff(String name, String DOB, int holidayBalance) 
	{
		
		this.name = name;
		this.DOB = DOB;
		this.holidayBalance = holidayBalance;
	}

	public Staff(String name, String DOB, String jobRole) 
	{
		
		this.name = name;
		this.DOB = DOB;
		this.jobRole = jobRole;
	}

	public Staff(String name, String DOB, int holidayBalance, String jobRole) 
	{
		
		this.name = name;
		this.DOB = DOB;
		this.holidayBalance = holidayBalance;
		this.jobRole = jobRole;
	}

	public Staff(String name, String DOB, int holidayBalance, String jobRole, boolean lecturingOrAdmin) 
	{
		
		this.name = name;
		this.DOB = DOB;
		this.holidayBalance = holidayBalance;
		this.jobRole = jobRole;
		this.lecturingOrAdmin = lecturingOrAdmin;
	}
	
	public Staff(String name, String DOB, String jobRole, boolean lecturingOrAdmin) 
	{
	
		this.name = name;
		this.DOB = DOB;
		this.jobRole = jobRole;
		this.lecturingOrAdmin = lecturingOrAdmin;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDOB() 
	{
		return DOB;
	}

	public void setDOB(String DOB) 
	{
		this.DOB = DOB;
	}

	public int getHolidayBalance() 
	{
		return holidayBalance;
	}

	public void setHolidayBalance(int holidayBalance) 
	{
		this.holidayBalance = holidayBalance;
	}
	
	public void updateHolidays()
	{
		this.holidayBalance = this.holidayBalance - this.numHolidaysRequested;
	}
	
	public int getNumHolidaysRequested() 
	{
		return numHolidaysRequested;
	}

	public void setNumHolidaysRequested(int numHolidaysRequested) 
	{
		this.numHolidaysRequested = numHolidaysRequested;
	}

	public String getJobRole() 
	{
		return jobRole;
	}

	public void setJobRole(String jobRole) 
	{
		this.jobRole = jobRole;
	}

	public boolean isLecturingOrAdmin() 
	{
		return lecturingOrAdmin;
	}

	public void setLecturingOrAdmin(boolean lecturingOrAdmin) 
	{
		this.lecturingOrAdmin = lecturingOrAdmin;
	}
	
	public boolean isHolidayReqValid()
	{
		boolean isReqValid = false;
		if(numHolidaysRequested <= holidayBalance)
		{
			System.out.println("Your holiday request is valid. You have "
					+ holidayBalance 
					+ " day(s) accrued, and you are requesting for "
					+ numHolidaysRequested
					+ " day(s) off.");
		}
		else
		{
			System.out.println("Your holiday request is invalid. You have "
					+ holidayBalance 
					+ " day(s) accrued, and you are requesting for "
					+ numHolidaysRequested
					+ " day(s) off.");
		}
		return isReqValid;
	}
}//end of class
