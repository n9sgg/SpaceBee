import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SuperSpaceSheep here.
 * 
 * @author Steve Lamers 
 * @version 1.1
 */
public class SuperSpaceSheep extends Animal
{
    /**
     * Act - do whatever the SuperSpaceSheep wants to do. 
     *  SuperSpaceSheep get launched
     */
    public void act() 
    {
       double g = 1.5;
       double v = 450.0;
       double height;
       int y0 = 0;
       int x = getX();
       int theta = 45;
       
       // Calculate the height of the SuperSpaceSheep 
       height = y0 + (x * Math.tan(theta))  - ( g * x * x ) / ( 2 * Math.pow(v * Math.cos(theta),2) ) ;
       
       // Translate the y axis value
       int y = 600  - (int)height ;
       
       // Set the location of the SuperSpaceSheep
       setLocation( getX() + 20, y );
       
       
    }    
}
