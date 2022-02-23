# 1 Version Control and Branch Management

## Resume

Dalam materi ini, mempelajari:

  1. Apa itu Git?
  2. Apa itu Version Control System?
  3. Repositori dan Branch

## Apa itu Git
<div style="text-align: justify">Git adalah sistem kendali versi terdistribusi, yang berarti semua codebase dan riwayat kode akan tersedia di komputer setiap developer untuk memudahkan pembuatan branch dan penggabungan. Git dikembangkan oleh Linus Torvalds pada tahun 2005, dan merupakan inti atau jantung GitHub. </div>

<br>

## Apa itu Version Control System?
<div style="text-align: justify"> Sistem kendali versi atau version control system adalah sistem yang mencatat perubahan yang dilakukan pada file sehingga semua riwayatnya akan terekam dan bisa dilihat kembali nanti. Saat kita membuat proyek baru, kita pasti melakukan pembaruan terhadap kodenya. Bahkan, setelah proyeknya online, kita tetap harus memperbarui versinya, memperbaiki bug, menambahkan fitur baru, dan lain sebagainya. </div>

<br>

## Repositori dan Branch
<div style="text-align: justify"> Repositori atau repo adalah direktori penyimpanan file proyek. Di sini, kita bisa menyimpan apa pun yang berkaitan dengan proyek yang sedang kita buat, misalnya file kode, gambar, atau audio. Repo sendiri bertempat di penyimpanan atau storage GitHub atau repositori lokal di komputer kita. 
<br><br>
Branch merupakan salinan dari repositori. Kita bisa menggunakan branch ketika akan melakukan suatu pengembangan atau development secara terpisah.Pekerjaan atau task yang kita kerjakan di branch tidak akan memengaruhi repositori pusat atau branch lainnya. Jika pengembangannya sudah selesai, kita bisa menggabungkan branch saat ini ke branch lainnya dah juga repositori pusat dengan menggunakan pull request.</div>
<br>

## Task

## 1. Membuat Repositori Baru
Pada task ini, kita akan membuat repositori  baru yang nanti akan digunakan untuk mengumpulkan semua tugas dari Alterra Academy.
![New](./screenshots/1_NewRepository.jpg)

<br>

## 2. Implementasi Branch Master, Development, featureA, featureB

Branch master tidak perlu kita buat karna sudah dibuatkan dari github. Pada branch master saya menambahkan folder praktikum dan screenshot dan juga file summary.md

![New](./screenshots/2_branchmaster.jpg)

Selanjutnya kita membuat branch dengan nama development, featureA dan featureB

![New](./screenshots/2_branchdevelopment,featureA,featureB.jpg)

<br>

## 3. Push, Pull, Stash, Merge
Disini saya mencoba push branch yang telah dibuat sebelumnya
![New](./screenshots/3_Push.jpg)

Berikutnya saya melakukan perubahan pada program.java dan melakukan pull request

![New](./screenshots/3_Pull.jpg)

Berikutnya saya mencoba melakukan git stash. Fitur stash ini berperan untuk menyimpan semua progress yang sudah kita lakukan sejak commit terakhir tanpa membuat sebuah commit untuk state itu sendiri.

![New](./screenshots/3_Stash.jpg)

Berikutnya saya mencoba merge branch master dengan branch development. Merge Berfungsi untuk meleburkan dua state dari dua branch.

![New](./screenshots/3_Merge.jpg)

## 4 & 5 Merge Conflict No Fast Forward

Jadi Merge Conflict terjadi jika terdapat perubahan pada line kode yang sama. Disini saya akan merge featureB dengan featureA 

![New](./screenshots/4dan5_MergeConflictNoFastForward(1).jpg)

Berikutnya pada text editor akan muncul perubahan seperti ini. Kita bisa memilih akan menggunakan yang mana

![New](./screenshots/4dan5_MergeConflictNoFastForward(2).jpg)

Setelah itu saya melakukan add dan commit ke repository
![New](./screenshots/4dan5_MergeConflictNoFastForward(3).jpg)