package homework1;

public class Team {

    private String name;
    private Cyclist[] cyclists;

    public Team(String name, Cyclist[] cyclists) {
        this.name = name;
        this.cyclists = cyclists;
    }

    public String getName() {
        return name;
    }
    public Cyclist[] getCyclists(){
        return cyclists;
    }

}
