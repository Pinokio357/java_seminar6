import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class choise {
    public static void main(String[] args) {
        Set<Laptop> sklad = new HashSet();
        Set<Laptop> selection = new HashSet();
        Laptop note1 = new Laptop(128, 1024, "Linux", "black", "note1");
        sklad.add(note1);
        Laptop note2 = new Laptop(256, 1024, "Windows", "black", "note2");
        sklad.add(note2);
        Laptop note3 = new Laptop(128, 2048, "Linux", "white", "note3");
        sklad.add(note3);
        Laptop note4 = new Laptop(128, 1024, "linux", "white", "note4");
        sklad.add(note4);
        Laptop note5 = new Laptop(256, 2048, "Windows", "black", "note5");
        sklad.add(note5);
        Laptop note6 = new Laptop(128, 1024, "Linux", "white", "note6");
        sklad.add(note6);
        String menu = "Enter number of necessary parametr: \n 1.RAM \n 2.HDD size \n 3.OS \n 4.Color ";
        System.out.println("hello!");
        System.out.println(menu);
        int choise = getNumber(4);
        switch(choise){
            case 1:
                System.out.println("select: \n 1.128mB \n 2.256 mB ");
                int select1 = getNumber(2);
                for(Laptop item: sklad){
                    switch(select1){
                        case 1:
                            if(item.getRam() == 128){
                                selection.add(item);
                            }
                            break;
                        case 2:
                            if(item.getRam() == 256){
                                selection.add(item);
                            }
                            break;

                    }
                }
                break;
            case 2:
                System.out.println("select: \n 1.1024gB \n 2.2048gB");
                int select2 = getNumber(2);
                for(Laptop item: sklad){
                    switch(select2){
                        case 1:
                            if(item.getHddSize() == 1024){
                                selection.add(item);
                            }
                            break;
                        case 2:
                            if(item.getRam() == 2048){
                                selection.add(item);
                            }
                            break;

                    }
                }
                break;
            case 3:
                System.out.println("select: \n 1.Windows \n 2.Linux");
                int select3 = getNumber(2);
                for(Laptop item: sklad){
                    switch(select3){
                        case 1:
                            if(item.getOs().equals("Windows")){
                                selection.add(item);
                            }
                            break;
                        case 2:
                            if(item.getOs().equals("Linux")){
                                selection.add(item);
                            }
                            break;

                    }
                }
                break;
            case 4:
                System.out.println("select: \n 1.black \n 2. white");
                int select4 = getNumber(2);
                for(Laptop item: sklad){
                    switch(select4){
                        case 1:
                            if(item.getColor().equals("black")){
                                selection.add(item);
                            }
                            break;
                        case 2:
                            if(item.getColor().equals("white")){
                                selection.add(item);
                            }
                            break;

                    }
                }
                break;
        }
        for(Laptop item: selection){
            System.out.println(item);
        }


    }
    public static int getNumber(int count){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        Boolean flag = true;
        while (flag){
            System.out.println("enter number: ");
            String temp = sc.nextLine();
            if(isDigit(temp)&& (Integer.parseInt(temp)<= count)){
                result = Integer.parseInt(temp);
                flag = false;
            }
            else{
                System.out.println("it must  be number from 1 to " + count +"!");
            }
        }
        return  result;
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
