package cntt61.a61133985.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
public class HomeActivity extends AppCompatActivity {

    private TextView tvName;
    private Button btnQuiz1, btnQuiz2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvName = (TextView) findViewById(R.id.tvUserName);
        btnQuiz1 = (Button) findViewById(R.id.btnQuiz1);
        btnQuiz2 = (Button) findViewById(R.id.btnQuiz2);

        Intent i = getIntent();
        String Username = i.getStringExtra("Name");
        tvName.setText(Username);

        imageView = (ImageView) findViewById(R.id.img);
        imageView.setImageResource(R.drawable.anh);
    }

    public void move_to_main(View view) {
        Intent iQuiz1 = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(iQuiz1);
    }

    public void move_to_login2(View view) {
        Intent iQuiz2 = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(iQuiz2);
    }
}