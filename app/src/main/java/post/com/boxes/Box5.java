package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Box5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box5);
        Intent intent = getIntent();
        float l = getIntent().getFloatExtra("LenEx",0);
        float w = getIntent().getFloatExtra("WidEx",0);
        float h = getIntent().getFloatExtra("HeiEx",0);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);
        TextView tv6 = findViewById(R.id.tv6);
        tv4.setText("Box5");
        tv5.setText("Dimention : " + l + "/" + w + "/ " + h + "cm");
        tv6.setText("price : 90");
    }
}
