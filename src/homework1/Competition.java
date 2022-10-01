package homework1;

public class Competition {

    String result;

    public String doIt(Team team, Track course) {
        result = "Команда номер: " + team.getName() + " " + '\n';
        for (Cyclist cyclist : team.getCyclists()) {
            result += "Имя велосипедиста: " + cyclist.getName() + " " + '\n';
            int сlimbDistance = cyclist.getClimbDistance();
            int jumpDistance = cyclist.getJumpDistance();
            checkMountain(сlimbDistance, course);
            checkPit(jumpDistance, course);
        }

        return result;
    }

    private void checkMountain(int сlimbDistance, Track course) {
        for (Mountain mountain : course.getMountains()) {
            if (сlimbDistance < mountain.getMountainSize()) {
                result += "Не забрался на гору " + '\n';
            } else result += "Забрался на гору " + '\n';

        }
    }

    private void checkPit(int jumpDistance, Track course) {
        for (Pit pit : course.getPits()) {
            if (jumpDistance < pit.getPitSize()) {
                result += "Не перепрыгнул яму " + '\n';
            } else result += "Перепрыгнул яму " + '\n';
        }
    }


}
