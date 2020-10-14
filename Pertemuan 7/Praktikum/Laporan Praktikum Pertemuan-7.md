
#### Nama	: Vega Anggaresta
#### NIM    : 2041723013
#### Kelas	: TI-2C

## Laporan Tugas Praktikum Pertemuan-7 (Inheritence)

B. Pertanyaan  Percobaan 1
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
