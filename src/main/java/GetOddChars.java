public class GetOddChars {

        //Написать метод, который принимает строку и возвращает строку,
        // которая состоит только из букв на нечетных индексах (для построения новой строки использовать метод concat() или просто +):
        //
        //Test Data:
        //“QAForEveryone” -> “AoEeyn”
        //“JavaLessonsAreFun” -> “aaesnAeu”

        public static String getOddChars (String str) {
            String result = "";

            for (int i = 1; i < str.length() - 1; i += 2) {
                result += str.charAt(i);
            }

            return result;
        }
}

