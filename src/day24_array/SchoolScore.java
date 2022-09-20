package day24_array;

public class SchoolScore {

    public static void main(String[] args) {

        String[] items = {"BackPack", "Jacket", "Shirt", "MacBook", "NoteBook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        System.out.println("Full Catalog: \nID    | NAME | PRICE");

        for (int i = 0; i < items.length; i++){

            System.out.println(itemId[i]+ "| "+ items[i]+" | $"+prices[i]);

        }

        //finding if jackets are in store
        boolean inStock = false;
        for (String eachItem:items){
            if (eachItem.equalsIgnoreCase("jacket")){
                inStock= true;
                break; // if we found the jacket in loop stop the search
            }
        }
        System.out.println(inStock? "Jacket is in stock": "We do not have any jackets in store");

        //finding the index of notebook

        int index = -1; // default starting point
        for (int i = 0; i < items.length; i++){

            if(items[i].equalsIgnoreCase("notebook")){
                index = i;
            }

        }
        System.out.println("Index of NoteBook: "+index);
        System.out.println();
        //find most expensive item and show all information about it

        double maxPrice = prices[0]; // to find biggest num put first index of array, if it is biggest fine if no it will change later
        int indexOfMax = 0;

        for (int i = 0; i < prices.length; i++){

            if (prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("Most Expensive Item: "+itemId[indexOfMax]+ "| "+ items[indexOfMax]+" | $"+prices[indexOfMax]);







    }
}
