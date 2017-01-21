import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SuperSpaceBee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SuperSpaceBee extends Animal
{
    /**
     * Act - do whatever the SuperSpaceBee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x_current = getX();
		int x;

		if( x_current >= 599)
		{
			setLocation(0, getY());
		}
		else
		{
			move(1);
		}

        
        
        
        
        

       
    }    
}
