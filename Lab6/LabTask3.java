package Lab6;
class Computer{
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected int speed;

    public Computer(){
        wordSize = 2;
        memorySize =3;
        storageSize = 4;
        speed = 5;
    }

    public Computer(int wordSize, int memorySize, int storageSize, int speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public int getWordSize() {
        return wordSize;
    }

    public void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void display(){
        System.out.println("The information of Computer is: ");
        System.out.printf("Word Size : %dbits, Memory Size : %dMB, Storage Size : %dMB, Speed : %dMHz\n",wordSize,memorySize,storageSize,speed);
    }

}

class Laptop extends Computer{
    protected int height;
    protected int width;
    protected int length;
    protected int weight;

    public Laptop(){
        super();
        height = 3;
        width = 4;
        length = 5;
        weight = 6;
    }


    public Laptop(int wordSize, int memorySize, int storageSize, int speed, int height, int width, int length,
            int weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The information of Laptop is : ");
        System.out.printf("Lenght : %d, Width : %d, Height : %d, Weight : %d\n",length,width,height,weight);

    }
}

public class LabTask3 {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop(23, 34, 45, 56, 67, 78, 65, 43);
        laptop1.display();
        laptop1.setMemorySize(233);
        laptop1.setLength(23);
        laptop1.display();
        
    }
}