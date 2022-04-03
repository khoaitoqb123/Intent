package cntt61.a61133985.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity{
    private EditText Name, Pass, Mail;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText) findViewById(R.id.edtUserName);
        Pass = (EditText) findViewById(R.id.edtPass);
        Mail = (EditText) findViewById(R.id.edtEmail);
        btnXacNhan = (Button) findViewById(R.id.btnOK);

    }

    public void move_to_home(View a){
        String Username = Name.getText().toString().trim();
        String Password = Pass.getText().toString().trim();
        String Email = Mail.getText().toString().trim();
        if (TextUtils.isEmpty(Username) || TextUtils.isEmpty(Password) || TextUtils.isEmpty(Email))
        {
            Toast.makeText(LoginActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
        iQuiz.putExtra("Name", Username);
        startActivity(iQuiz);
    }
}
