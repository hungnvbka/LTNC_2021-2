package television;

public class television {
	private int channel;
	private int volumeLevel;
	private boolean on;
	
	public television() {
		channel = 0;
		volumeLevel = 0;
		on = false;
	}
	
	void turnOn() {
		on = true;
	}
	
	void turnOff() {
		on = false;
	}
	
	void setChannel(int newChannel) {
		channel = newChannel;
	}
	
	void setVolumeLevel(int newVolumeLevel) {
		volumeLevel = newVolumeLevel;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volumeLevel++;
	}
	
	void volumeDown() {
		volumeLevel--;
	}
	void printStatus() {
		if(on) {
			System.out.println("TV: on");
		}
		else {
			System.out.println("TV: off");
		}
	}
	
	public static void main (String[] args) {
		television tv = new television();
		tv.setChannel(2);
		tv.volumeUp();
		tv.turnOn();
		
		System.out.println("Channel: "+tv.channel);
		System.out.println("Volume: "+tv.volumeLevel);
		tv.printStatus();
		System.out.println("-------------------------------------------------");
		
		tv.turnOff();
		tv.printStatus();
		System.out.println("-------------------------------------------------");
	}
}

