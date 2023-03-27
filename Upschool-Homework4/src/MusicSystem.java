import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicSystem {
    private List<Album> albums;
    private List<Song> songs;

    private List<User> users;


    public MusicSystem() {
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
        this.users=new ArrayList<>();

    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        this.users.add(user);
        System.out.println("Hesap oluşturuldu.");
    }


    public void addAlbum(Album album) {
        this.albums.add(album);
        System.out.println("Albüm eklendi.");
    }

    public void removeAlbum(Album album) {
        this.albums.remove(album);
        System.out.println("Albüm çıkarıldı.");
    }

    public void addSong(Song song) {
        this.songs.add(song);
        System.out.println("Şarkı eklendi.");
    }

    public void removeSong(Song song) {
        this.songs.remove(song);
        System.out.println("Şarkı çıkarıldı.");
    }

    public void searchAlbum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aramak istediğiniz albümün ismini yazınız: ");
        String input = sc.next();
        for (int i = 0; i < this.albums.size(); i++) {
            if (this.albums.get(i).getName().equalsIgnoreCase(input)) {
                System.out.println("Arama yapıldı. Bulunan sonuçlar; " + this.albums.get(i).getName());
            } else {
                System.out.println("Arama sonucu bulunamadı.");

            }
        }

    }


}
