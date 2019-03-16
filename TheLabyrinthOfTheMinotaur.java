import java.util.Scanner;
import java.util.ArrayList;

public class TheLabyrinthOfTheMinotaur {

    public static void main(String[] args) {
        int health = 10;
        int roomCounter = 0;
        ArrayList<String> roomDescr = new ArrayList<>();
        roomDescr.add("You have found a heal, Nice");
        roomDescr.add("OH MY GOD! This is Skeleton");
        roomDescr.add("Huh, empty room");
        int[] healthModificator = {+2, -6, 0};

        Scanner scan = new Scanner(System.in);
        ArrayList<String> description = new ArrayList<>() ;
        description.add("Мрачное подземелье, голая кирпичная стена, обвалившийся местами потолок, несколько дверей ведущих в разных направлениях");
        description.add("Видимо это бывшая оружейная комната. Но все давно проржавело и покрыто пылью");
        description.add("Похоже здесь что-то хранили, деревянные полки, мешки");
        description.add("Все в паутине, скорее бы выбраться в другую комнату");
        description.add( "Кап-кап-кап - раздается звук падающих капель. Сыро и мерзко");
        description.add( "Голые каменные стены, кажется здесь ничего нет");
        description.add("Остатки мебели натолкнули на мысль что здесь когда то была комора");
        description.add( "Четыре стены, сухой воздух, ничего особенного");
        description.add( "Обычная комната четыре метра на четыре");
        description.add( "Эта комната больше чем обычно, но похоже в ней ничего нет");
        description.add("Кроме скелета на полу ничего интересного");
        description.add("Длинный коридор в конце которого виднеются двери");
        description.add("Похоже комната стражи, несколько коек и разбитый котел в углу");
        description.add("Обычная комната, голые стены и камень под ногами");

        for (;;){
            System.out.println("Please choose direction s/w/n/e" +" " + "Or type end for exit");
            String decision = scan.next();
            System.out.println("You choose " + decision);
            if (decision.equals("s")){
                System.out.println("You are going on the south and you find a room, you open the door and your mind tell you");
                roomCounter++;
            }else if (decision.equals("n")){
                System.out.println("You are going on the north and you find a room, you open the door and your mind tell you");
                roomCounter++;
            }else if (decision.equals("e")) {
                System.out.println("You are going on the west and you find a room, you open the door and your mind tell you");
                roomCounter++;
            }else if (decision.equals("w")) {
                System.out.println("You are going on the west and you find a room, you open the door and your mind tell you");
                roomCounter++;
            }else if (decision.equals("end")) {
                System.out.println("Thank you and good luck");
                return;
            }else {
                System.out.println("wrong! please choose correct");
                continue;
            }

            int value = getRandomBetweenRange(0, description.size() - 1);
            String roomDescription = description.get(value);
            System.out.println(roomDescription);

            health = getHealth(health, roomDescr, healthModificator);

            if (winLose(health, roomCounter)) return;

            System.out.println("You have visited " + roomCounter + " room(s)");
            System.out.println("///////////////////////////////////////////////////////////////////////////////");


        }

    }

    public static int getHealth(int health, ArrayList<String> roomDescr, int[] healthModificator) {
        int modifiyer = getRandomBetweenRange(0,2);
        int healthMod = healthModificator[modifiyer];
        health += healthMod;
        System.out.println(roomDescr.get(modifiyer));
        System.out.println("your health now is " + health);
        return health;
    }

    public static boolean winLose(int health, int roomCounter) {
        if (health <= 0){
            System.out.println("You hero is died");
            return false;
        } else if (roomCounter == 10){
            System.out.println("My congratulation you WIN");
            return true;
        }
        return false;
    }

    public static int getRandomBetweenRange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
}
