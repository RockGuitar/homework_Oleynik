package ru.skypro;
public class Main {
    public static void main ( String[] args ) {
        byte byteVar = 1;
        short shortVar = 30000;
        int intVar = -1967;
        long longVar = 98776213L;
        float floatVar = 9.076f;
        double doubleVar = -3.42985;

        double firstWeight = 78.2;
        double secondWeight = 82.7;
        double totalWeight = firstWeight + secondWeight;
        var diffWeight = secondWeight - firstWeight;
        System.out.println("Общий вес боксеров равен: " + totalWeight + " кг");
        System.out.println("Разница в весе боксеров составляет: " + diffWeight + " кг");

        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int bananaAmount = 5;
        int milkAmount = 2;
        int iceCreamAmount = 2;
        int eggAmount = 4;
        int allWeight = bananaWeight * bananaAmount + milkWeight * milkAmount + iceCreamWeight * iceCreamAmount + eggWeight * eggAmount;
        float kgWeight = allWeight / 1000F;
        System.out.println("Вес завтрака в граммах: " + allWeight);
        System.out.println("Вес завтрака в кг: " + kgWeight + " кг");

        int goal = 7000;
        int lossOne = 250;
        int lossTwo = 500;
        int timeOne = goal / lossOne;
        int timeTwo = goal / lossTwo;
        int average = (timeOne + timeTwo) / 2;
        System.out.println("Дней при первом способе похудения: " + timeOne);
        System.out.println("Дней при втором способе похудения: " + timeTwo);
        System.out.println("Потребуется в среднем дней: " + average);

        int payMasha = 67760;
        int payDenis = 83690;
        int payKristina = 76230;
        var payMashaNew = payMasha * 1.1;
        var payDenisNew = payDenis * 1.1;
        var payKristinaNew = payKristina * 1.1;

        var diffMasha = (payMashaNew - payMasha) * 12;
        double diffDenis = (payDenisNew - payDenis) * 12;
        double diffKristina = (payKristinaNew - payKristina) * 12;
        System.out.println("Новый доход Маши в рублях: " + payMashaNew + ". Рост дохода в рублях за год: " + diffMasha);
        System.out.println("Новый доход Дениса в рублях: " + payDenisNew + ". Рост дохода в рублях за год: " + diffDenis);
        System.out.println("Новый доход Кристины в рублях: " + payKristinaNew + ". Рост дохода в рублях за год: " + diffKristina);
    }
}
