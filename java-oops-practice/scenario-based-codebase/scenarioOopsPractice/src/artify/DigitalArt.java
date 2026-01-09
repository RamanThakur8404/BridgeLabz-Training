package artify;
class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    public DigitalArt(String title, String artist, double price, String licenseType, boolean previewAvailable) {
        super(title, artist, price, licenseType, previewAvailable);
    }

    @Override
    public void license() {
        System.out.println("Digital Art License: " + licenseType + " (Personal use only)");
    }
}
