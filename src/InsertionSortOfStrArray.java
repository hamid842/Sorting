public class InsertionSortOfStrArray {
    public static void main(String[] args) {
        String[] a = {"hamid", "sara", "avina", "tarlan", "sonia"};
        String temp = "";
        int j;
        for (int i = 0; i < a.length; i++) {
            j = i;
            temp = a[i];
            while (j > 0 && a[j - 1] .compareTo(temp)>0 ) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " , ");
        }
    }
}
