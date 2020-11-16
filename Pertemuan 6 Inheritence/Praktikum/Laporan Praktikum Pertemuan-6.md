
#### Nama	: Vega Anggaresta
#### NIM    : 2041723013
#### Kelas	: TI-2C

## Laporan Tugas Praktikum Pertemuan-6

A. Percobaan 1 Extends
1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga
program tersebut bisa dijalankan dan tidak error!
* Menambahkan extends ClassA dan menambah super di pemanaggilan atribut
<img src="img/Praktikum1-1.png">
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
* Itu karena pada classB program tidak ada penginisialisasian atribut x dan y, sehingga java tidak dapat membaca nya.

B. Percobaan 2 Hak Akses
1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga
program tersebut bisa dijalankan dan tidak error!
* Menambahkan Getter untuk atribut X dan Y. Serta menambahkan super pada pemaggilan method di classB
<img src="img/Praktikum2-1.png">
<img src="img/Praktikum2-1-1.png">

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
* Terdapat error karena pada ClassA tidak terdapat nilai return. Serta pada classB tidak adanya extends ke kelas Parent, sehingga variabel X dan Y tidak dapat dibaca java. Untuk mengatasinya kita menambahkan extends dan menambahkan super

C. Percobaan 3 (Super)
1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!
* Untuk mengakses atribut dari parent class (class Bangun)
2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!
* Super digunakan untuk mengakses atribut phi dan r dari parent class/(class Bangun)
* this digunakan untuk mengakses atribut t dari class itu sendiri (class Tabung)
3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class
tersebut dapat mengakses atribut tersebut!
* Itu terjadi karena class Tabung memiliki atribut turunan dari class Bangun (extends). Dimana class Bangun terdapat atribut phi dan r yang sudah di inisialisasikan.

D. Percobaan 4 (SuperConstrictor)
1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian
jelaskan alasannya!
* classA merupakan Superclass dari classB karena pada classB meng-extends classA. sehingga memposisikan classB merupakan subclass dari classA
* classB merupakan superclass dari classC karena pada classC meng-extends classA. Sehingga disini classC merupakan subclass dari classB
2. Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan
kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!
* Terlihat tidak ada perbedaan dari hasil outputnya
3. Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!
* Proses jalannya adalah classC memanggil classB, kemudian classB memanggil classA yang merupakan parent class. Sehingga output yang dihasilkan adalah, classA -> classB -> classC
4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!
* Berfungsi untuk merujuk/memanggil konstruktor superclass

E. Tugas
1. Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini.
Kemudian buatlah instansiasi objek untuk menampilkan data nama pegawai dan gaji yang
didapatkannya.
<img src="img/soal.png">
* ClassPegawai
<img src="img/pegawai.png">
* ClassDosen
<img src="img/Dosen.png">
* ClassDaftarGaji
<img src="img/DaftarGaji.png">
* ClassMain

<img src="img/Main.png">