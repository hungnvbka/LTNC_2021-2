package television;

public class television {
	int channel;
	int volumeLevel;
	boolean on;
	
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
	
	public static void main (String[] args) {
		television tv = new television();
		System.out.println(tv.channel);
	}
}

