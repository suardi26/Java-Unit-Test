## Software Testing

- <samp>Software Testing adalah salah satu disiplin ilmu dalam software engineering/rekayasa perangkat lunak.</samp>

- <samp>Tujuan utama dari software testing adalah untuk memastikan kualitas kode dan aplikasi kita baik, </samp>
  
  <samp>sehingga aplikasi kita dapat berjalan dengan baik dan dapat meminimalisasi terjadinya bug. </samp>

- <samp>Untuk Ilmu Software testing sangatlah luas, dan salah satu bagian terkecil dari software testing adalah 
 
  <samp>unit testing.</samp>
  
- <samp>Secara garis besasr Software Testing terbagi menjadi beberapa bagian, biasanya digambarkan pada Pyramid Test.
  
  <img src="https://github.com/suardi26/Java-Unit-Test/blob/main/TestPyramid.jpg" alt="Pyramid Test" width=50% height=50%/>
 
  
                                                                                                   
  - <samp>UI Test (End To End Test).</samp>
                                                                                                   
    <samp>UI Test adalah test yang dilakukan menyeluruh atau dari ujung depan ke ujung akhir, jadi testing ini </samp>
                                                                                                   
    <samp>membuat program yang bertindak sebagai user dan mengecek semua flow dari frontend, sampai ke backend hingga </samp>
                                                                                                   
    <samp>service-service yang terintegrasi dengan aplikasi kita. Karena testing ini melakukan test secara menyeluruh </samp>
                                                                                                   
    <samp>dan sistem harus berjalan secara bersamaan pada saat melakukan test untuk itu testing ini paling mahal biayanya.</samp>
       
    <img src="https://github.com/suardi26/Java-Unit-Test/blob/main/UI%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
  
  - <samp>Service Test (Integration Test).</samp>    
                                                                                                   
    <samp>Service Test adalah test yang biasanya dilakukan di back-end dan tidak melakukan test secara menyeluruh</samp>    
  
    <samp>namun mengerjakan testnya setiap bagian dari integrasi aplikasi dengan software pendukungnya misalnya database</samp>     
  
    <samp>atau service lain yang terhubung dengan aplikasi kita. Jadi service test mengerjakan satu persatu proses integrasi</samp>     
  
    <samp>software pendukung dengan aplikasi kita, hal ini mengakibatkan biayanya lebih murah dibanding dengan UI testing.</samp>
  
    <img src="https://github.com/suardi26/Java-Unit-Test/blob/main/Service%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
  
  - <samp>Unit Test.</samp>
  
    <samp>Pada saat membuat aplikasi, maka aplikasi tersebut terbagi dalam beberapa bagian yaitu layer atau class.</samp> 
  
    <samp>Unit test adalah melakukan testing ke kompenen terkecil dari aplikasi yaitu layer/class. Misalnya kita membuat</samp> 
  
    <samp>class Controller maka kita akan membuat unit test Controller atau kita membuat class Service maka kita akan membuat</samp>
  
    <samp>unit test Service. jadi fokus dari unit test yaitu melalukan test di bagian terckecil di dalam aplikasi kita,</samp> 
  
    <samp>sehingga biayanya paling murah dan untuk melakukan testing unit test terbilang mudah karena kita cukup menjalankan</samp> 
  
    <samp>unit test dari aplikasi kita tanpa harus menjalankan aplikasinya. Dan meskipun aplikasi connect ke database namun</samp> 
  
    <samp>ketika melakukan unit test tidak dibutuhkan ke database.</samp>
  
    <img src="https://github.com/suardi26/Java-Unit-Test/blob/main/Unit%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
