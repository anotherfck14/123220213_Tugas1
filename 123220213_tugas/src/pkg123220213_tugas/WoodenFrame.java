/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220213_tugas;

/**
 *
 * @author HP
 */
 class WoodenFrame extends frameMaterial {
     public WoodenFrame(String material, double length, double width){
         super(material, length, width);
     }
     @Override
    public double calculateArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public void displayInfo() {
        System.out.println("Wooden Frame");
        System.out.println("Material: " + getMaterial());
        System.out.println("Size: " + getLength() + " x " + getWidth());
    }

    
    
}
