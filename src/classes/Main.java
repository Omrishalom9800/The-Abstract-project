import classes.ParentAbstracts;
import static classes.otherFunctions.*;
import static classes.ParentAbstracts.*;
import static classes.Fighters.*;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

void main() throws IOException {


        ArrayList<person> guys = new ArrayList<>();

        for (int i = 0; i < 6; i++) { // makes six random fighters out of three classes all under person
            int rand = randomNumber(0, 3);

            if (rand == 1) {
                guys.add(new swordGuy(randomName() + " " + randomLastName(), randomNumber(50, 300), randomNumber(1, 20)));
            } else if (rand == 2) {
                guys.add(new wizardMan(randomName() + " " + randomLastName(), randomNumber(50, 300), randomNumber(1, 20)));
            } else {
                guys.add(new costcoGuy(randomName() + " " + randomLastName(), randomNumber(50, 300), randomNumber(1, 20)));
            }
        }

        print("team:");
        for (int i = 0; i < guys.size(); i++) { // get their name and make them attack
            person guy = guys.get(i);
 //           print(guy.getName() + " the " + guy.getType() + " using his ");
 //           guy.attack();
 //           print("");
        }

        ArrayList<magicMan> mysticDudes = new ArrayList<>();

        for (int i = 0; i < guys.size(); i++) {   // group fighters that are under magic man as well (wizard and costo guy)
            if (guys.get(i) instanceof magicMan) {
                mysticDudes.add((magicMan) guys.get(i));
            }
        }

        if (mysticDudes.size() > 0) {// if the first magic man is a wizard make him do mystical things,
            // else if the first magic man is a costco guy, sing mystical magical by benson boon

 //           mysticDudes.getFirst().coooolMagiccccThingggg();
        }


    String fileName ="ark4SaveData.txt"; // the filee

    // storing stuff to a file
    FileWriter Shakespeare =  new FileWriter(fileName);

    for (int i = 0; i < guys.size(); i++) {   // group fighters that are under magic man as well (wizard and costo guy)
        Shakespeare.write(personToCsv(guys.get(i)) + "\n");
    }
    Shakespeare.close();


    //reading stuff
    try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
        String line;
        while((line = br.readLine()) != null){
            print(line);
        }
    }

}


