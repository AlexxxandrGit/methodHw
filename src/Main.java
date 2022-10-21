public class Main {


    // Задание 1.

    public static void checkingTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

    }

    // Задание 2.
    public static void applicationCompatibilityCheck(int operatingSystemType, int deviceAge) {


        if (operatingSystemType == 0 && deviceAge >= 2022) {
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (operatingSystemType == 0 && deviceAge < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operatingSystemType == 1 && deviceAge < 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите приложения для Android по ссылке");
        }


    }

    public static int deliveryDistance(int deliveryDistance) {

        int dayDelivery = 1;

        if (deliveryDistance <= 20) {
            System.out.println("1 день срок доставки");
        }
        if (deliveryDistance >= 40 && deliveryDistance <= 60) {
            System.out.println(dayDelivery * 2 + "" +
                    "дня срок доставки");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println(dayDelivery * 3 + " дня срок доставки");
        }
        System.out.println();

        return dayDelivery;
    }


    public static void main(String[] args) {


        //Задание 1.
        System.out.println("Задание 1");
        int year = 2000;
        checkingTheYear(year);

        //Задание 2.
        System.out.println();
        System.out.println("Задание 2.");

        int operatingSystemType = 1;
        int deviceAge = 2022;
        applicationCompatibilityCheck(operatingSystemType, deviceAge);

        //Задание 3.
        System.out.println();
        System.out.println("Задание 3.");

        int deliveryDistance = 95;
        deliveryDistance(deliveryDistance);


    }


}