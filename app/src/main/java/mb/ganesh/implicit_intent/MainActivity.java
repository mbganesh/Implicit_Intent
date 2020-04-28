package mb.ganesh.implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button ;
    EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);
        editText = (EditText) findViewById(R.id.editTextId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String goTOURL=editText.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse(goTOURL));
                startActivity(i);

            }
        });


    }

}
