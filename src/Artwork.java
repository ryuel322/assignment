public class Artwork {
    private String artwork;
    private Artist artist;
    private Gallery gallery;

    public Artwork(String artwork, Artist artist, Gallery gallery) {
        this.artwork = artwork;
        this.artist = artist;
        this.gallery = gallery;
    }

    public String getArtwork() {
        return artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }
}