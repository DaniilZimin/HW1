package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        byte a = 1;
        short b = 15;
        int c = 255;
        long d = 123456L;
        float f = 5.7F;
        double e = 12.35;

        //Задание 2
        float weightOfFirstBoxer = 78.2F;
        float weightOfSecondBoxer = 82.7F;
        float totalWeight = weightOfFirstBoxer + weightOfSecondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        float weightDifference = weightOfSecondBoxer - weightOfFirstBoxer;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");

        //Задание 3
        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;


        float breakfastWeight = weightBanana * 5 + weightMilk * 2 + weightIceCream * 2 + weightEgg * 4;
        float breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("Вес готового спорт-завтрака " + breakfastWeightKg + " кг");

        //Задание 4
        int weightLossGoal = 7000;
        int daysForWeightLoss250 = weightLossGoal/250;
        int daysForWeightLoss500 = weightLossGoal/500;
        int daysForWeightLossAvg = (daysForWeightLoss250 + daysForWeightLoss500) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, для похудения ему понадобится " + daysForWeightLoss250 + " дней" );
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, для похудения ему понадобится " + daysForWeightLoss500 + " дней" );
        System.out.println("В среднем для похудения, спортсмену понадобится " + daysForWeightLossAvg + " дней");

        //Задание 5
        int year = 12;
        float salaryIncrease = 1.1F;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float newSalaryMasha = salaryMasha * salaryIncrease;
        float newSalaryDenis = salaryDenis * salaryIncrease;
        float newSalaryKristina = salaryKristina * salaryIncrease;
        float salaryDifferenceMasha = (newSalaryMasha - salaryMasha) * year;
        float salaryDifferenceDenis = (newSalaryDenis - salaryDenis) * year;
        float salaryDifferenceKristina = (newSalaryKristina - salaryKristina) * year;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей в год");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей в год");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей в год");
    }
}
