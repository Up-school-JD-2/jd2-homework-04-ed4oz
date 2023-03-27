
import java.util.Date;
import java.util.List;

public class Album {
    private String name;
    private String singerName;
    private Date releaseDate;
    private List<Song> songs;
    private double price;

    public Album(String name, String singerName, Date releaseDate, List<Song> songs) {
        this.name = name;
        this.singerName = singerName;
        this.releaseDate = releaseDate;
        this.songs= songs;
        this.price=price;
    }

    public Album() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Song getSongs() {
        return (Song) songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
