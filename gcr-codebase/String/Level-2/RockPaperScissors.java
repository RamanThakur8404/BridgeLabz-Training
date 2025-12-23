import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of games you want to play:");
        int numGames = sc.nextInt();
        sc.nextLine(); 

		//applying logic 
        String[][] games = new String[numGames][3];
        int playerWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < numGames; i++) {
            System.out.println("\nGame " + (i+1) + ": Enter your choice (Rock/Paper/Scissors):");
            String playerChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
            games[i][0] = playerChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;
        }
		
		//store and print result
		String[][] result = calculateResult(numGames, playerWins, computerWins, draws);
        displayResults(games, result);
        sc.close();
    }
	
	// get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            default:
                return "Scissors";
        }
    }

    // method to get winner
    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }
        switch (player){
            case "Rock":
                return (computer.equals("Scissors")) ? "Player" : "Computer";
            case "Paper":
                return (computer.equals("Rock")) ? "Player" : "Computer";
            case "Scissors":
                return (computer.equals("Paper")) ? "Player" : "Computer";
            default:
                return "Invalid";
        }
    }

    // method to calculate percentages and create summary table
    public static String[][] calculateResult(int totalGames, int playerWins, int computerWins, int draws) {
        String[][] result = new String[4][2];

        result[0][0] = "Total Games"; 
		result[0][1] = String.valueOf(totalGames);
		result[1][0] = "Player Wins";
		result[1][1] = String.valueOf(playerWins);		
		result[2][0] = "Computer Wins";
		result[2][1] = String.valueOf(computerWins);
		result[3][0] = "Draws";
		result[3][1] = String.valueOf(draws);

        return result;
    }

    // method to display results of all games and result
    public static void displayResults(String[][] games, String[][] result) {
        System.out.println("\nGame\tPlayer\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i+1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nSummary result:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t: " + result[i][1]);
        }
        int totalGames = Integer.parseInt(result[0][1]);
        int playerWins = Integer.parseInt(result[1][1]);
        int computerWins = Integer.parseInt(result[2][1]);

        double playerPercent = ((double)playerWins / totalGames) * 100;
        double computerPercent = ((double)computerWins / totalGames) * 100;

        System.out.printf("\nWinning Percentage:\nPlayer: %.2f%%\nComputer: %.2f%%\n", playerPercent, computerPercent);
    }
}
