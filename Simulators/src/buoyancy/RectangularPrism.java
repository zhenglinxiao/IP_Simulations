/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoyancy;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author cstuser
 */
public class RectangularPrism {
    
    private Rectangle RectangularPrism;
    private double volume;
    private double height;
    private double width;
    
    
    public RectangularPrism(Rectangle r, double volume,double width, double height, double X, double Y){
        RectangularPrism = r;
        this.volume = volume;
        RectangularPrism.setLayoutX(X);
        RectangularPrism.setLayoutY(Y);
        RectangularPrism.setWidth(width);
        RectangularPrism.setHeight(height);
    }
    
    public RectangularPrism(Rectangle r){
        RectangularPrism = r;
       
    }
    
    public Rectangle getRectangularPrism(){
         return RectangularPrism;
     }

    public void setLayoutX(double x){
        RectangularPrism.setLayoutX(x);
    }
    
    public void setVolume(double volume){
        this.volume = volume;
    }
    
    public void setLayoutY(double y){
        RectangularPrism.setLayoutY(y);
    }

    public double getLayoutX() {
        return RectangularPrism.getLayoutX();
    }

    public double getLayoutY() {
        return RectangularPrism.getLayoutY();
    }
    
    public double getVolume(){
        return volume;
    }
}