public class Television{
	

	private String brandName;
	
	private int screenSize;

	private boolean powerOn;

	private int channel;

	private int volume;


	public Television(String name, int screenSize){

	this.brandName = name;
	this.screenSize = screenSize;

	}
	
	public void setName(String name){

	this.brandName = name;
	}
	
	public String getName(){
	return brandName;
	} 

	public void setChannel(int channel){
		if (channel > 1 && channel <= 20){
			this.channel = channel;
	}
	else
	if(channel < 1 && channel >= 20){

	channel --;
	}}

	public void increaseVolume(){
	if (volume >= 1 && volume <= 100)
		volume ++;
	}

	public void decreaseVolume(){
	if (volume > 1 && volume <= 100)
		volume --;

	}

	public void setOn(boolean blackie){
		powerOn = blackie;
	}

	public int getChannel(){
		return channel;

	}
	public int getVolume(){
		return volume;
	}

	public void setVolume(int volume){
	
	this.volume = volume;

	}
	
	




}