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
        
        overloaddemo ob = new overloaddemo(5);
        overloaddemo ob1 = new overloaddemo(5,7);
    }
}