
#### Nama	: Vega Anggaresta
#### NIM    : 2041723013
#### Kelas	: TI-2C

## Laporan Tugas Praktikum Pertemuan-7 (Inheritence)

### B. Pertanyaan  Percobaan 1
1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!
* Superclass adalah Karyawan
* Subclass adalah Manager dan Staff

2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?
* Untuk menurunkan class kita menggunakan extends
* format penggunaannya adalah, subClass(childClass) extends superClass(parentsClass)

3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class
tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!
* Atribut yang dimiliki oleh class Manager : tunjangan
* Atribut yang diwarisi dari class Karyawan : nama, alamat, jk, umur, gaji

4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class
Manager!
* Kata kunci super digunakan untuk memanggil atribut gaji pada super class (Karyawan)

5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan
alasannya!
* Termasuk inheritance Hierarchical karena class tersebut memiliki beberapa subclass(childClass) atau dengan kata lain jika beberapa subclass memiiliki superclass yang sama. Pada percobaan 1, class Karyawan memiliki 2 sub class yaitu Manager dan Staff. itu berarti atribut dan method yang terdaoat pada class Manager dapat diturukan/digunakan oleh sub class (Manager dan Staff)

### Pertanyaan Percobaan 2

1. Berdasarkan class diatas manakah yang termasuk single inheritance
dan mana yang termasuk multilevel inheritance?
* Single: Karyawan-Manager
* Multilevel: Karyawan-Staff-StaffTetap, Karyawan-Staff-StaffHarian

2. Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang
dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class
Staff!
a. Atribut class StaffTetap : golongan, asuransi
b. Atribut class StaffHarian : jmlJamKerja
c. Atribut yang diwarisi dari class Staff : lembur dan potongan. Karena class Staff diwarisi dari class Karyawan, maka ada atribut yang diwarisi dari class karyawan juga, diantaranya yaitu : nama, alamat, jk, umur, gaji

3. Apakah fungsi potongan program berikut pada class StaffHarian
<img src="img/percobaan2-no3.png">
* Fungsinya untuk memanggil konstruktor berparameter dari class Staff

4. Apakah fungsi potongan program berikut pada class StaffHarian
<img src="img/percobaan2-no4.png">
* Fungsinya untuk memanggil method tampilDataStaff() dari class Staff

5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap
<img src="img/percobaan2-no5.png">
Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses
langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji,
lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur,
dan potongan?
* Karena pada class StaffTetap telah di extends class Staff sehingga atribut Gaji, Lembur dan potongan pada class Staff dapat di akses oleh class StaffTetap

## Tugas
1. Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini.
Kemudian buatlah instansiasi objek untuk menampilkan data pada class Mac, Windows dan
Pc!.
* <img src="img/soal Tugas.png">
* <img src="img/tugas.png">