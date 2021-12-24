package ru.skypro;

public class Main {

    public static void main(String[] args) {
	byte a = 1;
    short b = 30000;
    int c = -1967;
    long d = 98776213L;
    float e = 9.076f;
    double f = -3.42985;

    double firstWeight = 78.2;
    double secondWeight = 82.7;
    double totalWeight = firstWeight + secondWeight;
    var diffWeight = secondWeight - firstWeight;
    System.out.println("Общий вес боксеров равен: " + totalWeight + " кг");
    System.out.println("Разница в весе боксеров составляет: " + diffWeight + " кг");

    int bananMass = 80;
    int molokoMass = 105;
    int icecreamMass = 100;
    int eggMass = 70;
    int allMass = bananMass*5 + molokoMass*2 + icecreamMass*2 + eggMass*4;
    float kgMass = allMass/1000F;
    System.out.println("Вес завтрака в граммах: " + allMass);
    System.out.println("Вес завтрака в кг: " + kgMass + " кг");

    int goal = 7000;
    int lose1 = 250;
    int lose2 = 500;
    int time1 = goal/lose1;
    int time2 = goal/lose2;
    int average = (time1 +time2)/2;
    System.out.println("Дней при первом способе похудения: "+ time1);
    System.out.println("Дней при втором способе похудения: "+ time2);
    System.out.println("Потребуется в среднем дней: " + average);

    int zpMasha = 67760;
    int zpDenis = 83690;
    int zpKristina = 76230;
    var zpMashaNew = zpMasha*1.1;
    var zpDenisNew = zpDenis*1.1;
    var zpKristinaNew = zpKristina*1.1;

    var diffMasha = (zpMashaNew - zpMasha)*12;
    double diffDenis = (zpDenisNew - zpDenis)*12;
    double diffKristina = (zpKristinaNew - zpKristina)*12;
    System.out.println("Новый доход Маши в рублях: " + zpMashaNew + ". Рост дохода в рублях за год: " + diffMasha);
    System.out.println("Новый доход Дениса в рублях: " + zpDenisNew + ". Рост дохода в рублях за год: " + diffDenis);
    System.out.println("Новый доход Кристины в рублях: " + zpKristinaNew + ". Рост дохода в рублях за год: " + diffKristina);




    }
}
