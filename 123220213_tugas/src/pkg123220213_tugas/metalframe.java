/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220213_tugas;

/**
 *
 * @author HP
 */
 class metalframe implements frame {
     private String material;
     private double length;
     private double width;
     
     public metalframe (String material, double length, double width){
     this.material = material;
     this.length = length ;
     this.width = width;
     }

    @Override
    public double calculateArea() {
        return length *width; 
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void displayInfo() {
        System.out.println("Metal Frame");
        System.out.println("Material: " + material);
        System.out.println("Size: " + length + " x " + width);
    }
    
}
