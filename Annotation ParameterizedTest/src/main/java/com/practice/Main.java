package com.practice;

/**
    - Sebelumnya kita sudah tau jika ingin menambahkan paramter di function unit test, maka kita perlu membuat ParameterResolver,
      sehingga secara otomatis di-inject sama parameter resolvernya.
    - Namun jika terlalu banyak membuat ParameterResolver juga agak menyulitkan kita.
    - JUnit memiliki fitur yang bernama @ParameterizedTest, dimana jenis unit test ini memang khusus dibuat agar dapat menerima
      paramter.
    - Namun yang perlukan dilakukan adalah dengan mengganti @Test menjadi @ParamterizedTest.
        - jadi jenis unit test :
            - @Test digunakan untuk  menjalankan method unit test sekali.
            - @RepeatedTest digunakan untuk menjalankan method unit test berkali-kali sesuai dengan jumlah yang ditentukan.
            - @ParameterizedTest digunakan untuk menjalankan method yang dapat menerima paramter.

    - @ParameterizedTest mendukung beberapa sumber parameter, yaitu :
        - @ValueSource, untuk sumber Number, Char, Boolean, dan String.
          misalnnya :
             @ValueSource(ints = {0, 1}) Untuk value score yang int maka dapat menggunakan 'ints' dengan value array
             dan pada @ParameterizedTest dapat dipanggil menggunakan '{0}' untuk mengetahui test keberapa sesuai
             dengan valuenya serta harus disesuaikan dengan parameter di method unit testnya ketika int parameternya maka
             @ValueSource juga harus int.

        - @EnumSource, untuk sumber berupa Enum.
        - @MethodSource, untuk sumber data dari static method.
        - @CsvSource, untuk sumber data yang berasal dari baris CSV.
        - @CsvFileSource, untuk sumber data yang berasal dari file CSV.
        - @ArgumentSource, untuk data dari class ArgumentsProvider, artinya kita membuat sendiri class yang implementasi
          interface ArgumentsProvider.
        - Dan Masih banyak sekali opsi annotation yang digunakan untuk sumber paramter.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
