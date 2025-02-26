package corejava.classandobject;
//2. Player Score Tracking
//Task: Create a Player class with fields playerName, matchesPlayed, and score. Implement a constructor for initialization.
// In another class Game, create an array of Player objects and write a method to find the player with the highest score.
//Explanation: The Player class holds the player’s data, and Game performs the logic to find the top scorer.

import java.util.Scanner;
class Player1{
    private int matchplayed, score;
    private String playername;
    public Player1(String playername, int matchplayed, int score) {
        this.playername = playername;
        this.matchplayed = matchplayed;
        this.score = score;
    }

    public int getMatchplayed() {
        return matchplayed;
    }

    public int getScore() {
        return score;
    }

    public String getPlayername() {
        return playername;
    }
}
class PlayerScore{
    Scanner sc = new Scanner(System.in);
    public void topScorer(){
        Player1 p[] = new Player1[3];

        for (int i = 0; i < p.length; i++) {
            System.out.println("Enter Player Name: ");
            String name = sc.next();
            System.out.println("Enter Matches Played: ");
            int matches = sc.nextInt();
            System.out.println("Enter Player Score: ");
            int score = sc.nextInt();

            p[i] = new Player1(name, matches, score);
        }
        int max=0;
        for (int i=1;i<p.length;i++){
            if (p[max].getScore()<p[i].getScore()){
                max=i;
            }
        }
        System.out.println("Top Scorer player is "+p[max].getPlayername()+" and it's Match Played are " +
                ""+p[max].getScore()+" it's Score is "+p[max].getMatchplayed());
    }
}
public class PlayerScoreTracking {
    public static void main(String[] args) {
        PlayerScore p =new PlayerScore();
        p.topScorer();
    }
}
