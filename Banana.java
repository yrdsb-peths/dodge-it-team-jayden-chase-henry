import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    int score = 500;
    public Banana()
    {
        setImage("images/bananas.png");
    }
    public void act()
    {
        score++;
        move(-score/500);
        
        if(getX() <= 0)
        {
            resetBanana();
        }
        
        if(isTouching(Hero.class))
        {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBanana()
    {
        int num = Greenfoot.getRandomNumber(3);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else if(num == 1)
        {
            setLocation(600, 200);
        }
        else if(num == 2)
        {
            setLocation(600, 300);
        }
    }
}
