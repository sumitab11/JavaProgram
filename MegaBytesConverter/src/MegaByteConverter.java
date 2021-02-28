public class MegaByteConverter {
    public static void printMegaBytesAndkiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes / 1024;
            int kBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB= " + megaBytes + " MB "+ kBytes +"  KB ");
        }
    }
}
