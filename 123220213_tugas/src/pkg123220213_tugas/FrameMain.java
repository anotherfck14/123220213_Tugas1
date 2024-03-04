/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220213_tugas;

/**
 *
 * @author HP
 */
public class FrameMain {
    public static void main(String[] args) {
        // Creating instances of different frame types
        WoodenFrame woodenFrame = new WoodenFrame("Oak", 10, 8);
        metalframe metalFrame = new metalframe("Steel", 12, 9);
        plasticframe plasticFrame = new plasticframe("Polyethylene", 8, 6);

        // Displaying information of each frame
        woodenFrame.displayInfo();
        System.out.println("Area: " + woodenFrame.calculateArea());
        System.out.println("Perimeter: " + woodenFrame.calculatePerimeter());
        System.out.println();

        metalFrame.displayInfo();
        System.out.println("Area: " + metalFrame.calculateArea());
        System.out.println("Perimeter: " + metalFrame.calculatePerimeter());
        System.out.println();

        plasticFrame.displayInfo();
        System.out.println("Area: " + plasticFrame.calculateArea());
        System.out.println("Perimeter: " + plasticFrame.calculatePerimeter());
    }
    
}
