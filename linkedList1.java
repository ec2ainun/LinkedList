/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author ec2ainun
 */

class Node {
    int data;
    //variable data dibuat untuk nyimpen data
    Node next;
    //variable next bertipe Node 
    //yang nantinya (di algoritma) dibuat untuk nge refer ke node selanjutnya
}

//linkedList1 dibawah ini itu cuma nama class
//aku disini mau buat algoritma tentang SingleLinkedList
//SingleLinkedList itu konsepnya ada Pointer

public class linkedList1 {
    
    //pointer bertipe Data Node
    //inget Tipe data Node punya variable data dan next
    private Node pointer;
    
    public linkedList1() {
        pointer = null;
        //inissialisasi awal pointer dibuat null
    }
    
    // membuat node baru
    public void buatNode(int dt) {
        //ada masukan int dt
        Node nodeBaru = new Node();
        //buat variable baru nodeBaru bertipe Node
        nodeBaru.data = dt;
        //nahh kyk yg diatas, tipe data Node ada variabel data dan next
        //trus line diatas datanya disisi dengan variable dt
        nodeBaru.next = pointer;
        //nah variable next di isialisasi dengan variable pointer
        
        pointer = nodeBaru;
        //trus pointer
        //di sini pointer itu nge refer ke variable yang dipunyai class linkedList1
        //nah truss pointer diisi dengan variable nodeBaru
        //baca lagi deh diatas apa itu nodeBaru
    }

    // menambah variable data dt1 SETELAH data dt2 dalam KELAS linkedList1
    //klo kalian paham dengan penjelasku 
    //comment-comment diatas
    //dan paham logic nya
    //kalian pasti paham codingan dibawah dan seterusnya
    public boolean sisip(int dt1, int dt2) {
        Node n = pointer;
        while ((n != null) && (n.data != dt2)) {
            n = n.next;
        }
        if (n == null) {
            return false;
        }
        Node nn = new Node();
        nn.data = dt1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }

    // secara normal data dihapus di depan
    public int hapusDiDepan() {
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }

    //sisip data di Akhir
    public void sisipDataDiAkhir(int data) {
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.data = data;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }

    public void sisipDataUrut(int data) {
        //lengkapi bagian ini sisipDataUrut
        //yang bisa kirim ke email ku : m.ec2.a.najib@gmail.com
        //+10 buat Single dan double Linked List
        //buat 5 orang pertama yang ngirim
        
    }

    public void hapusData(int dataHapus) {
        //udah dibuat sama WAHID MIFTAHUL A`MAL waktu praktikum kemaren
    }

    public Node getPointer() {
        return pointer;
    }

    public static linkedList1 gabung(linkedList1 L1,
            linkedList1 L2) {
        //lengkapi bagian ini sisipDataUrut
        //yang bisa kirim ke email ku : m.ec2.a.najib@gmail.com
        //+10 buat Single dan double Linked List
        //buat 5 orang pertama yang ngirim
        linkedList1 test = new linkedList1();
        return test;
    }

    // cetak data
    public void cetak(String kom) {
        System.out.println(kom);
        Node n = pointer;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
    }
}
