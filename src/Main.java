public class Main {
    public static void main(String[] args) {
        int price = 12_775;
        int exchangeMiles = 20;

        int bonusMiles = price / exchangeMiles;

        System.out.println("Цена билета: " + price + " рублей");
        System.out.println("Одна миля начисляется за " + exchangeMiles + " рублей");
        System.out.println("Количество начисленных миль: " + bonusMiles);
    }
}