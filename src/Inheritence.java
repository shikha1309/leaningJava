class Shape{
    String color;

}
    //SINGLE LEVEL INHERITANCE
class Triangle extends Shape{
    public void area (int l , int h){
        System.out.println(1/2 *l*h);
    }
 }
// MULTI LEVEL INHERITANCE
 class EquilateralTriangle extends Triangle{
        public void area(int l , int h){

            System.out.println(1/2 *l*h);
        }
 }
 class Circle extends Shape{
            public void area (int r){

                 System.out.println((3.14) * r *r);
            }
 }



   public class Inheritence     {
    public static void main (String args[]){
        // creating a object
        Triangle t1 = new Triangle();
        t1 .color = "red";  // t1 is inheriting the property of class shape that is color

    }
}
