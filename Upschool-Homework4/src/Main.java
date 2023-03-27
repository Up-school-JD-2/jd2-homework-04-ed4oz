import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Album album= new Album();
        album.setName("Albüm-A");
        album.setPrice(299.9);
        album.setSingerName("Singer-A");


        Song song1=new Song();
        song1.setName("Song1-A");
        song1.setSingerName(album.getSingerName());

        Song song2=new Song();
        song2.setName("Song2-A");
        song2.setSingerName(album.getSingerName());

        Song song3=new Song();
        song3.setName("Song3-A");
        song3.setSingerName(album.getSingerName());


        User user=new User();

        MusicSystem musicSystem=new MusicSystem();

        musicSystem.addUser(user);


        musicSystem.addAlbum(album);
        musicSystem.addSong(song1);
        musicSystem.addSong(song2);
        musicSystem.addSong(song3);

        album.setSongs(musicSystem.getSongs());

        musicSystem.searchAlbum();

        Basket basket =new Basket();
        basket.addToBasket(album);
        basket.addToBasket(album);
      //  basket.removeFromBasket(album);
        basket.showBasket();
        Order order= new Order();
        order.buyBasket();


    }
}
