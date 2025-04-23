import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    public Hero()
    {
        setImage("images/ppl1.png");
    }
    boolean atTop = true;
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        
        if(atTop)
        {
            setLocation(100,100);
        }
        else
        {
            setLocation(100,300);
        }
    }
}
