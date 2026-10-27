package classes;

public class otherFunctions {

    public static void print(String text){
        System.out.println(text);
    }

    public static String randomName(){

        String[] nameList;
        nameList = new String[]{
                "gorden", "bob", "fobeo", "richard", "tim", "timmmy", "john", "joe",
                "mikey", "dutch", "andrew", "james","brady","jorge","ian","braxton",
                "collins", "Norah","dane","salem","evan","cesar","williams","reed","shiloh","corbin","peyton","colt",
                "hank","madden","tung tung tung sahur", "garry","brendan","nola","clay","tyson","luka",
                "gould","kane","remy","landen","erik","gill","biggie","smalls","martin","jamir","sam",
                "donald", "slone","lu","wall","jett","norris","olson","ashton","reece","miller","tru","march",
                "carson","randel","ben","benny","chase","bo","peep","sim","sam","ken","michel",
                "holt","bruce","lee","aden","paris","page","riley","cassidy","carter"
        };

        String name = nameList[randomNumber(0, nameList.length)];

        return name;
    }


    public static String randomLastName(){

        String[] nameList;
        nameList = new String[]{
                "fobeo", "quavoius", "timmmy",  "joe","small",
                "bad guy", "meter", "james","brady","jorge","ian","braxton",
                "collins", "Norah","dane","salem","evan","cesar","williams","reed",
                "brendan","nola","clay","reader","tyson","luka","west",
                "cook","biggie","smalls","cruz","jamir","sam","wahsington",
                "donald","Mc", "sir","wall","miller","tru","march",
                "evil", "bo","peep","sim","ken","grey","cheese","run",
                "little", "byrd","ross","lee","page","philips","carter"
        };

        String name = nameList[randomNumber(0, nameList.length)];

        return name;
    }

    //random Number
    public static int randomNumber(int min, int max){

        double number = -1;
        number = Math.random() * (max - min);
        return (int) number + min;

    }


    public static void pause(int time) {
        try{
            Thread.sleep(time);
        } catch (Exception e) {
            print("pause function errored");
        }
    }

    public static void playMysticalMagic(){ // song by Benson Boone
        print("Mystical magical by Benson Boone:");
        pause(1000);
        print("There's nothing colder than your shoulder\n" +
                "When you're dragging me along like you do\n" +
                "Like you do\n" +
                "And then you switch up with no warning\n" +
                "And you kiss me like you want it, how rude\n" +
                "How rude\n" +
                "But I kinda like it anyways\n" +
                "I don't mind if this is gonna take a million days\n" +
                "I know you'll come around\n" +
                "To me eventually\n" +
                "If you sit back, relax, enjoy my company\n" +
                "My company\n" +
                "Once you know what my love's gonna feel like\n" +
                "Nothing else will feel right\n" +
                "You can feel like\n" +
                "Moonbeam ice cream, taking off your blue jeans\n" +
                "Dancing at the movies\n" +
                "'Cause it feels so\n" +
                "Mystical, magical\n" +
                "Oh, baby, 'cause once you know\n" +
                "Once you know\n" +
                "My love is so mystical, magical\n" +
                "Oh, baby, 'cause once you know\n" +
                "Once you know\n" +
                "My little hard-to-get baby\n" +
                "I wanna give you the world\n" +
                "Not saying you gotta chase me\n" +
                "But I wouldn't mind it\n" +
                "If you gave me just a little bit\n" +
                "Of something we can work it with\n" +
                "But all you do is push me out\n" +
                "But I like it anyways\n" +
                "'Cause I think I'm getting closer to you every day\n" +
                "I know you'll come around\n" +
                "To me eventually\n" +
                "Just sit back, relax, enjoy my company\n" +
                "Oh, baby, trust me\n" +
                "Once you know what my love's gonna feel like\n" +
                "Nothing else will feel right\n" +
                "You can feel like\n" +
                "Moonbeam ice cream, taking off your blue jeans\n" +
                "Dancing at the movies\n" +
                "'Cause it feels so\n" +
                "Mystical, magical\n" +
                "Oh, baby, 'cause once you know\n" +
                "Once you know\n" +
                "My love is so mystical, magical\n" +
                "Oh, baby, 'cause once you know\n" +
                "Once you know\n" +
                "Mystical, magical\n" +
                "Oh, baby, it's mystical, magical");
    }


}
