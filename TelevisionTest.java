
public class TelevisionTest{

	public static void main(String[] main){

	Television myTelevision = new Television("samsung", 534);
	

	myTelevision.setName("Samsung");

	myTelevision.setOn(true);	

	

	myTelevision.setChannel(20);

	myTelevision.setVolume(50);


	int blackie = myTelevision.getVolume();
	
	
	System.out.println("Your Television details is: \n " + "brand name is " + myTelevision.getName() + "\n" + "TV is on channel " + myTelevision.getChannel() + "\n" + "volume is: " + blackie );
	
	

	


}

}

