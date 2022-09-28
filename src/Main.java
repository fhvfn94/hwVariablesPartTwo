public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task2() {
        byte aByte = 67;
        long aLong = 987678965549l;
        short aShort = 569;
        short bShort = -159;
        short cShort = 27897;
        double aDouble = 27.12;
        double bDouble = 2.786;
        boolean aBoolean = false;
        System.out.println(aByte);
        System.out.println(aLong);
        System.out.println(aShort);
        System.out.println(bShort);
        System.out.println(cShort);
        System.out.println(aDouble);
        System.out.println(bDouble);
        System.out.println(aBoolean);
    }
    public static void task3(){
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short allPapers = 480;
        int everyBody = allPapers / (lp + as + ea);
        System.out.println(everyBody);
    }
    public static void task4(){
        byte machine = 16;
        byte timeForOnePart = 2;
        int first = 20 / timeForOnePart * machine;
        System.out.println("За 20 минут машина произвела бутылок " + first + " штук");
        int second = 24 * 60 / timeForOnePart * machine;
        System.out.println("За сутки машина произвела бутылок " + second + " штук");
        int third = 12 * 3 * 60 / timeForOnePart * machine;
        System.out.println("За 3 дня машина произвела бутылок " + third + " штук");
        int fourth = 12 * 30 * 60 / timeForOnePart * machine;
        System.out.println("За месяц машина произвела бутылок " + fourth + " штук");
    }
    public static void task5(){
        byte allJar = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int grades = allJar / (whiteColor + brownColor);
        int white = grades * whiteColor;
        int brown = grades * brownColor;
        System.out.println("В школе, где " + grades + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }
    public static void task6(){
        byte bananas = 5;
        short milk = 200;
        byte icecream = 2;
        byte eggs = 4;
        int mix = bananas * 80 + milk * 105 + icecream * 100 + eggs * 70;
        System.out.println(mix);
        int mlToKg = mix / 1000;
        System.out.println(mlToKg);
    }
    public static void task7(){
        short weight = 7 * 1000;
        short one = 250;
        short two = 500;
        int firstPlane = weight / one;
        System.out.println(firstPlane);
        int secondPlane = weight / two;
        System.out.println(secondPlane);
    }
    public static void task8(){
        int Masha = 67760;
        int Denis = 83690;
        int Khris = 76230;
        int upMasha = Masha + (Masha / 100 * 10);
        int upDenis = Denis + (Denis / 100 * 10);
        int upKhris = Khris + (Khris / 100 * 10);
        int rMasha = upMasha *12 - Masha * 12;
        int rDenis = upDenis *12 - Denis * 12;
        int rKhris = upKhris *12 - Khris *12;
        System.out.println("Маша теперь получает " + upMasha + " рублей. Годовой доход вырос на " + rMasha +" рублей");
        System.out.println("Маша теперь получает " + upDenis + " рублей. Годовой доход вырос на " + rDenis +" рублей");
        System.out.println("Маша теперь получает " + upKhris + " рублей. Годовой доход вырос на " + rKhris +" рублей");
    }
}