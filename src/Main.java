import java.time.LocalDate;

public class Main {

    // Task 1
     public static void checkingLeapYear (int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // Task 2
    public static void choosingApplicationVersion (int clientOS, int currentYear) {
        if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && currentYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // Task 3
    public static int calculateDeliveryDays (int deliveryDistance){
        if (deliveryDistance <= 20) {
            return 1;
        }
        if (deliveryDistance <= 60) {
            return 2;
        }
        if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }


    public static void main (String[] args) {
         int currentYear = LocalDate.now().getYear();
         int clientOS = 0;
         int deliveryDistance = 95;
         int deliveryDays = calculateDeliveryDays(deliveryDistance);

         checkingLeapYear(currentYear);
         choosingApplicationVersion(clientOS,currentYear);
         if (deliveryDays > 0) {
             System.out.println("Потребуется дней: " + deliveryDays);
         } else {
             System.out.println("Доставка не возможна, расстояние слишком большое");
         }
    }
}