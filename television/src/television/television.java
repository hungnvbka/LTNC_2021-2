package television;

import java.util.Scanner;

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
		if (newChannel > 0 && newChannel < 121) {
			channel = newChannel;
		} else {
			int tmp;
			System.out.println("This channel does not exist.\nPlease re-enter!");
			System.out.println("-------------------------------------------------");
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter channel: ");
			tmp = obj.nextInt();
			setChannel(tmp);
		}
	}

	void setVolumeLevel(int newVolumeLevel) {
		if (volumeLevel > 0 && volumeLevel < 8) {
			volumeLevel = newVolumeLevel;
		} else {
			int tmp;
			System.out.println("This volume level is not available.\nPlease re-enter!");
			System.out.println("-------------------------------------------------");
			System.out.println("-------------------------------------------------");
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter new volume: ");
			tmp = obj.nextInt();
			setVolumeLevel(tmp);
		}
	}

	void channelUp() {
		if (on) {
			channel++;
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void channelDown() {
		if (on) {
			channel--;
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void volumeUp() {
		if (on) {
			volumeLevel++;
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void volumeDown() {
		if (on) {
			volumeLevel--;
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void printStatus() {
		if (on) {
			System.out.println("TV: on.");
		} else {
			System.out.println("TV: off.");
		}
	}

	public static void main(String[] args) {
		television tv = new television();
		tv.turnOn();
		tv.setChannel(0);
		tv.volumeUp();

		System.out.println("Channel: " + tv.channel + ".");
		System.out.println("Volume: " + tv.volumeLevel + ".");
		tv.printStatus();
		System.out.println("-------------------------------------------------");

		tv.turnOff();
		tv.printStatus();
		System.out.println("-------------------------------------------------");
	}
}
