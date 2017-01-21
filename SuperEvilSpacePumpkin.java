import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The evil space pumkins are evil and they are from space.
 * 
 * These pumkins are evil - watch out! oh, they live in space too.
 *
 * @author Steve Lamers
 * @version 1.1
 */
public class SuperEvilSpacePumpkin extends Animal
{
	private int upper_limit;
	private int lower_limit;

	public void SuperEvilSpacePumpkin(int upper, int lower) 
	{
		// upper and lower limits are vertical - "y" values, origin (0,0) is upper left corner of the world
		this.upper_limit = upper;
		this.lower_limit = lower;


	}

    /**
     * Act - do whatever the SuperEvilSpacePumpkin wants to do. 
     * SuperEvilSpacePumpkins move up and down randomly between an
	 * upper and lower vertical limit.
     */
    public void act() 
    {
	

        /* Move a little */
        move(20);

        int current_rotation = getRotation();

        if( (current_rotation < 45) && (current_rotation > -45) ) 
        {

        }
        int max = 50;
        
        int ydelta = randomWithRange(0, max) - max / 2  ;
		int y_current = getY();
       	int x_current = getX();
		int x,y;

		if( x_current >= 599)
		{
			x = 0;
		}
		else
		{
			x = x_current + 1;
		}
		
		y = getY();

		if( y == this.upper_limit )
		{
			y += 10;
	    }

        setLocation(x, y_current + ydelta );
       
    }

    private int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;             
        return (int)(Math.random() * range) + min;
    }
}








