package Lab3;

class HotDogStand{
    private int id;
    private int itemSold;



public HotDogStand(){
    id = 0;
    itemSold = 0;
    System.err.println("Default Costructor Output: ");
}

public HotDogStand(int id, int itemSold){
    this.id = id;
    this.itemSold = itemSold;
    System.err.println("Paramerized Constructor: ");
}



public int getId() {
    return id;
}



public void setId(int id) {
    this.id = id;
}



public int getItemSold() {
    return itemSold;
}



public void setItemSold(int itemSold) {
    this.itemSold = itemSold;
}

public int getJustSold(){
    return itemSold++;
}

public String toString(){
    return ("ID = "+id+", Item Sold: "+itemSold+" ");
}

}



public class LabTask4 {

    public static void main(String[] args) {
        HotDogStand hds = new HotDogStand();
        hds.getJustSold();
        System.err.println(hds.toString());


        HotDogStand hds1 = new HotDogStand(1,0);
        hds1.getJustSold();
        hds1.getJustSold();
        hds1.getJustSold();
        System.err.println(hds1.toString());


        HotDogStand hds2 = new HotDogStand(2,0);
        hds2.getJustSold();
        
        System.err.println(hds2.toString());
        
    }
}