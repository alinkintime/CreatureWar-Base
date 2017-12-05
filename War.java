import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class War here.
 * 
 * @author Chad Pearson
 * @version 
 */
public class War
{
    private ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    private ArrayList<Creature> evilArmy = new ArrayList<Creature>();
    
    public War() {
        ArmyOne(100);
        ArmyTwo(100);
    }
    
    /**
     * 
     * Each time Armyone loops, a random number is generated between 0 and 9.
     * If that number is greater that 7, a human and an elf is created
     * for the good army.
     */
    private void  ArmyOne(int Good) {
        for (int i = 0; i < Good; i++) {
            if (Randomizer.nextInt(10) < 7) {
                goodArmy.add(new Human());
            } else {
                goodArmy.add(new Elf());
            }
        }   
    }
    
    /**
     * In this Armytwo method, This seperate random variable of temp is created 
     * first to account for the fact that evil humans and demons 
     * will spawn at different rates.
     */
       private void  ArmyTwo(int Evil) {
        for (int i = 0; i < Evil; i++) {
            int temp = Randomizer.nextInt(100);
            if(temp < 50){
                evilArmy.add(new Human());
            }
            else if (temp < 75) {
                evilArmy.add(new Demon());
            }
        }
    }
} 