package lesson_5.HW5;

/*
Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */
public class Task03 {
    public static void main(String[] args) {

    }

    //public static void
    public void heapSort(int arr[]) // 2 этап) сделать из кучи отсортированный массив
    {
        int n = arr.length;

        // Build heap (переставить массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлечь элемент из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Переместить текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // вызвать max heapify для уменьшенной кучи
            heapify(arr, i, 0);
        }
    }

    // Чтобы увеличить поддерево с корнем узла i, которое
    // индекс в arr[]. n - размер кучи
    void heapify(int arr[], int n, int i) // 1 этап) сделать из массива макс кучу(heapify-Окучить)
    {
        int largest = i; // Инициализировать корень как root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // Если левый дочерний элемент больше, чем корень
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый ребенок больше, чем самый большой на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Если самый большой не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно увеличить затронутое поддерево
            heapify(arr, n, largest);
        }
    }

}
