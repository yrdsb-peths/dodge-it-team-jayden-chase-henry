import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Banana banana = new Banana();
        addObject(banana, 600, 200);
        Banana bananaTwo = new Banana();
        addObject(bananaTwo, 600, 200);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        setBackground(new GreenfootImage("images/testbackground.png"));
    }
}
