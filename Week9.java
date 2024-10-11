public class Week9 {
    
    public static void main(String[] args) {
        int x = 8;
        int y = 3;
        if (x < 8 || y > 2){
            if (x % 2 == 0){
                System.out.println("One");
            }else{
                System.out.println("Two");
            }
            System.out.println("Three");
        }else if (x == 8){
            if (y == 3){
                System.out.println("Four");
            }
        }
        if (y/4 == 0){
            System.out.println("Five");
        }
            System.out.println("Six");
    }

    
}
