package coach_academy_course.week3;

    import java.util.Scanner;

    public class B_BeautifulDaysAtTheMovies {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int counter = 0;

            for (int l = i; l <= j; l++) {
                if (getReverseDifference(l) % k == 0) {
                    counter++;
                }
            }
            System.out.println(counter);
        }

        private static int getReverseDifference(int i) {
            String reversedIntString = new StringBuilder(Integer.toString(i)).reverse().toString() ;
            return Integer.parseInt(reversedIntString) - i;
        }
    }
