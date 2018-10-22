package handyPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>
{
	private int year;
	private String movieName;
	private int part;
	
	public int compareTo(Movie movie)
	{
	return this.movieName.compareTo(movie.movieName);
	//return (this.year - movie.year);
	 	
	}
	Movie(int year, String MovieName,int part)
	{
		this.year=year;
		this.movieName = MovieName;
		this.part=part;
	}
	public int getYear() {
		return year;
	}
	public String getMovieName() {
		return movieName;
	}
	public int getPart() {
		return part;
	}
	
	
}
class SortByName implements Comparator<Movie>
{

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		
		return m1.getMovieName().compareTo(m2.getMovieName());
	}
	
}
public class ComparableVsComparator {
	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
	Movie movie1 = new Movie(2012, "Arish part 1", 1);
	Movie movie2 = new Movie(2013, "Crish part 2", 2);
	Movie movie3 = new Movie(2014, "Brish part 3", 3);
	Movie movie4 = new Movie(2015, "Krish part 4", 4);
	
	list.add(movie2);
	list.add(movie1);
	list.add(movie4);
	list.add(movie3);
	Collections.sort(list);
	SortByName sname = new SortByName();
	//Collections.sort(list, sname);
	 System.out.println("Movies after sorting : ");
	for(Movie movie:list)
	{
System.out.println("Movie Name released in year and their part =: "+movie.getMovieName()+"     Year "+movie.getYear());
	}	
	
	
	}
	

}