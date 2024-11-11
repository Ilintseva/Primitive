public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676; // Укажите стоимость билета в рублях
        int milesPerRubles = 20; // Коэффициент начисления миль
        int bonusMiles = ticketPrice / milesPerRubles; // Расчёт количества миль
        System.out.println("Начислено бонусных миль: " + bonusMiles); // Вывод результата
    }
}