
public class BowlingAlley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] lanes = {"Lane 1", "Lane 2", "Lane 3", "Lane 4"};
		int [][] gamesPlayed = {{45,50},{38,42},{60,65},{55,58}};
		
		
		 for (int i = 0; i < lanes.length; i++) {
	            System.out.println(lanes[i]+ " - Day 1: " +gamesPlayed[i][0]+ " games, Day 2: " +gamesPlayed[i][1] + " games");
	        }
		 System.out.println("Total number of games played across all lanes over both days: "+calculateTotalGames(gamesPlayed));
		 
		 
}
	
	public static int calculateTotalGames(int[][]gamesPlayed) {
		int sum = 0;
		
        for (int i = 0; i < gamesPlayed.length; i++) {
             
            for (int j = 0; j < gamesPlayed[i].length; j++) {
               sum += gamesPlayed[i][j];
            }
             
          }
        return sum;
	}
}
