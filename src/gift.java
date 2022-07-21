public class gift {
    public static void main(String[] args) {
        int initial = 100; //начальная сумма на счете клиента
        int transfer = 1100; //сумма пополнения счета
        int r = 100; // количество рублей пополнения, за которые начисляется 1 рубль от сотового оператора
        int gift = 0; // количество бонусов
        int sum; // итоговая сумма


        if (transfer > 1000) {
            gift = transfer / r;

        } else {
            gift = 0;
        }
        System.out.println(sum = initial + transfer + gift);
    }
}
