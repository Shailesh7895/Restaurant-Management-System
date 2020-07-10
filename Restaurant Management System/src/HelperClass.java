
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
public class HelperClass{
    public double costofMomos = 150;
    public double costofChilli = 488;
    public double costofBurger = 188;
    public double costofHotDog = 290;
    public double costofFrooti = 100;
    public double costofLemon = 95;
    public double costofBeer = 520;
    public double costofMilkShake = 25;
    
    public double momos,chilli,burger,hotdog,frooti,lemon,beer, milkShake, meals , drinks,total;
    
    public double getAmount(){
    meals = momos + chilli + burger + hotdog;
    drinks = frooti + lemon + beer + milkShake;
    total = meals + drinks;
        return total;
    }
    private JFrame frame;
    public void isExit(){
    System.exit(0);
    }
    public double getMeals(){
    meals = costofMomos * momos + costofChilli * chilli + costofBurger * burger + costofHotDog * hotdog;
    return meals;
    }
    public double getDrinks(){
    drinks = costofFrooti * frooti + costofLemon * lemon + costofBeer * beer + costofMilkShake * milkShake;
    return drinks;
    }
    public double getTotal(){
    total = meals + drinks;
        return total;
    }
   
}
