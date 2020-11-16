
#### Nama	: Vega Anggaresta
#### NIM    : 2041723013
#### Kelas	: TI-2C

## Laporan Pertemuan 12
 
4.1 Output Percobaan 1 - Bentuk Dasar Polimorfisme

<img src="image/Prak1_Output.png">

4.2 Pertanyaan
1. Class apa sajakah yang merupakan turunan dari class Employee?
> Jawab: Permanent Employee dan Internship Employee
2. Class apa sajakah yang implements ke interface Payable?
> Jawab: Permanent Employee dan ElectricityBill
3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi
dengan objek pEmp (merupakan objek dari class PermanentEmployee)
dan objek iEmp (merupakan objek dari class
InternshipEmploye) ?
> Karena objek e, merupakan instansiasi dari klass employee, sehingga pEmp dan iEmp yang merupakan klas turunan dari klass employee dapat mengisi objek e. 
4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi
dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class
ElectricityBill) ?
> Karena objek p, merupakan instansiasi dari klass interface Payable, sehingga pEmp dan eBill yang mengimplementasikan class Payable dapat mengisi objek p tersebut.
5. Coba tambahkan sintaks:
p = iEmp;
e = eBill;
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang
menyebabkan error?
> Karena pada class internshipEmployee tidak mengimplementasikan kelas interface Payable dan pada kelas employee tidak ada berkesinambungan dengan kelas ElectricityBill

6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme! 
> 

5.1 Output Percobaan 2 - Virtual method invocation
<img src="image/Prak1_Output.png">

5.2 Pertanyaan
1. Perhatikan class Tester2 di atas, mengapa pemanggilan
e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
> 
2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai
pemanggilan method virtual (virtual method invication), sedangkan
pEmp.getEmployeeInfo() tidak?
> 
3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa
disebut virtual?
> 

6.1 Output Percobaan 3 - Heterogeneous Collection
<img src="image/Prak1_Output.png">

6.2 Pertanyaan
1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek iEmp (objek dari
InternshipEmployee) ?
> 
2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek
dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek eBill (objek dari
ElectricityBilling) ?
> 
3. Perhatikan baris ke-10, mengapa terjadi error?
> 

7.1 Output Percobaan 4 - Argumen Polimorfisme, indtanceof, dan casting objek
<img src="image/Prak4-Output.png">

7.2 Pertanyaan
1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa
pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner
memiliki argument/parameter bertipe Payable? Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?
> 
2. Jadi apakah tujuan membuat argument bertipe Payable pada method
pay() yang ada di dalam class Owner?
> 
3. Coba pada baris terakhir method main() yang ada di dalam class
Tester4 ditambahkan perintah ow.pay(iEmp); Mengapa terjadi error?
> 
4. Perhatikan class Owner, diperlukan untuk apakah sintaks p
instanceof ElectricityBill pada baris ke-6 ?
>
5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek
disana (ElectricityBill eb = (ElectricityBill) p)
diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke
dalam objek eb yang bertipe ElectricityBill ?
>

-8. Tugas
> <img src="image/T-Output.png">

a. Class Zombie
> <img src="image/T-Zombie.png">

b. Class WalkingZombie
> <img src="image/T-WalkingZombie.png">

c. Class JumpingZombie
> <img src="image/T-JumpingZombie1.png">

d. Class Interface Destroyable
> <img src="image/T-Destroyable.png">

e. Class Barrier
> <img src="image/T-Barrier.png">

f. Class Plant
> <img src="image/T-Plant.png">
