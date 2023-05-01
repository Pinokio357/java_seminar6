public class Laptop {
    /*
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет
     * */
    private  int ram;
    private  int hddSize;
    private String os;
    private String color;
    private String name;
    public Laptop(int ram, int hddSize, String os, String color, String name){
        this.ram = ram;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.name = name;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public String getOs() {
        return this.os;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return  this.name + ": " + " ram: " + this.ram + ", HDD: " + this.hddSize + ", OS: " + this.os + ", color: " +color;
    }
}
