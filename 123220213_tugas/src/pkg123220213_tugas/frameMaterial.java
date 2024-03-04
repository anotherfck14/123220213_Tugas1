/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220213_tugas;

/**
 *
 * @author HP
 */
abstract  class frameMaterial implements frame{
    private String material;
    private double length;
    private double width;
    
    public frameMaterial(String material, double length, double width){
        this.material = material;
        this.length = length;
        this.width = width;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}
