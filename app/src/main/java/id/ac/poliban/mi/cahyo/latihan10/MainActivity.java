package id.ac.poliban.mi.cahyo.latihan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referensi view ke object
        Button btPhone = findViewById(R.id.btPhone);
        Button btEmail = findViewById(R.id.btEmail);
        Button btWebsite = findViewById(R.id.btWebsite);
        Button btGeo = findViewById(R.id.btGeo);

        //event handling
        btPhone.setOnClickListener(view -> {
            Uri uri = Uri.parse("tel: 085252881128");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });

        btEmail.setOnClickListener(view -> {
            Uri uri = Uri.parse("mailto: cahyopkr@gmail.com");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });

        btWebsite.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/cahyo098") )));
        btGeo.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.7113399, -74.0263469") )));


    }
}
