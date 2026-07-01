package oops;
class Pen{
    String color;
    String type; //ballpoint; gel

    public void write(){
        System.out.println("writing somethings");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    Pen(){
        System.out.println("Construction define");
    }

}




public class OOPS{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
         Pen pen3 = new Pen();
        pen3.color = "red";
        pen3.type = "gel";

        pen1.printcolor();
        pen2.printcolor();
        pen3.printcolor();
        pen1.write();
    }
}
