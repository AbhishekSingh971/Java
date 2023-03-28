class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // computer and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo{
public static void main(String[] args) {
       //declare,allocate,andinitialize Box objects
       Box obj1 = new Box(10,20,15);
       Box obj2 = new Box(3,6,9);

       double vol;

       //get volume of first box
       vol = obj1.volume();
       System.out.println("volume is "+ vol);

       //get volume of second box
       vol = obj2.volume();
       System.out.println("volume is "+ vol);   
    }
}