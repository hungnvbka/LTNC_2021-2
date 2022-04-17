
public class stopWatch {

	private long startTime = 0;
	private long endTime = 0;
	private boolean running = false;
	public stopWatch() {
		startTime = System.currentTimeMillis();
	}

	public void setStartTime(long newStartTime) {
		startTime = newStartTime;
	}

	public void setEndTime(long newEndTime) {
		endTime = newEndTime;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return (endTime - startTime);
	}

	public static void main(String arg[]) throws Exception {
		stopWatch sW = new stopWatch();

		sW.start();
		System.out.println("Start time: " + sW.startTime);
		System.out.println("________________________________");
		Thread.sleep(1000);
		sW.stop();
		System.out.println("End time: " + sW.endTime);
		System.out.println("________________________________");
		System.out.println(sW.getElapsedTime());
	}
}
