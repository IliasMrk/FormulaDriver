
/**
I have read and understood the sections of plagiarism in the College
Policy on Assessment Offences and confirm that the work is my own, with
the work of others clearly acknowledged.
I give my permission to submit my report to the plagiarism testing database
that the College is using and test it using plagiarism detection software,
search engines or meta-searching software. */

public class FormulaETest
 {
 public static void main ( String [] args )
 {
 Team [] teams = new Team [2];
 Driver d0 = new Driver (" Pascal Wehrlein ") ;
 Driver d1 = new Driver (" Andre Lotterer ") ;
 teams [0] = new Team (" Porsche ", d0 , d1 ) ;
 Driver d2 = new Driver (" Nyck de Vries ") ;
 Driver d3 = new Driver (" Stoffel Vandoorne ") ;
 teams [1] = new Team (" Mercedes ", d2 , d3 ) ;

 for ( Team t : teams )
 t.seasonStart () ;

 d0 . addResult (10 , false ) ;
 d1 . addResult (13 , false ) ;
 d2 . addResult (1 , false ) ;
 d3 . addResult (2 , false ) ;
 d0 . addResult (1 , false ) ;
 d1 . addResult (2 , false ) ;
 d2 . addResult (6 , true ) ;
 d3 . addResult (11 , false ) ;

 for ( Team t : teams ) {
 String name = t.getName () ;
 int points = t.getPoints() ;
 
 }
 for ( Team t : teams ) {
 Driver driver1 = t.getDriver1 () ;
 String name = driver1.getName () ;
 int points = driver1.getPoints () ;
 System.out.println( name + ": " + points ) ;

 Driver driver2 = t.getDriver2 () ;
 name = driver2.getName () ;
 points = driver2.getPoints () ;
 System.out.println ( name + ": " + points ) ;
 }
 }
 }