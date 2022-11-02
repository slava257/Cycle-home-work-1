public class Main {
    public static void main(String[] args) {
        //Task 9
        System.out.println("Задание9");
        int contribution = 29000;
        int total = 0;
        for (int i=1;i<=12;i++){
            total = total + contribution;
            System.out.println("Месяц "+i+" ,сумма накоплений равна "+total+" рублей");
        }
        //Task 10
        System.out.println("Задание 10");
        double depositAtPercent = 29000;
        double total1 = 0;
        for (int i=1;i<=12;i++){
            total1 = total1 + depositAtPercent ;
            total1 =total1 +total1/100;
            System.out.println("Месяц "+i+" ,сумма накоплений равна "+total1+" рублей");
        }
    }
}
