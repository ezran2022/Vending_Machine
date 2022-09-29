# Vending_Machine
## This is a Java Desktop Application which used to consume several drink in the store of course after perfoming certain task
  ##  to ensure the good functionality of our application system
  
  By Starting we show you our Drink's store and give you a possibility of choosing what you want to drink 
  
  ![image](https://user-images.githubusercontent.com/103323625/193039690-b5bb7550-9384-455f-a3f0-fb1c9d8bd54b.png)

So as we see the user choose 1(row) and 2(spot) so we can access that drink and if you see well the quantity has been reduced after picking up 1 Heineken 


![image](https://user-images.githubusercontent.com/103323625/193040331-fc0a986d-e6d0-458e-adce-36abe30eb3e1.png)


After pick up a drink we still give you a chance of keeping choosing another drink until our store is empty means that quantity = 0

![image](https://user-images.githubusercontent.com/103323625/193041175-0b2a4dbf-5f92-411b-a1c9-8b7fb08134ae.png)

so Now after pick up several time the quantity is 0 means that will give you a message which tell you that the type of 
 that drink is no available in that moment
 
 ![image](https://user-images.githubusercontent.com/103323625/193041901-1cdf0ed1-d202-414e-a369-f88bb6bd195d.png)

we will continue let you choose  what you want to drink till  the quantity is less than or equal to zero

### This is how Vending Machine Application work!!!!!


###code
```java
public class Machine {
    private Item[][] items;

    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }

    public Item getItem(int row, int spot){
        return new Item(this.items[row][spot]);
    }

    public void setItem(Item item, int row, int spot){
        this.items[row][spot] = new Item(item);
    }

    public boolean dispense(int row, int spot){
        if(this.items[row][spot].getQuantity() > 0){
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1);
            return true;
        }
        return false;
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                temp += this.items[i][j].toString();
            }
            temp += "\t\n\n\t";
        }
        temp += "******************************************************";
        return temp;
    }
}


```
