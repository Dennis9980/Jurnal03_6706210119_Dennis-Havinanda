package Mingguke3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SinglyLinked<Pojo> linkedList = new SinglyLinked<>();
        Scanner input = new Scanner(System.in);
        boolean status = true;
        while (status){
            System.out.println("Pilihlah Menu :"
                    + "\n 1. Add Data"
                    + "\n 2. Remove Data"
                    + "\n 3. Cetak Data"
                    + "\n 4. Program Exit");
            System.out.print("Pilih menu [1-4] : ");
            int indexMenu = input.nextInt();
            switch (indexMenu) {
                case 1:
                    input(linkedList);
                    break;
                case 2:
                    remove(linkedList);
                    break;
                case 3:
                    linkedList.print();
                    break;
                case 4:
                    return;
            }
            System.out.print("apakah ingin melanjutkan (iya / tidak)? ");
            String pilihan = input.next();
            if (pilihan.equalsIgnoreCase("iya")){
                status = true;
            }else if(pilihan.equalsIgnoreCase("tidak")){
                status = false;
            }else {
                System.err.println("Salah pilih");
            }
        }
    }
    private static void input (SinglyLinked<Pojo> masuk){
        System.out.println("Pilihlah Menu :"
                + "\n 1. Awal Data"
                + "\n 2. Akhir Data");
        System.out.print("Pilih menu [1-2] : ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.println("Silahkan memasukkan data");
        System.out.print("NIP : ");
        String nip = input.next();
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Divisi : ");
        String divisi = input.next();
        if (pilihan == 1){
            masuk.insertAtFront(new Pojo(nip, nama, divisi));
        }else if (pilihan == 2){
            masuk.insertAtBack(new Pojo(nip, nama, divisi));
        }else {
            System.err.println("Salah pilih");
        }
    }
    private static void remove(SinglyLinked<Pojo> keluar){
        System.out.println("Pilihlah Menu :"
                + "\n 1. Awal Data"
                + "\n 2. Akhir Data");
        System.out.print("Pilih menu [1-2] : ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        if (pilihan == 1){
            keluar.removeFromFornt();
        }else if (pilihan == 2){
            keluar.removeFromBack();
        }else {
            System.err.println("Salah pilih");
        }
    }
}
