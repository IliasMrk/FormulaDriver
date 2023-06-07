
/**
I have read and understood the sections of plagiarism in the College
Policy on Assessment Offences and confirm that the work is my own, with
the work of others clearly acknowledged.
I give my permission to submit my report to the plagiarism testing database
that the College is using and test it using plagiarism detection software,
search engines or meta-searching software. */


public class Team{
    private String teamName;
    private Driver dr1;
    private Driver dr2;
    
    private int score=0;
    public Team(String team,Driver dr1, Driver dr2){
        
        
         
        teamName = team;
        this.dr1 = dr1;
        this.dr2 = dr2;
                 
    }
    
    public String getName(){
        return teamName;
        
    }
    public Driver getDriver1(){
    
        return dr1;
        
    }
    public Driver getDriver2(){
       return dr2;
           
    }
    public int getPoints(){
       
        score = dr1.getPoints() + dr2.getPoints();
        
        return score;    
    
    }
    public void seasonStart(){
        this.score=score;
        dr1.seasonStart();
        dr2.seasonStart();
        score =0;
        
        
    }
}