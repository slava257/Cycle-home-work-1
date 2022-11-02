public class Main {
    public static void main(String[] args) {
        //Task 5
        System.out.println("Задание 6");
        for (int  year=1904; year<=2096;year++){
            if(year%4==0 && year%100!=0 || year%400==0)
                System.out.println(year+" год является високосным");
        }
        //Task 6
        System.out.println("Задание 7");
        for ( int i = 7;i <= 98;i = i + 7 ){
            System.out.print(i + " ");
        }
        System.out.println();
        //Task 7
        System.out.println("Задание 8");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
    }
}
