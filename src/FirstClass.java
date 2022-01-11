public class FirstClass {

    int[] sorted = new int[8];

    public static void main(String[] args) {
        int[] array = {7,6,5,8,3,5,9,1};

        mergesort(array, 0, 7);
        for(int i =0; i<8;i++) {
            System.out.println(array[i]);
        }
    }
    public static void mergesort(int[] array, int m, int n) {
        if(m < n) {
            int middle = (m+n) / 2;
            mergesort(array,m,middle);
            mergesort(array,middle+1,n);
            merge(array,m,middle,n);
        }
    }
    public static void merge(int[] array, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = n;

        // 작은 순서대로 배열에 삽입
        while (i <= middle && j <=n) {
            if(array[i] <= array[j]) {
                sorted[k] = array[i];
                i++;
            }else {
                sorted[k] = array[j];
                j++;
            }
            k++;
        }
        // 남은 데이터도 삽입
        if(i>middle) {
            for(int t = j; t<=n;t++) {
                sorted[k] = array[t];
                k++;
            }
        }else {
            for(int t = i; t<=middle;t++) {
                sorted[k] = array[t];
                k++;
            }
        }
        // 정렬된 배열을 삽입
        for (int t = m; t <=n; t++) {
            array[t] = sorted[t];
        }
    }
}