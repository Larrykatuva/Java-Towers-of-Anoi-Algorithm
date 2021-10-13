
public class TowersApp {
	static int nDisks = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doTowers(nDisks, 'A', 'B', 'C');
	}
	
	public static void doTowers(int topNumber, char from, char inter, char to) {
		if(topNumber == 1) {
			System.out.println("Disk 1 from " + from + " to "+ to);
		}else{
			 doTowers(topNumber - 1, from, to, inter);
			 System.out.println("Disk " + topNumber +
			 " from " + from + " to "+ to);
			 doTowers(topNumber - 1, inter, from, to);
		 }
	}

}
