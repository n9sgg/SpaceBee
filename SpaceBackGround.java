import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceBackGround here.
 * 
 * @author Steven Lamers 
 * @version 1.1
 */
public class SpaceBackGround extends World
{

    /**
     * Constructor for objects of class SpaceBackGround.
     * 
     */
    public SpaceBackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        addObject(new SuperSpaceBee(),         0, 40);
        addObject(new SuperEvilSpacePumpkin(), 0, 40);
        addObject(new SuperEvilSpacePumpkin(), 0, 100);
        addObject(new SuperEvilSpacePumpkin(), 0, 160);
        addObject(new SuperSpaceSheep(),       0, 600);
        
        
    }
}

