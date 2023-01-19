public class Boardgames {
    private int ID;
    private String name;
    private int year;
    private int minPlay;
    private int maxPlay;
    private int minAge;
    private int reviews;
    private String rating;
    private int rank;

    Boardgames(int ID, String name, int year, int minPlay, int maxPlay, int minAge, int reviews, String rating, int rank){
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.minPlay = minPlay;
        this.maxPlay = maxPlay;
        this.minAge = minAge;
        this.reviews = reviews;
        this.rating = rating;
        this.rank = rank;
    }

    String getName(){
        return name;
    }

}
