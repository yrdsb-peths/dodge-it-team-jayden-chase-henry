import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    int score = 500;
    boolean isAlive = true;
    public Banana()
    {
        setImage("images/bananas.png");
    }
    public void act()
    {
        if (isAlive)
        {
           score++; 
        }
        move(-score/500);
        
        if(getX() <= 0)
        {
            resetBanana();
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            resetGame();
        }
        
        if(isTouching(Hero.class))//death code
        {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
            score  = 0;
            isAlive = false;
        }
    }
    public void resetGame()
    {
        score = 500;
        isAlive = true;
        resetBanana();
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