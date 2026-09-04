/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema;

public class Main {
//   public static void main(String[] args){
//       Rectangle r= new Rectangle(6,4);
//
//       
//       System.out.println("Area: "+r.area());
//       System.out.println("Perimeter: "+r.perimeter());
//   }

//    public static void main(String[] args) {
//        Rectangle original = new Rectangle(6,4);
//        
//        System.out.println("Area: "+original.area());
//        Rectangle copy= original;
//        copy.width=10;
//        System.out.println("Via original: "+original.area());
//        System.out.println("Via copy    : "+copy.area());
//        
    ////        Rectangel empty = null;
////        System.out.println(empty.area());
//        Student s = new Student("Nadia", "5000", 3.8);
//        System.out.println(s.describe());
//    }
        
    public static void main(String[] args) {
        Rectangle[]shapes = new Rectangle[3];
        shapes[0]= new Rectangle(6,4);
        shapes[1]= new Rectangle(3,3);
        shapes[2]= new Rectangle(3,2);
        
        for (Rectangle r : shapes){
            System.out.println("Area: "+r.area()+ ", Perimeter: "+r.perimeter());
        }
        
        Student s = new Student("Nadia", "5001", 3.8);
        System.out.println(s.describe());
        
        Circle myCircle= new Circle(5);
        System.out.println("Circle area : "+myCircle.area()+", circumference : "+myCircle.circumference());
        myCircle.circumference();
    }
}
