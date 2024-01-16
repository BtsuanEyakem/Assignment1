public class Helloworld {


    public final static int LEFT = 0;
    public final static int CENTER =1;
    public final static int RIGHT =2;
    String  alignment = null;

    public Helloworld(){

    }
    public void setAlignment(int a){
        switch(a){
            case LEFT:
                alignment = "LEFT";
                break;
            case RIGHT:
                alignment = "RIGHT";
                break;
            case CENTER:
                alignment = "CENTER";
                break;
        }
    }












    public static void main(String[] args) {
       String name = "Hi\uD83D\uDC4B, my name is \u1265\u1341\u12A0\u1295 \u12A5\u12EB\u1244\u121D";
       //my name using Amharic alphabet is
       System.out.print(name);
        //to find size each code and each unicode is counted
        // the wave symbole has a unocodes that is described by two words so they each count separatley
       System.out.println("The total size of the above sentence is: "+ name.length());
    }

}
