package homework1;

public class Cyclist {

    private String name;
    private int jumpDistance;
    private int climbDistance;

    public Cyclist (String name, int jumpDistance, int climbDistance){
        this.name = name;
        this.jumpDistance = jumpDistance;
        this.climbDistance = climbDistance;
    }

    public String getName() {
        return name;
    }

    public int getJumpDistance(){
        return jumpDistance;
    }

    public int getClimbDistance(){
        return climbDistance;
    }
}
