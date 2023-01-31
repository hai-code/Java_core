package Ex4;

import Ex4.Comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice = 0;
        var input = new Scanner(System.in);
        var smartphones = new ArrayList<SmartPhone>();
        do {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Thêm 1 smartphone vào danh sách");
            System.out.println("2. Sắp xếp smartphone theo tên hãng a-z");
            System.out.println("3. Sắp xếp smartphone theo giá bán giảm dần");
            System.out.println("4. Sắp xếp smartphone theo giá bán tăng dần");
            System.out.println("5. Sắp xếp smartphone theo năm sản xuất cũ->mới");
            System.out.println("6. Sắp xếp smartphone theo năm sản xuất mới->cũ");
            System.out.println("7. Hiển thị danh sách smartphone ra màn hình");
            System.out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            
            switch (choice){
                case 0:
                    showMessage("Cảm ơn bạn đã sử dụng dịch vụ!");
                    break;
                case 1:
                    SmartPhone smartPhone = createSmartPhone(input);
                    if (smartPhone != null){
                        smartphones.add(smartPhone);
                    }else {
                        showMessage("Tạo thông tin smartphone thất bại");
                    }
                    break;
                case 2:
                    if (smartphones.size() > 0){
                        Collections.sort(smartphones,new SortByBrandASC());
                        showSmartPhones(smartphones);
                    }else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 3:
                    if (smartphones.size() > 0) {
                        Collections.sort(smartphones, new SortByPriceDESC());
                        showSmartPhones(smartphones);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 4:
                    if (smartphones.size() > 0) {
                        Collections.sort(smartphones, new SortByPriceASC());
                        showSmartPhones(smartphones);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;

                case 5:
                    if (smartphones.size() > 0) {
                        Collections.sort(smartphones, new SortByYearASC());
                        showSmartPhones(smartphones);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;

                case 6:
                    if (smartphones.size() > 0) {
                        Collections.sort(smartphones, new SortByYearDESC());
                        showSmartPhones(smartphones);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;

                case 7:
                    if (smartphones.size() > 0) {
                        showSmartPhones(smartphones);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                default:
                    showMessage("Sai chức năng, vui lòng chọn lại!");
                    break;

            }
        }while (choice != 0);
    }

    private static void showSmartPhones(ArrayList<SmartPhone> smartphones) {
        System.out.printf("%-20s%-20s%-20s%-15s%-15s%-15s\n",
                "Mã thiết bị", "Hãng sản xuất", "Tên thiết bị",
                "Giá bán", "Năm sản xuất", "Màn hình");
        for (var smartphone : smartphones) {
            System.out.printf("%-20s%-20s%-20s%-15.2f%-15d%-15s\n",
                    smartphone.getId(), smartphone.getBrand(),
                    smartphone.getName(), smartphone.getPrice(),
                    smartphone.getYear(), smartphone.getScreenSize());
        }
    }

    private static SmartPhone createSmartPhone(Scanner input) {
        System.out.println("Mã thiết bị: ");
        var id = input.nextLine();
        System.out.println("Hãng sản xuất: ");
        var brand = input.nextLine();
        System.out.println("Tên thiết bị: ");
        var name = input.nextLine();
        System.out.println("Giá bán: ");
        var price = Float.parseFloat(input.nextLine());
        System.out.println("Năm sản xuất: ");
        var year = Integer.parseInt(input.nextLine());
        System.out.println("Kích thước màn hình: ");
        var screenSize = input.nextLine();
        try {
            return new SmartPhone(id,brand,name,price,year,screenSize);
        } catch (InvalidBrandException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void showMessage(String s) {
        System.out.println("==> " + s + " <==");
    }
}
