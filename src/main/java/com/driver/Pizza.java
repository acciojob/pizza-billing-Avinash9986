package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean extra_cheese  ;

    boolean extra_toppings ;

    boolean take_away ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            bill = "Base Price Of The Pizza: 300 \n" ;
            price += 300 ;
        }
        else {
            bill = "Base Price Of The Pizza: 400 \n" ;
            price += 400 ;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if (!extra_cheese){
            extra_cheese = true ;
            price += 80 ;

        }

    }

    public void addExtraToppings(){
        // your code goes here

        if (!extra_toppings){
            extra_toppings =true ;
            if(isVeg){
                price += 70 ;

            }
            else{
                price += 120 ;

            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!take_away){
            take_away = true ;
            price += 20 ;

        }
    }

    public String getBill(){
        // your code goes here
        if(extra_cheese){
            bill += "Extra Cheese Added: 80 \n" ;
        }
        if(extra_toppings && isVeg){
            bill += "Extra Toppings Added: 70 \n" ;
        }
        if (extra_toppings && !isVeg){
            bill += "Extra Toppings Added: 120 \n " ;
        }
        if(take_away){
            bill += "Paperbag Added: 20 \n" ;
        }
        bill +=  "Total Price: " + price ;
        return this.bill;
    }
}
