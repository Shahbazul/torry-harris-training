public class MusicSystem {
    private String name;
    private boolean subWoofer;
    private int lcdScreenSize;
    private int noOfSpeaker;

    public MusicSystem() {
    }

    public MusicSystem(String name, boolean subWoofer, int lcdScreenSize, int noOfSpeaker) {
        this.name = name;
        this.subWoofer = subWoofer;
        this.lcdScreenSize = lcdScreenSize;
        this.noOfSpeaker = noOfSpeaker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubWoofer() {
        return subWoofer;
    }

    public void setSubWoofer(boolean subWoofer) {
        this.subWoofer = subWoofer;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }

    public int getNoOfSpeaker() {
        return noOfSpeaker;
    }

    public void setNoOfSpeaker(int noOfSpeaker) {
        this.noOfSpeaker = noOfSpeaker;
    }
}
