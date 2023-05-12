public class Season {
    public static void main(String [] args){
        int num = 8 ;
        if (num == 3 || num == 5 || num == 7){
            System.out.println("Season is Summer");
    }
        else if(num == 8 || num == 9) {
        System.out.println("Season is Autumn");
    }
        else if(num == 10 || num == 11 || num == 12) {
        System.out.println("Season is Winter");
    }
        else if(num == 1 || num == 2) {
        System.out.println("Season is Spring");
    }
        else {
            System.out.println("Invalid Season");
        }
    }
}
