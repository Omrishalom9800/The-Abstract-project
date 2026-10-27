package classes;
import static classes.otherFunctions.*;

public class ParentAbstracts {

    public abstract static class person {// the master class

        protected String type; // is it a fighter, wizard, or costco guy
        protected String name;
        protected double weight;
        protected double speed;
        protected int sickness = 0;
        protected int hunger = 10;

        public person(String Name, double ib, double mph) {
            this.name = Name;
            this.weight = ib;
            this.speed = mph;
        }

        public void eat(int yummness, int nastiness, String foodName){ // all persons can "eat"
            sickness = sickness + nastiness;
            hunger = hunger + yummness;

            print(name + " ate " + foodName);
        }

        public abstract void attack();
        public abstract void defend();


        //  gets/sets

        public String getName(){return name;}
        public double getSpeed(){return speed;}
        public double getWeight(){return weight;}
        public String getType() {return type;}
    }




    public static abstract class magicMan extends person{ // abstract extension for magic persons

        protected int magics = 0; // magic people are powered by paper work

        public magicMan(String Name, double ib, double mph ){
            super(Name,ib,mph);
        }

        abstract public void coooolMagiccccThingggg();

        //gets and sets
        public void setPaperWorkCount(int newPaperCount){magics = newPaperCount;}
        public int getPaperWorkCount(){return magics;}

    }

}
