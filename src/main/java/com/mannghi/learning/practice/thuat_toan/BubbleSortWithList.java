package com.mannghi.learning.practice.thuat_toan;

/**
 * @author ManNghi
 * @since 25/11/2024 - 19:01
 */
import java.util.ArrayList;
import java.util.List;

    public class BubbleSortWithList {

        // Hàm thực hiện thuật toán Bubble Sort trên List
        public static void bubbleSort(List<Integer> list) {
            int n = list.size();
            boolean swapped;

            // Duyệt qua tất cả các phần tử trong List
            for (int i = 0; i < n - 1; i++) {
                swapped = false;

                // So sánh từng cặp phần tử kề nhau
                for (int j = 0; j < n - i - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        // Hoán đổi hai phần tử
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                        swapped = true;
                    }
                }

                // Nếu không có sự hoán đổi nào, mảng đã được sắp xếp
                if (!swapped) break;
            }
        }

        // Hàm in List
        public static void printList(List<Integer> list) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Hàm main
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(64);
            list.add(34);
            list.add(25);
            list.add(12);
            list.add(22);
            list.add(11);
            list.add(90);

            System.out.println("Danh sách ban đầu:");
            printList(list);

            bubbleSort(list);

            System.out.println("Danh sách sau khi sắp xếp:");
            printList(list);
        }
    }


