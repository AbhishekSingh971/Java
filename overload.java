class overloaddemo{

    overloaddemo(){
        System.out.println("method with no parameters");
    }
    overloaddemo(int a){
        System.out.println("value of a :" +a);
    }
    overloaddemo(int a,int b) {
         System.out.println("value of a :" +a + "value of b is"+b);
    }

}
class overload 
{
    public static void main(String args[]){ 
        new overloaddemo(5);
        new overloaddemo(5,7);
    }
}