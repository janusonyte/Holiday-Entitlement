
public class Main 
{

	public static void main(String[] args) 
	{
		Staff s = new Staff("Stacey", "09/09/1995", 7, "Accountant", true);
		Staff m = new Staff("Mark", "01/02/1972", 4, "Programmer", false);
		s.setNumHolidaysRequested(6);
		m.setNumHolidaysRequested(3);
		
		CurriculumLeader cL = new CurriculumLeader();
		HeadOfComputing hoc = new HeadOfComputing();
		
		System.out.println("The current staff-on-holiday limit is " + cL.getStaffOnHolidayLimit());
		hoc.holidayRequest(s);
	}

}//end of class
