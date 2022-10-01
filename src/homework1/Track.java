package homework1;

public class Track {

    private Mountain[] mountains;
    private Pit[] pits;



    public Mountain[] getMountains() {
        return mountains;
    }

    public Pit[] getPits() {
        return pits;
    }


    public Track(Mountain[] mountains, Pit[] pits) {
        this.mountains = mountains;
        this.pits = pits;
    }

}
