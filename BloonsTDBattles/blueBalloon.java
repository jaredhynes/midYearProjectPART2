import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blueBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blueBalloon extends Balloon
{
    public int speed = 7;
    /**
     * Act - do whatever the blueBalloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public blueBalloon() {
        super(7);
    }
    public void act() 
    {
        super.act(speed);
    }    
}