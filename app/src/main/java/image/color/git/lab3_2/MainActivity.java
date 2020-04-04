package image.color.git.lab3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openOamk(View view) {
        Uri oamkUrl = Uri.parse("http://www.oamk.fi");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, oamkUrl);
        startActivity(webIntent);
    }

    public void callMe(View view) {
        Log.d("callMe", "the button was clicked");
        Uri number = Uri.parse("tel: +358 20 611 0200");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

//This function fully works, you just need to add 'http://www' in the begginning of the URL
    public void openWebsite(View view) {
        Log.d("click", "the button was clicked");
        EditText uriToOpen = findViewById(R.id.uriToOpen);
        Uri typedUri =  Uri.parse(uriToOpen.getText().toString());
        Log.d("click", typedUri + "");
        Intent openPageIntent = new Intent(Intent.ACTION_VIEW, typedUri);
        startActivity(openPageIntent);
    }

}
