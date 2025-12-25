1. Apa yang dimaksud dengan fungsi rekursif?
fungsi rekursif adalah sebuah fungsi yang memanggil dirinya sendiri di dalam tubuh fungsi tersebut untuk menyelesaikan suatu masalah.

2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi
faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan
fungsi rekursif dan fungsi iteratif!

1. Alur Rekursif 
Fungsi dipanggil terus menerus ke bawah . Belum ada perhitungan, hanya menumpuk tugas.Saat sampai di n=0, fungsi stop dan memberikan nilai 1.Fase Naik (Menghitung): Nilai dibawa kembali ke atas satu per satu sambil dikalikan dengan angka sebelumnya  hingga kembali ke angka 5.

2. Alur Iteratif  

MULAI:  faktor = 1, i = 1.

VALIDASI KONDISI: Apakah 1 >= 5? TIDAK.

SELESAI: Program langsung berhenti total tanpa melakukan perkalian apa pun.

OUTPUT: Mengembalikan nilai awal (1).

PERTANYAAN PERCOBAAN 2
1.Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan,
pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat()
secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan
dijalankan!

Pemanggilan fungsi dijalankan berulang kali selama y > 0 dan akan berhenti tepat saat y == 0.

PERTANYAAN PERCOBAAN 3

1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case”
dan “recursion call”!
BASE CASE :
```
if (tahun==0){
    return saldo;
    }
```
RECURSION CALL
```hitunglaba(saldo, tahun-1)```

2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika
diberikan nilai hitungLaba(100000,3)

1. Fase Ekspansi

 Program memanggil fungsi secara bertumpuk dengan mengurangi tahun sampai mencapai 0.

hitungLaba(..., 3) memanggil tahun 2
hitungLaba(..., 2) memanggil tahun 1
hitungLaba(..., 1) memanggil tahun 0 (program berhenti)

2. Fase Substitusi
Program menghitung mundur dari hasil paling bawah ke atas (dikali 1.11 setiap langkah)

tahun 0 : mengembalikan 100.000
tahun 1 : 100.000 x 1.11= 111.000
tahun 2 : 111.000 x 1.11= 123.210
tahun 3 : 123.210 x 1.11= 136.763 
