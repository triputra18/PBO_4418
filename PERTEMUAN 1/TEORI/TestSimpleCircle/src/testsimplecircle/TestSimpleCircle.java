/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;

/**
 *
 * @author TRI
 */
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
        System.out.println("The perimeter of the circle of radius "
        + circle1.radius + " is " + circle1.getPerimeter());
        System.out.println("---------------------------------------");
        
        SimpleCircle circle2 = new SimpleCircle(50);
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
        System.out.println("The perimeter of the circle of radius "
        + circle2.radius + " is " + circle2.getPerimeter());
        System.out.println("---------------------------------------");
        
        SimpleCircle circle3 = new SimpleCircle(120);
        System.out.println("The area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());
        System.out.println("The perimeter of the circle of radius "
        + circle3.radius + " is " + circle3.getPerimeter());
        System.out.println("---------------------------------------");
        
        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
        System.out.println("The perimeter of the circle of radius "
        + circle2.radius + " is " + circle2.getPerimeter());
    }   
}
