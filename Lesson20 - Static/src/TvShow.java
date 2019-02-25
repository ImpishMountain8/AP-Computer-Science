
public class TvShow {
	public TvShow(String nm) {
		numShows++;
		showName = nm;
	}
	public static int numberOfShows() {
		return numShows;
	}
	public void setActor1(String act1) {
		actor1 = act1;
	}
	
	public String actor1 = "Don Knots";
	public static String actor2 = "Homer Simpson";
	public static int numShows = 0;
	public static int x = 59;
	public int y = 1059;
	public String showName;

	//TvShow.setActor1("Jimmy Stewart");
}
