package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edlength;
EditText edwidth;
EditText edheight;
float l;
float w;
float h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findViews() {
    edlength = findViewById(R.id.ed_length);
    edwidth = findViewById(R.id.ed_width);
    edheight = findViewById(R.id.ed_height);
    }
    public void check(View view) {
    findViews();
    String length = edlength.getText().toString();
    String width = edwidth.getText().toString();
    String  height = edheight.getText().toString();
    l = Float.parseFloat(length);
    w = Float.parseFloat(width);
    h = Float.parseFloat(height);
    if(l<=23 && w<=27.5 && h<=13){
        Intent intent = new Intent(this,Box3.class);
        intent.putExtra("LenEx",l);
        intent.putExtra("WidEx",w);
        intent.putExtra("HeiEx",h);
        startActivity(intent);
    }else {
        Intent intent = new Intent(this,Box5.class);
        intent.putExtra("LenEx",l);
        intent.putExtra("WidEx",w);
        intent.putExtra("HeiEx",h);
        startActivity(intent);
    }
    }
}
