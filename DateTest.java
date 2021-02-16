public class DateTest{

	public static void main(String[] args){

	Date calender = new Date(16, 07, 2020);

	System.out.println(calender.getDay());
	System.out.println(calender.getMonth());
	System.out.println(calender.getYear());
		

	calender.setDay(16);
	calender.setMonth(07);
	calender.setYear(2020);

	System.out.println(calender.displayDate());
}


}