package constructorE;

import java.util.Arrays;

class Movie {
    private String imageurl;
    private int rating;
    private int vote;
    private String moviename;
    private String genre[];
    // constructor
    public Movie(String imageurl,int rating,int vote,String moviename,String... genre){
        this.imageurl = imageurl;
        this.rating = rating;
        this.vote = vote;
        this.moviename = moviename;
        this.genre = genre;
    }
    public String toString(){
        return "\nImage URL : "+this.imageurl+
        "\nRating : "+this.rating+
        "\nVote : "+this.vote+
        "\nMovie Name : "+this.moviename+
        "\nGenre : "+Arrays.toString(genre)+"\n---------------------------";
    }
    public static void main(String[] args) {
        Movie movie1 = new Movie("C:/Movies/BrandNewDay", 9, 65897,"Spiderman-BrandNewDay","Action","Adventure","Sci-Fi");
        Movie movie2 = new Movie("C:/Movies/Srinivasa Mangapuram", 7,143000,"Srinivasa Mangapuram","Action","Drama","Romantic");
        Movie movie3 = new Movie("C:/Movies/JanaNayagan", 8, 143000,"JanaNayagan","Action","Drama","Political");
        Movie movie4 = new Movie("C:/Movies/IronMan", 10, 199000,"Iron Man","Action","Adventure","Sci-Fi");

        System.out.print(movie1);
        System.out.print(movie2);
        System.out.print(movie3);
        System.out.print(movie4);
    }
}
