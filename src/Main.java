public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Shokan Ualihanov");
        Artist artist2 = new Artist("Abylkhan Kasteev");
        Artist artist3 = new Artist("Tleuberdy Bekmukhanbet");

        Gallery gallery1 = new Gallery("Kazakh National Museum");
        Gallery gallery2 = new Gallery("Kasteev State Museum of Arts");
        Gallery gallery3 = new Gallery("Astana Modern Art Gallery");

        Artwork art1 = new Artwork("Atameken", artist1, gallery1);
        Artwork art2 = new Artwork("Kazakh Girl", artist2, gallery2);
        Artwork art3 = new Artwork("Nomadic Spirit", artist3, gallery3);

        System.out.println(art1.getArtist() + " " + art1.getArtwork() + " " + art1.getGallery());
        System.out.println(art2.getArtist() + " " + art2.getArtwork() + " " + art2.getGallery());
        System.out.println(art3.getArtist() + " " + art3.getArtwork() + " " + art3.getGallery());

        System.out.println("Art 1 and Art 2:");
        if (art1.equals(art2)) {
            System.out.println("The artworks are the same.");
        } else {
            System.out.println("The artworks are different.");
        }

        System.out.println("Art 1 and Art 3:");
        if (art1.equals(art3)) {
            System.out.println("The artworks are the same.");
        } else {
            System.out.println("The artworks are different.");
        }
    }
}