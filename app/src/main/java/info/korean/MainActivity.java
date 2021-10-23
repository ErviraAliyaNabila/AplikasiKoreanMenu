package info.korean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, hargaMakanan, infoMakanan, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190115/jajangmyeon-13-8964557cc91df6bae79b012c47bb5b62.jpg");
        namaMakanan.add("Jjajangmyeon");
        hargaMakanan.add("Rp. 25.000");
        infoMakanan.add("Mie dengan saus kacang hitam ini merupakan hidangan Cina-Korea yang paling digemari anak-anak dan orang dewasa. Ada sesuatu dari rasanya yang membuat anak-anak selalu menginginkannya dan menjadi makanan pilihan mereka. Biasanya, menu ini dihidangkan bersama dengan potongan daging dan bawang untuk memperkaya rasanya. Kamu pun akan menemukan 'danmuji' atau acar lobak kuning tersaji pada bagian atasnya. Jjajangmyeon juga cocok disantap oleh kamu yang nggak suka hidangan pedas!");

        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190115/dsc-5089-fb27df5027971f5a5b02057d583d6514.jpg");
        namaMakanan.add("Kimchi Jjigae");
        hargaMakanan.add("Rp. 20.000");
        infoMakanan.add("Kimchi Jjigae atau sup kimchi ini dianggap sebagai menu klasik Korea Selatan. Ada kimchi, daging, tahu, dan sayuran lainnya yang berkumpul menjadi satu di dalam sup sehingga membuat menu ini jadi favorit. Kimchi Jjiage pun umumnya disantap dengan semangkok nasi putih dan hidangan samping lainnya. Sup ini juga jadi hidangan yang paling dicari ketika cuaca dingin. Rasanya pun sedikit lebih pedas. Jadi bagi kamu yang nggak suka makanan pedas, siap-siap berkeringat ketika menyantapnya.");

        fotoMakanan.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTftxQEQ4aUIxaPN3Ibju-WhETWIbhqvMHTEQ&usqp=CAU");
        namaMakanan.add("Tangsuyuk");
        hargaMakanan.add("Rp. 30.000");
        infoMakanan.add("Tangsuyuk adalah hidangan khas Cina-Korea Selatan. Menu ini berupa potongan daging yang digoreng dalam rendaman minyak, kemudian ditumis dengan saus asam-manis bersama dengan potongan sayuran seperti bawang dan wortel. Hidangan ini umumnya dimakan bersama dengan Jjajangmyeon.");

        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190115/untitled-1-737670dced50b88b618a6e2035cc102a.jpg");
        namaMakanan.add("Tteokbokki");
        hargaMakanan.add("Rp. 15.000");
        infoMakanan.add("Tteokbokki adalah potongan kue besar yang dimasak dengan saus cabai pedas. Beberapa ada yang menghidangkannya dengan irisan bawang, kue ikan (odeng), dan telur rebus. Rasanya yang pedas ditambah harganya yang terjangkau membuat Tteokbokki jadi nagih! Biasanya tersaji dalam warna kemerahan dan pedas, namun ada juga yang menyediakan Tteokbokki dalam warna dan rasa berbeda. Ada rasa saus kacang hitam, saus alfredo, atau rasa rose. ");

        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190115/koreanchicken-a03a1723df50b08b35a3bf5267e387db.jpg");
        namaMakanan.add("Fried Chicken");
        hargaMakanan.add("Rp. 10.000");
        infoMakanan.add("Fried Chicken atau ayam goreng tepung di Korea Selatan berbeda dengan yang biasa kamu santap di Indonesia. Ayam goreng tepung di negara ini biasanya terjadi dalam baluran saus yang pedas atau kurang pedas. Ada juga yang memiliki rasa bawang atau honey butter yang gurih-manis.");

        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190115/bibimbap-bowl-c1d20795a86bd76a44e3dfa13f43d6cb.jpg");
        namaMakanan.add("Naengmyeon");
        hargaMakanan.add("Rp. 40.000");
        infoMakanan.add("Naengmyeon, menu mie dingin yang terbuat dari mie soba dan disajikan dalam kuah kaldu dingin. Sebagian orang menyajikannya bersama dengan potongan lobak, buah pir, telur rebus, daging, dan tambahan cuka atau mustard. Hidangan ini biasanya jadi favorit di musim panas karena rasanya yang lezat dan kuah dinginnya yang segar.");

        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190115/spicy-naengmyeon-fba718bafb59c4716ba87253ddc22d4f.jpg");
        namaMakanan.add("Kimchi Bokkeumbap");
        hargaMakanan.add("Rp. 25.000");
        infoMakanan.add("Apapun yang dicampurkan dengan kimchi rasanya pasti lezat, termasuk salah satunya adalah Kimchi Bokkeumbap atau nasi goreng kimchi. Hanya perlu menumis kimchi dan nasi bersama, menambahkan bumbu untuk membuat rasanya jadi lebih pedas atau gurih sesuai selera, dan memasukkan potongan daging atau telur untuk melengkapi hidangan. Tambahkan potongan keju dan biarkan meleleh.");
        prosesRecyclerViewAdapter();
    }
}