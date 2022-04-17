
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
		if (on) {
			if ((newChannel > 0) && (newChannel < 121)) {
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
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void setVolumeLevel(int newVolumeLevel) {
		if (on) {
			if ((newVolumeLevel > 0) && (newVolumeLevel < 8)) {
				volumeLevel = newVolumeLevel;
			} else {
				int tmp;
				System.out.println("This volume level is not available.\nPlease re-enter!");
				System.out.println("-------------------------------------------------");
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter new volume: ");
				tmp = obj.nextInt();
				setVolumeLevel(tmp);
			}
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void channelUp() {
		if (on) {
			if (channel == 120) {
				channel = 1;
			} else
				channel++;
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void channelDown() {
		if (on) {
			if (channel == 0) {
				channel = 120;
			} else
				channel--;
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void volumeUp() {
		if (on) {
			if (volumeLevel == 8) {
				System.out.println("Max Volume Level!");
			} else
				volumeLevel++;
		} else {
			System.out.println("TV is off.\nPlease, turn on!");
			System.out.println("-------------------------------------------------");
		}
	}

	void volumeDown() {
		if (on) {
			if (volumeLevel == 1) {
				System.out.println("Min Volume Level!");
			} else
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
	void show() {
		System.out.println("Channel: "+channel+".");
		System.out.println("Volume Level: "+ volumeLevel +".");
		this.printStatus();
	}

	public static void main(String[] args) {
		television tv = new television();
		int select = 0;

		while (select != 9) {
			System.out.println("\n1.Turn on TV.\n2.Turn off TV.\n3.Set channel.\n"
					+ "4.Set volume.\n5.Channel up.\n6.Channel down.\n" + "7.Volume up.\n8.Volume down.\n9.Exit\n");
			System.out.println("Enter: ");
			Scanner Obj = new Scanner(System.in);
			select = Obj.nextInt();
			System.out.println("-------------------------------------------------");
			switch (select) {
			case 1:
				tv.turnOn();
				break;
			case 2:
				tv.turnOff();
				break;
			case 3:
				int tmp;
				Scanner obj1 = new Scanner(System.in);
				System.out.println("Enter channel: ");
				tmp = obj1.nextInt();
				tv.setChannel(tmp);
				break;
			case 4:
				int tmp2;
				Scanner obj2 = new Scanner(System.in);
				System.out.println("Enter volume level: ");
				tmp2 = obj2.nextInt();
				tv.setVolumeLevel(tmp2);
				break;
			case 5:
				tv.channelUp();
				;
				break;
			case 6:
				tv.channelDown();
				;
				break;
			case 7:
				tv.volumeUp();
				;
				break;
			case 8:
				tv.volumeDown();
				;
				break;
			}
		}
		tv.show();
	}
}
