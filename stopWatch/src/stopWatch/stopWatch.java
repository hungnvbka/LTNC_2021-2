package stopWatch;

public class stopWatch {

	private long startTime = 0;
	private long endTime = 0;

	public stopWatch() {
		startTime = System.currentTimeMillis();
	}

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		long elapsed;
		return elapsed = endTime - startTime;
	}

	public static void main(String arg[]) throws Exception {
		stopWatch sW = new stopWatch();

		sW.start();
		System.out.println("Start time: " + sW.startTime);
		System.out.println("________________________________");
		Thread.sleep(1000);
		sW.stop();
		System.out.println("End time: "+ sW.endTime);
		System.out.println("________________________________");
		System.out.println(sW.getElapsedTime());
	}
}
