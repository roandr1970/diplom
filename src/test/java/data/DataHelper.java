package data;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.Year;
import java.util.Locale;

public class DataHelper {
    private DataHelper() {
    }

    public static Faker faker = new Faker(new Locale("en"));

    @Value
    @RequiredArgsConstructor
    public static class CardInfo {
        private String cardNumber;
        private String month;
        private String year;
        private String owner;
        private String cardCVC;


        //    Заполнение поля Номер карты
        public static String getApprovedCardNumber() {
            return ("1111 2222 3333 4444");
        }

        public static String getDeclinedCardNumber() {
            return ("5555 6666 7777 8888");
        }

        public static String getUnknownCardNumber() {
            return ("5555 6666 7777 9999");
        }

        public static String getShortCardNumber() {
            return ("5555 6666 7777");
        }

        public static String getCardNumberWithSigns() {
            return ("5555 6666 7777 ****");
        }

        public static String getCardNumberWithLetters() {
            return ("5555 6666 7777 abcd");
        }

        //    Заполнение поля Месяц
        public static String getValidMonth() {
            LocalDate localDate = LocalDate.now();
            return String.format("%02d", localDate.getMonthValue());
        }

        public static String getMonthOver12() {
            return ("13");
        }

        public static String getMonthWithLetters() {
            return ("ab");
        }

        public static String getMonthWithSigns() { return ("#*"); }

        public static String getMonthWithOneDigit() {
            return ("1");
        }

        public static String getMonthWithNulls() {
            return ("00");
        }

        //    Заполнение поля Год
        public static String getValidYear() {
            return String.format("%ty", Year.now());
        }

        public static String getPastYear() {
            LocalDate localDate = LocalDate.now();
            return String.format("y", localDate.minusYears(2));
        }

        public static String getYearWithLetters() {
            return ("aw");
        }

        public static String getYearWithSigns() {
            return ("&&");
        }

        public static String getYearWithOneDigit() {
            return ("9");
        }

        //    Заполнение поля Владелец
        public static String getOwnerName() {
            return faker.name().fullName();
        }

        public static String getOwnerFirstName() {
            return faker.name().firstName();
        }

        public static String getOwnerNameInRussia() {
            Faker faker = new Faker(new Locale("ru"));
            return faker.name().fullName();
        }

        public static String getOwnerNameWithDigits() {
            return "2579 Petr";
        }

        public static String getOwnerNameWithSigns() {
            return "#### Ivan";
        }

        public static String getOwnerNameLong() {
            return "Ввататататататататататататататататататата Мумумумумумумумумумумумумумумумумумумумумумумумумуму";
        }

        public static String getOwnerNameShort() {
            return "W";
        }

        public static String getOwnerNameWithDoubleName() {
            return "Petr Ivanov-Petrov";
        }

        //    Заполнение поля CVC
        public static String getCVC() {
            return "234";
        }

        public static String getCVCwithLetters() {
            return "abc";
        }

        public static String getCVCwithSigns() {
            return "2*4";
        }

        public static String getCVCshort() {
            return "2";
        }
    }
}
