public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesandKiloBytes(-10);
    }
    public static void printMegaBytesandKiloBytes (int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        } else if (kiloBytes>0){
            int converttoMB =kiloBytes/1024;
            int remainingKB = kiloBytes%1024;
            System.out.println(kiloBytes +" KB = "+ converttoMB +" MB and "+ remainingKB +" KB");
        }
    }
}
