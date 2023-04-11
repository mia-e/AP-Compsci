//Mia Escoto
//project 2
//prints out triange with + and #

public class ch7_p2{
    public static void main(String args[]){
        System.out.println();
        for(int i =0; i<6; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("+");
            }
            for(int k = 5; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}