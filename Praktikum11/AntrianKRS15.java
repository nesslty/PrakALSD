package Praktikum11;

public class AntrianKRS15 {

    MahasiswaNew15[] data;
    int front;
    int rear;
    int size;
    int max;
    int proses;
    int maxproses = 30;


    public AntrianKRS15 (int max) {
        this.max = max;
        this.data = new MahasiswaNew15[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.proses = 0;
    }

    public boolean IsEmpty () {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(MahasiswaNew15 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
    }

    public void dequeue() {
        if (size < 2) {
            System.out.println("Antrian tidak mencukupi untuk 2 mahasiswa");
            return;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("sedang memproses");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            proses++;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling depan");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian sedang kosong");
        }
    }

    public void peek2() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup 2 mahasiswa");
        } else {
            System.out.println("2 antrian paling depan: ");
            data[front].tampilkanData();
            int indeks = (front + 1) % max;
            data[indeks].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (!IsEmpty()) {
        System.out.println("Antrian Paling Belakang:");
        data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi Antrian:");
            int i = front;
            while (true) {
                data[i].tampilkanData();
                if (i == rear) break;
                i = (i + 1) % max;
            }
        }
    }

        public void clear() {
        front = rear = -1;
        size = 0;
        proses = 0;
    }

    public int jumlah() {
        return size;
    }

    public int jumlahProses() {
        return proses * 2;
    }

    public int sisa() {
        return 30 - jumlahProses();
    }
}

