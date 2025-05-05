package Latihan;

public class Stacksurat01 {
    surat01[] stack;
    int top;
    int size;

    public Stacksurat01(int size) {
        this.size = size;
        stack = new surat01[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(surat01 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public surat01 pop() {
        if (!isEmpty()) {
            surat01 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public surat01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    public boolean cariSurat(String namaMahasisw){
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasisw)) {
                System.out.println("Surat ditemukan: ");
                stack[i].tampilkanData();
                return true; 
            }
        }
        System.out.println("Surat atas nama "+ namaMahasisw+ " tidak ditemukan!");
        return false;
    }
}
