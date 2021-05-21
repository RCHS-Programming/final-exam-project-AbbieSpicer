
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sand2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sand2 extends World
{

    /**
     * Constructor for objects of class sand2.
     * 
     */
    public sand2()
    {    
        super(800, 600, 1); 
    {
        for(int i = 0; i < 16; i++)
        addObject(new Wall("edge.png"), 25 + 50*i, 12);
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge.png"), 25 + 15*i, 300);
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge.png"), 15*i + 25, 150);
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge.png"), 15*i + 25, 450);
    }
    }
}
