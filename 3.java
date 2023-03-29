class outer{
    int outer_x = 100;
    void test(){
        inner inn = new inner();
        inn.display();
    }
    class inner{
        void display(){
            System.out.println("display:outer_x = "+outer_x);
        }
    }
}

class InnerDemo{
    public static void main(String args[]){
        outer out = new outer();
        out.test();
    }
}
