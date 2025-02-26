package miniproject;
import java.util.Scanner;

class Player{
    private int id, age , run=0;
    private String name;
    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRun(int run) {
        this.run += run;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRun() {
        return run;
    }
}

class Team{
    private int teamId;
    private String name;
    private Player[] p = new Player[1];  // Assuming a team has 11 players

    public void setP(Player[] p) {
        this.p = p;
    }

    public Player[] getP() {
        return p;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public int getTeamId() {
        return teamId;
    }
}

class Match{
    private int noOfOver;
    private String matchName, location;
    private Team[] t = new Team[3];  // Assuming a maximum of 3 teams

    public Match() {
        this.t = new Team[3];  // Assuming max 3 teams
        for (int i = 0; i < 3; i++) {
            this.t[i] = new Team();  // Initialize each Team object
        }
    }
    public void setT(Team[] t) {
        this.t = t;
    }

    public Team[] getT() {
        return t;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public void setNoOfOver(int noOfOver) {
        this.noOfOver = noOfOver;
    }

    public int getNoOfOver() {
        return noOfOver;
    }

    public String getLocation() {
        return location;
    }

    public String getMatchName() {
        return matchName;
    }
}

public class Tournament {
    private int t1, t2;
    static private int team1Score=0, team2Score=0;
    public void setT1(int t1) {
        this.t1 = t1;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public int getT1() {
        return t1;
    }

    public int getT2() {
        return t2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch, countTeam=0;
        Tournament tm= new Tournament();
        Player[] p= new Player[1];
        Team[] t= new Team[3];
        Match m= new Match();
        while(true){
            System.out.println("1: Add New Teams.\n" +
                    "2: Add Players in team.\n" +
                    "3: Create Match.\n" +
                    "4: Allocate team to match.\n" +
                    "5: View all teams.\n" +
                    "6: Show team wise player list whose Match.\n" +
                    "7: Add player wise run.\n" +
                    "8: Team wise player run aggregate.\n" +
                    "9: Decide the Winner.\n" +
                    "10: Show the over count played by team.\n"+
                    "11: Exit. \n"
            );
            System.out.println("Enter your Choice: ");
            ch= sc.nextInt();
            switch (ch){
                case 1:
                    if (countTeam<t.length){
                        Team[] team =m.getT();
                        team[countTeam]= new Team();
                        System.out.println("Enter Team name: ");
                        team[countTeam].setName(sc.next());
                        System.out.println("Enter Team id");
                        team[countTeam].setTeamId(sc.nextInt());
                        countTeam++;
                        System.out.println("Team added Successfully. \n");
                        m.setT(team);
                    }else{
                        System.out.println("Teams slot are full!! \n");
                    }
                    break;

                case 2:
                   if (countTeam<t.length ){
                       System.out.println("Enter Team Id to add player:");
                       int id= sc.nextInt();
                       Team[] team =m.getT();

                       for (int i=0;i<countTeam;i++){
                           if (team[i].getTeamId()==id) {
                               if (team[i].getP() == null){
                                   team[i].setP(new Player[1]);
                               }
                               Player[] players=team[i].getP();

                               for (int j=0;j< p.length;j++) {
                                   if (players[j] == null) {
                                       players[j] = new Player();
                                       System.out.println("Enter Player Name: ");
                                       players[j].setName(sc.next());
                                       System.out.println("Enter Player Age: ");
                                       players[j].setAge(sc.nextInt());
                                       System.out.println("Enter Player Id: ");
                                       players[j].setId(sc.nextInt());
                                       team[i].setP(players);
                                       System.out.println("Player added Successfully. \n");
                                        break;
                                   }
                               }
                           }
                       }
                   }else{
                       System.out.println("Team slots are full. \n");
                   }
                   break;

                case 3:
                    if (countTeam>1){
                        System.out.println("Enter Number of over: ");
                        m.setNoOfOver(sc.nextInt());
                        System.out.println("Enter Location: ");
                        m.setLocation(sc.next());
                        System.out.println("Enter Match name: ");
                        m.setMatchName(sc.next());
                    }else{
                        System.out.println("Not enough Team to Match. \n");
                    }
                    break;

                case 4:
                    if (countTeam>=2){
                        System.out.println("Enter 1st Team Id: ");
                        int t1= sc.nextInt();
                        System.out.println("Enter 2nd Team Id: ");
                        int t2= sc.nextInt();
                        Team[] team =m.getT();

                        int a = -1,b = -1;
                        for (int i=0;i<t.length;i++){
                            if (team[i].getTeamId()==t1 ){
                                a=i;
                            }else if (team[i].getTeamId()==t2){
                                b=i;
                            }
                        }
                        if (a != -1 && b != -1) {  // Ensure both teams are found
                            System.out.println("Match:");
                            System.out.println("Team Name: " + team[a].getName() + " vs " + team[b].getName());
                            tm.setT1(team[a].getTeamId());
                            tm.setT2(team[b].getTeamId());
                        } else {
                            System.out.println("One or both teams not found!");
                        }

                    }else{
                        System.out.println("Not enough Team to Match. \n");
                    }
                    break;

                case 5:
                    if (countTeam==0){
                        System.out.println("No Teams are registered.\n");
                    }else{
                        Team[] team =m.getT();
                        if (team == null){
                            System.out.println("Error: Team data not found. \n");
                            break;
                        }
                        for (int i=0;i<countTeam;i++){
                            if (team[i] != null) {
                                System.out.println("Team " + (i + 1) + "\nTeam Id " + team[i].getTeamId()
                                        + "\nTeam Name " + team[i].getName());
                            }
                        }
                    }
                    break;

                case 6:
                    if (countTeam==0){
                        System.out.println("Zero Teams are registered.\n");
                    }else{
                        Team[] team =m.getT();
                        for (int i=0;i<countTeam;i++){
                            if (tm.getT1() == team[i].getTeamId() || tm.getT2() == team[i].getTeamId()) {
                                System.out.println("Team " + (i + 1) + "\nTeam Id: " + team[i].getTeamId()
                                        + "\nTeam Name: " + team[i].getName());
                                for (int j = 0; j < p.length; j++) {
                                    Player[] players=team[i].getP();
                                    System.out.println((j + 1) + ". " + players[j].getName());
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 7:
                    if (countTeam==0){
                        System.out.println("Zero Teams are registered.\n");
                    }else{
                        Team[] team =m.getT();
                        for (int i=0;i<countTeam;i++){
                            if (tm.getT1() == team[i].getTeamId() || tm.getT2() == team[i].getTeamId()) {
                                System.out.println("Team " + (i + 1) + "\nTeam Id " + team[i].getTeamId()
                                        + "\nTeam Name " + team[i].getName());
                                System.out.println("Enter Player wise run.");
                                for (int j = 0; j < p.length; j++) {
                                    Player[] players=team[i].getP();
                                    System.out.print((j + 1) + ". " + players[j].getName() + ": ");
                                    players[j].setRun(sc.nextInt());
                                }
                            }
                        }
                        System.out.println("Run added as per player Successfully!! \n");
                    }
                    break;

                case 8:
                    if (countTeam>2){
                        System.out.println("Not enough teams are registered.\n");
                    }else{
                        Team[] team =m.getT();
                        team1Score=0;
                        team2Score=0;
                        for (int i=0;i<countTeam;i++){
                            int teamScore=0;
                            System.out.println("\nTeam Name "+team[i].getName());
                            for (int j=0;j<p.length;j++){
                                Player[] players=team[i].getP();
                                if (players[j] != null) {
                                    System.out.print((j + 1) + ". " + players[j].getName() + ": " + players[j].getRun());
                                    teamScore += players[j].getRun();
                                }
                            }
                            System.out.println("\n Run aggregate of "+team[i].getName()+" is "+teamScore);
                            if (team[i].getTeamId()==tm.getT1()){
                                team1Score = teamScore;
                            }else if (team[i].getTeamId()==tm.getT2()){
                                team2Score = teamScore;
                            }

                        }
                    }
                    break;

                case 9:
                    if (team2Score ==0 && team2Score == 0){
                        System.out.println("Score are not calculated. Please calculate scores first.");
                    }else {
                        System.out.println("Match Result:");
                        System.out.println("Team name:"+tm.getT1()+" score:"+team1Score);
                        System.out.println("Team name:"+tm.getT2()+" score:"+team2Score+"\n \n");

                        if (team1Score<team2Score){
                            System.out.println(tm.getT2()+" is Winner. \n \n");
                        }else if (team2Score<team1Score){
                            System.out.println(tm.getT1()+" is Winner. \n \n");
                        }else {
                            System.out.println("Match Draw.");
                        }
                    }
                    break;

                case 10:
                    break;
                case 11:
                    System.exit(1);

                default:
                    System.out.println("Invalid Choice!! \n Please enter valid choice.\n");
            }
        }
    }
}
