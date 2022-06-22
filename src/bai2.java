import java.util.Scanner;

public class bai2 {
    public static void main(String[] args)
    {
        float soDien, total;
        Scanner scanner = new Scanner(System.in);

        int donGia1 = 1000, donGia2 = 1250, donGia3 = 1800, donGia4 = 2500;
        System.out.println("hello");
        do {
            System.out.print("Nhap so dien trong 1 thang: ");
            sodien = scanner.nextFloat();
            if(sodien < 0)
            {
                System.out.println("So dien khong hop le, vui long nhap lai!");
            }
        }while(soDien < 0);
        if(soDien <= 25)
        {
            total = soDien * donGia1;
            System.out.println("Tien dien phai tra la: " + total);
        }
        else if (soDien <= 75) {
            total = 25 * donGia1 + (soDien - 25) * donGia2;
            System.out.println("Tien dien phai tra la: " + total);
        }
        else if (soDien <= 150){
            total = 25 * donGia1 + 50 * donGia2 + (soDien - 75) * donGia3;
            System.out.println("Tien dien phai tra la: " + total);
        }
        else if (soDien > 150){
            total = 25 * donGia1 + 50 * donGia2 + 75 * donGia3 + (soDien - 150) * donGia4;
            System.out.println("Tien dien phai tra la: " + total);
        }
    }
}
