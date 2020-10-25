
public class CurriculumLeader extends Staff
{
	private int staffOnHolidayLimit = 5;
	private int staffOnHoliday;
	private boolean requestResult = false;
	
	public CurriculumLeader() 
	{
		super();
		
	}
	
	public CurriculumLeader(String name, String DOB, String jobRole) 
	{
		super(name, DOB, jobRole);
	}
	
	public boolean holidayRequest(Staff staff)//requesting holidays
	{
		if(staff.isLecturingOrAdmin() == true)
		{

			if(staffOnHoliday <= staffOnHolidayLimit)
			{
				if(staff.getHolidayBalance() >= staff.getNumHolidaysRequested())
				{
					staff.updateHolidays();	
					System.out.println("Your holiday request has been granted. You have " + staff.getHolidayBalance()+ " days left. Enjoy your holiday, " + staff.getName()  );
					requestResult = true;
					setStaffOnHoliday();
				}
				else
				{
					System.out.println("Please check your available holiday balance.");
					requestResult = false;
				}
			}
			else
			{
				System.out.println("Your holiday request has been denied. There are too many staff members currently on holiday." );
				requestResult = false;
			}
		}
		else
		{
			System.out.println("You have submitted a holiday request to the wrong department. Curriculum Leaders deal with requests from lecturing staff only. Try the other department.");
		
		}
		return requestResult;
	}

	public int getStaffOnHolidayLimit() 
	{
		return staffOnHolidayLimit;
	}

	public int getStaffOnHoliday() 
	{
		return staffOnHoliday;
	}

	public void setStaffOnHoliday() 
	{
		if(requestResult == true)
		{
			this.staffOnHoliday++;//if a staff member is granted a holiday request, the number of staff on holiday increases.
		}
		
	}
	
}//end of class
