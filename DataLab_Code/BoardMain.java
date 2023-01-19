import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
    public static void main(String args[]){
        DataSource ds = DataSource.connect("https://www.kaggle.com/datasets/andrewmvd/board-games").load();
        ArrayList<Boardgames> games = ds.fetchList("ID", "name", "year", "minPlay", "maxPlay", 
        "minAge", "reviews", "rating", "rank");

        for(Boardgames item : games){
            System.out.println(item.getName());
        }

    }
}
