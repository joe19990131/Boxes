package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Box3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box3);
        Intent intent = getIntent();
        float l = getIntent().getFloatExtra("LenEx",0);
        float w = getIntent().getFloatExtra("WidEx",0);
        float h = getIntent().getFloatExtra("HeiEx",0);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        tv1.setText("Box3");
        tv2.setText("Dimention : " + l + "/" + w + "/ " + h + "cm");
        tv3.setText("price : 65");
    }
}
