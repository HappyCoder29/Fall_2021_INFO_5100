package edu.northeastern.ashish;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        /*Add List of movies based on the classes created above.*/
        Netflix netFlix = new Netflix();
        Genre sciFi = createSciFiGenre();
        Genre comedy = createComedyGenre();
        netFlix.addGenre(sciFi);
        netFlix.addGenre(comedy);

        /*For all movies released before 2000, add the string "(Classic)" to the title of the movie using  flatMap.*/
        Date date2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> before2000 = movie -> movie.getReleaseDate().before(date2000);

        System.out.println("For all movies released before 2000, add the string \"(Classic)\" to the title of the movie using  flatMap");
        netFlix.genres.stream().flatMap(genre -> genre.getMovies().stream()) // This will get us all the movies from all genere
                .filter(before2000) // This will give me all the movies before 2000
                .forEach(movie -> System.out.println(movie.getTitle() + " (Classic)")); // Print them by adding classic inm title


        /*Get the latest 3 movies released using .limit() method of stream.*/

        System.out.println("Get the latest 3 movies released using .limit() method of stream.");
        netFlix.genres.stream().flatMap(genre -> genre.getMovies().stream()) // This will get us all the movies from all genere
                .sorted((m1,m2) -> m2.getReleaseDate().compareTo(m1.getReleaseDate()))
                .limit(3)
                .forEach(movie -> System.out.println(movie.getTitle() + " Year : " + getYear(movie.getReleaseDate())));

        /* Create a predicate for release date before 2000 and a predicate for release date before 1990
            and then Chain the predicates for finding movies between 1990 and 2000.
        */
        System.out.println("Get Movies between 1990 and 2000.");

        Date date1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(date1990);
        netFlix.genres.stream().flatMap(genre -> genre.getMovies().stream()) // This will get us all the movies from all genere
                .filter(before2000)
                .filter(after1990)
                .forEach(movie -> System.out.println(movie.getTitle() + " Year : " + getYear(movie.getReleaseDate())));

        /*
        Write a method which that will add release year in the title of the movie and return the title and
        then use this method for all the movies.
        */
        System.out.println("Add release Year.");
        netFlix.genres.stream().flatMap(genre -> genre.getMovies().stream()) // This will get us all the movies from all genere
                .forEach(movie -> System.out.println(movie.getTitle() + " Year : " + getYear(movie.getReleaseDate())));

        /*Sorting on one of the feature(Ex: Released year or title) which will use comparator.*/
        System.out.println("Sorting based on title");
        netFlix.genres.stream().flatMap(genre -> genre.getMovies().stream()) // This will get us all the movies from all genere
                .sorted((m1,m2) -> m1.getTitle().compareTo(m2.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle() + " Year : " + getYear(movie.getReleaseDate())));

    }

    private static Genre createSciFiGenre(){
        Genre sciFi = new Genre("Sci Fi");
        Date date = new GregorianCalendar(2012, Calendar.FEBRUARY, 1).getTime();
        Movie movie1 = new Movie("Sci-Fi-1", date, getListActors(), "Director 1");
        date = new GregorianCalendar(1970, Calendar.JANUARY, 1).getTime();
        Movie movie2 = new Movie("Sci-Fi-2", date, getListActors(), "Director 2");
        date = new GregorianCalendar(1991, Calendar.AUGUST, 1).getTime();
        Movie movie3 = new Movie("Sci-Fi-3", date, getListActors(), "Director 3");
        date = new GregorianCalendar(2021, Calendar.JANUARY, 1).getTime();
        Movie movie4 = new Movie("Sci-Fi-4", date, getListActors(), "Director 4");

        sciFi.addMovie(movie1);
        sciFi.addMovie(movie2);
        sciFi.addMovie(movie3);
        sciFi.addMovie(movie4);

        return sciFi;

    }

    private static Genre createComedyGenre(){
        Genre comedy = new Genre("Comedy");
        Date date = new GregorianCalendar(2011, Calendar.FEBRUARY, 1).getTime();
        Movie movie1 = new Movie("Comedy-1", date, getListActors(), "Director 1");
        date = new GregorianCalendar(1987, Calendar.JANUARY, 1).getTime();
        Movie movie2 = new Movie("Comedy-2", date, getListActors(), "Director 2");
        date = new GregorianCalendar(1995, Calendar.AUGUST, 1).getTime();
        Movie movie3 = new Movie("Comedy-3", date, getListActors(), "Director 3");
        date = new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime();
        Movie movie4 = new Movie("Comedy-4", date, getListActors(), "Director 4");

        comedy.addMovie(movie1);
        comedy.addMovie(movie2);
        comedy.addMovie(movie3);
        comedy.addMovie(movie4);

        return comedy;
    }


    private static ArrayList<String> getListActors(){
        ArrayList<String> actors = new ArrayList<>();
        actors.add("Actor 1");
        actors.add("Actor 2");
        actors.add("Actor 3");
        actors.add("Actor 4");
        actors.add("Actor 5");
        return actors;
    }

    private static String getYear(Date date){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        return yearFormat.format(date);
    }
}
