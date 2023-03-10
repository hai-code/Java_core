package Ex1;

public class GenericEx1 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 6, 5, 4, 7, 8};
        Double[] interestRate = {0.25, 1.5, 6.35, 4.75, 5.5};
        Student[] students = new Student[3];
        students[0] = new Student("S1", "Tran Van Hung", 3.25f);
        students[1] = new Student("S2", "Nguyen Tran Duy", 2.59f);
        students[2] = new Student("S3", "Hoang Xuan Quynh", 3.54f);

        // hiển thị danh sách các phần tử

        System.out.println("Mảng số nguyên: ");
        showArrayElement(numbers);
        System.out.println("Mảng số thực: ");
        showArrayElement(interestRate);
        System.out.println("Danh sách sinh viên: ");
        showArrayElement(students);
    }

    public static <T> void showArrayElement(T[] arr){
        for (var element: arr
             ) {
            System.out.println(element);
        }
    }
}
