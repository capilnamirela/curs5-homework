public class ExercitiuNet {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 4;
        int lung = numbers.length;
        int[] result = new int[lung - n + 1];

        for (int index = 0; index <= (lung - n); index++) {
            result[index]=0;
             for (int i = 0; i < n; i++) {
                result[index] = result[index] + numbers[index+i];
            }
        }
        for (int i : result) {
            System.out.println(i);
        }
    }

}
