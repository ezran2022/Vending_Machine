import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t****************************************************");
        System.out.println("\t                WELCOME TO JAVA DRINKS              ");
        System.out.println("\t****************************************************");
        

        Item[][] items = new Item[][]{
            {new Item("Pepsi",1.99,3),new Item("Fresca",1.49,3),new Item("Turbo",2.99,3)},
            {new Item("Fanta",1.99,2),new Item("Mutzing",1.49,2),new Item("Heineken",2.99,3)},
            {new Item("Crush",1.99,2),new Item("C-Cola",1.49,2),new Item("Amstel",2.99,3)}
        };

        Machine machine = new Machine(items);
        // Item item = machine.getItem(2, 1);
        // item.setPrice(2.49);
        // machine.setItem(item, 2, 1);
        // System.out.println("\t"+machine.getItem(2, 1));

        // machine.dispense(0, 0);
        // machine.dispense(0, 0);
        System.out.println("\t"+machine+"\t");

        while(true){
            System.out.print("Pick a row: "); 
            int row = input.nextInt(); 
            System.out.print("Pick a spot in the row: "); 
            int spot = input.nextInt();

            boolean dispensed = machine.dispense(row, spot);
            System.out.println("\n\t"+machine+"\t");

            if(dispensed == true){
                System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            }else{
                System.out.print("\nSorry, we're out of this item. Press 1 to purchase another: ");
            }

            if(input.nextInt() != 1){
                break;
            }
        }
        }
}
