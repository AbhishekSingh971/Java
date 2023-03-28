class Rectangle {
    double length;
    double breath;

    //This is the constructor for Box;
    Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }

    //computer and return volume
    double area(){
        return length * breath;
    }
}

class areaUsingThis{
    public static void main(String args[]){
        //declare,allocate,andinitialize Box objects
        Rectangle ob1 = new Rectangle(10,20);
        Rectangle ob2 = new Rectangle(3,6);
        Rectangle ob3 = new Rectangle(5,56);

        double ar;

        //get volume of first box
        ar = ob1.area();
        System.out.println("volume is "+ ar);

        //get volume of second box
        ar = ob2.area();
        System.out.println("volume is "+ ar);
        
        //get volume of second box
        ar = ob3.area();
        System.out.println("volume is "+ar);
    }
}