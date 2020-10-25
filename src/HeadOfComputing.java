
public class HeadOfComputing extends Staff
{
	public HeadOfComputing() 
	{
		super();
	}
	
	public HeadOfComputing(String name, String DOB, String jobRole) 
	{
		super(name, DOB, jobRole);
	}
	
	public void holidayRequest(Staff staff)//requesting holidays
	{
		if(staff.isLecturingOrAdmin() == false)
		{

				if(staff.getHolidayBalance() >= staff.getNumHolidaysRequested())
				{
					staff.updateHolidays();	
					System.out.println("Your holiday request has been granted. You have " + staff.getHolidayBalance()+ " days left. Enjoy your holiday, " + staff.getName()  );

				}
				else
				{
					System.out.println("Please check your available holiday balance.");
				}
		}
		else
		{
			System.out.println("You have submitted a holiday request to the wrong department. HOC deal with requests from admin staff only. Try the other department.");
		}
	}
	
	
}//end of class
