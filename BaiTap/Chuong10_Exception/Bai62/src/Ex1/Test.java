package Ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập tên của mèo: ");
        var name = input.nextLine();
        var myCat = new Cat(name);
        System.out.println("Nhập tuổi của mèo: ");
        var ageStr = input.nextLine().trim();
        var age = Integer.parseInt(ageStr);
        try {
            myCat.setAge(age);
        } catch (InvalidAgeExcepTion e) {
            e.printStackTrace();
            System.out.println("Tuổi hợp lệ phải từ 0 - 50.");
        }
        showPetInfo(myCat);
    }

    private static void showPetInfo(Cat myCat) {
        System.out.println("========Infor Of Cat========");
        System.out.println("Pet name; " + myCat.getPetName());
        System.out.println("Age: " + myCat.getAge());
    }
}
