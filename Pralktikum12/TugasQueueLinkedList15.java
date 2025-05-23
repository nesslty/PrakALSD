package Pralktikum12;

public class TugasQueueLinkedList15 {
    TugasNode15 front;
    TugasNode15 rear;
    int size = 0;

    public TugasQueueLinkedList15() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue (TugasMahasiswa15 tugasmhs) {
        TugasNode15 nodeBaru = new TugasNode15(tugasmhs, front);
        if (isEmpty()) {
            front = rear = nodeBaru;
        } else {
            rear.next = nodeBaru;
            rear = nodeBaru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan dalam antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong,tidak dapat memanggil");
        } else {
            System.out.println("memanggil mahasiswa: ");
            front.data.tampilInformasi();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void tampilData() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("DAFTAR MAHASISWA DALAM ANTRIAN: ");
            TugasNode15 temp = front;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    public void peekTerdepan() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekTerakhir() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    } 

    public int jumlahMahasiswa() {
        return size;
    }
}
