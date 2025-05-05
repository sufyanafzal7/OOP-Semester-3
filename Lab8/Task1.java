package Lab8;

class Package{
    protected String name;
    protected String senderAddress;
    protected String recieverAddress;
    protected double weight;
    protected double cost;

    public Package(){}

    public Package(String name, String senderAddress, String recieverAddress, double weight, double cost) {
        this.name = name;
        this.senderAddress = senderAddress;
        this.recieverAddress = recieverAddress;
        if(weight>1){this.weight = weight;}
        if(cost>1){this.cost = cost;}
    }

    public double calculateCost(){
        return weight*cost;
    }

    public void display(){
        System.out.println("Package information is:");
        System.out.printf("Name : %s\nSender Address : %s\nReciever Address : %s\nWeight(ounces) : %f\nCost : %f\n",name,senderAddress,recieverAddress,weight,cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecieverAddress() {
        return recieverAddress;
    }

    public void setRecieverAddress(String recieverAddress) {
        this.recieverAddress = recieverAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    

    

}

class TwoDayPackage extends Package{
    private double flatFee;

    public TwoDayPackage(){}

    

    public TwoDayPackage(String name, String senderAddress, String recieverAddress, double weight, double cost,
            double flatFee) {
        super(name, senderAddress, recieverAddress, weight, cost);
        this.flatFee = flatFee;
    }

    
    @Override
    public double calculateCost(){
        return flatFee+(cost*weight);
    }



    public double getFlatFee() {
        return flatFee;
    }



    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("\nTwo Day Package Information is:");
        System.out.printf("Flat Fee : %f\n",flatFee);

    }



}

class OvernightPackage extends Package{
    private double additionalFee;

    public OvernightPackage(){}
    
    public OvernightPackage(String name, String senderAddress, String recieverAddress, double weight, double cost,
            double additionalFee) {
        super(name, senderAddress, recieverAddress, weight, cost);
        this.additionalFee = additionalFee;
    }

    public double calculateCost(){
        return additionalFee+(cost*weight);
    }

    public double getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("\nOvernight Package Information is:");
        System.out.printf("Additional Fee : %f\n",additionalFee);

    }


    

}

public class Task1 {
    public static void main(String[] args) {
        Package package1 = new Package("Name", "Sender Address", "Reciever Address", 23, 2);
        System.out.println("Package Cost : "+package1.calculateCost());
        package1.display();
        System.out.println("\n\n");
        
        TwoDayPackage twoDayPackage1 = new TwoDayPackage("2DP", "SA", "RA", 23, 4, 12);
        System.out.println("Two Day Package Cost : "+twoDayPackage1.calculateCost());
        twoDayPackage1.display();
        System.out.println("\n\n");
        
        OvernightPackage overnightPackage1 = new OvernightPackage("OP", "SA", "RA", 12, 5, 23);
        System.out.println("Overnight Package Cost : "+overnightPackage1.calculateCost());
        overnightPackage1.display();
        
    }
}
