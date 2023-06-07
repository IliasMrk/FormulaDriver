import java.util.Arrays;
/**
I have read and understood the sections of plagiarism in the College
Policy on Assessment Offences and confirm that the work is my own, with
the work of others clearly acknowledged.
I give my permission to submit my report to the plagiarism testing database
that the College is using and test it using plagiarism detection software,
search engines or meta-searching software. */



public class Driver
{
    private String name;
    private int score;
    
    public Driver(String driver){
     
        name = driver;
        
     
        
    }
    public String getName(){
        
        return name;
      
        
    }
    public int getPoints(){
        return score;
        
    }
    public void addResult(int finishPoint, boolean fastestLap){
              
            int [] pos = {1,2,3,4,5,6,7,8,9,10};
            int [] points = {25,18,15,12,10,8,6,4,2,1};
           
                for(int i=0; i<pos.length; i++){
                    if((finishPoint ==pos[i]) && fastestLap==true){
                    score += points[i]+1;
                    
                }
                else if((finishPoint==pos[i]) && fastestLap == false){
                   score += points[i];
                }
                else if(finishPoint > pos[i]){
                    score =0;
                }}
                }

    public void seasonStart(){
        score = 0;
       
        
    }
    
}


