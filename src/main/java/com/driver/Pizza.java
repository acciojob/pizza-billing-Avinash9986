package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean extra_cheese = false  ;

    boolean extra_toppings = false ;

    boolean take_away = false ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            price += 300 ;
        }
        else {
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
        this.bill = "";
        if (this.isVeg)
            this.bill+="Base Price Of The Pizza: 300\n";
        else
            this.bill+="Base Price Of The Pizza: 400\n";

        if(this.extra_cheese)
            this.bill+="Extra Cheese Added: 80\n";
        if(this.extra_toppings){
            if(this.isVeg)
                this.bill+="Extra Toppings Added: 70\n";
            else
                this.bill+="Extra Toppings Added: 120\n";
        }

        if(this.take_away)
            this.bill+="Paperbag Added: 20\n";
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
