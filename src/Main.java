public class Main {
    public static void main(String[] args) {
        //Task 9
        System.out.println("Задание 9");
        int contribution = 29000;
        int total = 0;
        for (int i=0;i<12;i++){
            total = total + contribution;
            System.out.println("Месяц "+i+" ,сумма накоплений равна "+total+" рублей");
        }
        //Task 10
        System.out.println("Задание 10");
        int deposit = 29000;
        int total1 = 0;
        for (int i=0;i<12;i++){
            total1 =total1 +total1/100;
            total1 = total1 + deposit ;
            System.out.println("Месяц "+i+" ,сумма накоплений равна "+total1+" рублей");
        }
    }
}
