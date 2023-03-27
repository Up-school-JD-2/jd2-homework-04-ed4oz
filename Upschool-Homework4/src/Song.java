public class Song {
    private String name;
    private String singerName;
    private Album album;
    private double length;


    public Song(String name, String singerName, Album album, double length) {
        this.name = name;
        this.singerName = singerName;
        this.album = album;
        this.length = length;
    }

    public Song() {
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


}
