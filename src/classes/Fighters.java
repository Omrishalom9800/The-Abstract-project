package classes;
import static classes.otherFunctions.*;
import static classes.ParentAbstracts.*;
public class Fighters {

    //actual classes
    public static class swordGuy extends person { // not magical


        public swordGuy(String Name, double ib, double mph ){
            super(Name,ib,mph);
            this.type = "sword Guy";
        }

        @Override
        public void attack() {
            print("sword Attack");
        }

        @Override
        public void defend(){
            print("sword Defend");
        }
    }




    public static class wizardMan extends magicMan {

        public wizardMan(String Name, double ib, double mph ){
            super(Name,ib,mph);
            this.type = "wizard Man";

        }

        @Override
        public void coooolMagiccccThingggg(){
            print(name + " is being mystical magic");
        }

        @Override
        public void attack() {
            print("wizard Attack");
        }

        @Override
        public void defend(){
            print("wizard Defend");
        }
    }





    public static class costcoGuy extends magicMan {

        public costcoGuy(String Name, double ib, double mph ){
            super(Name,ib,mph);
            this.type = "costco Guy";

        }

        @Override
        public void coooolMagiccccThingggg(){
            print(name + " sings ");
            pause(1500);
            playMysticalMagic();
        }

        @Override
        public void attack() {
            print("costco attack");
        }

        @Override
        public void defend(){
            print ("costco defend");
        }
    }


}
