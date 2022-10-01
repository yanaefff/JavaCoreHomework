package homework1;

public class StartCompetition {

    public static void main(String[] args) {
        Cyclist[] cyclist = new Cyclist[4];
        cyclist[0] = new Cyclist("Максим", 5, 25);
        cyclist[1] = new Cyclist("Женя", 20, 34);
        cyclist[2] = new Cyclist("Рома", 8, 50);
        cyclist[3] = new Cyclist("Толя", 11, 42);

        Mountain[] mountain = new Mountain[3];
        mountain[0] = new Mountain(55);
        mountain[1] = new Mountain(26);
        mountain[2] = new Mountain(40);

        Pit[] pit = new Pit[2];
        pit[0] = new Pit(4);
        pit[1] = new Pit(10);

        Team team = new Team("Команда №1", cyclist);
        Track course = new Track(mountain, pit);
        Competition competition = new Competition();

        String result = competition.doIt(team, course);
        System.out.println(result);
    }
}


