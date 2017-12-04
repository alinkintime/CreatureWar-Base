import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class War here.
 * 
 * @author Chad Pearson
 * @version 2017.11.128
 */
public class War
{
    private ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    private ArrayList<Creature> evilArmy = new ArrayList<Creature>();
    private Randomizer r = new Randomizer();
    Random rand = new Random();
    
    public War() {
        ArmyOne(100);
        ArmyTwo(100);
    }
    
    
    private void  ArmyOne(int Good) {
        for (int i = 0; i < Good; i++) {
            if (Randomizer.nextInt(10) < 7) {
                goodArmy.add(new Human());
            } else {
                goodArmy.add(new Elf());
            }
        }   
    }
    
       private void  ArmyTwo(int Evil) {
        for (int i = 0; i < Evil; i++) {
            int temp = Randomizer.nextInt(100);
            if(temp < 50){
                evilArmy.add(new Human());
            }
            else if (temp < 75) {
                evilArmy.add(new Demon(rand.nextInt(10) +1, rand.nextInt(10)+1));
            }
        }
    }
} 