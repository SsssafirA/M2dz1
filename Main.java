public class Main {
    public static void main(String[] args) {
        float coat = 70; //пальто
        byte coatDiscount = 77; //скидка
        float hat = 25; //пальто
        byte hatDiscount = 37; //скидка
        float businessSuit = 53; //пальто
        byte businessSuitDiscount = 44; //скидка
        float chirt = 19; //пальто
        byte chirtDiscount = 0; //скидка
        float shoes = 41; //пальто
        byte shoesDiscount = 32;

        float account = 312;

        float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount) + businessSuit * (100 - businessSuitDiscount) +
                + chirt * (100 - chirtDiscount) + shoes * (100 - shoesDiscount)) / 100;

        if (count < account) System.out.println("Денег достаточно");
        else System.out.println("Денег недостаточно");
    }
}