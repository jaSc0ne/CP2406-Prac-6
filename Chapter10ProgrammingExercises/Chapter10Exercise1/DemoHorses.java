package Chapter10Exercise1;

public class DemoHorses {
    public static void main(String args[]){

        Horse horse1 = new Horse();
        horse1.setName("Rocinante");
        horse1.setColor("chestnut");
        horse1.setBirthYear(1998);

        RaceHorse horse2 = new RaceHorse();
        horse2.setName("Racer");
        horse2.setColor("black");
        horse2.setBirthYear(2002);
        horse2.setRaces(26);

        System.out.println(horse1.getName()+" is "+horse1.getColor()+" and was born in "+horse1.getBirthYear());
        System.out.println(horse2.getName()+" is "+horse2.getColor()+", was born in "+horse2.getBirthYear()+" and has been in "+horse2.getRaces()+" races.");

    }

}
