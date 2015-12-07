package Global;

public class Stats {
	public static long arithmetic_time;
	public static long logic_time;
	public static long compare_time;
	public static long io_time;
	
	public static void initStats() {
		arithmetic_time = 0;
		logic_time = 0;
		compare_time = 0;
		io_time = 0;
	}

}
