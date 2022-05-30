package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {
    EditText edit_name, edit_phone, edit_mail;
    CheckBox chk_agree;
    Button btn_mail, btn_callcenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        edit_name = findViewById(R.id.edit_mail);
        edit_phone = findViewById(R.id.edit_phone);
        edit_mail = findViewById(R.id.edit_mail);
        chk_agree = findViewById(R.id.chk_agree);
        btn_mail = findViewById(R.id.btn_mail);
        btn_callcenter = findViewById(R.id.btn_callcenter);

        //콜센터에 전화 걸기
        btn_callcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:080-1234-5678"));
                startActivity(intent);
            }
        });

        btn_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_name.length() < 1) {
                    Toast.makeText(CallActivity.this, "이름을 입력하세요", Toast.LENGTH_SHORT).show();
                    edit_name.requestFocus();
                } else if (edit_phone.length() < 1) {
                    Toast.makeText(CallActivity.this, "전화번호를 입력하세요", Toast.LENGTH_SHORT).show();
                    edit_phone.requestFocus();
                } else if (edit_mail.length() < 1) {
                    Toast.makeText(CallActivity.this, "tkdeka sodyddmf dlqfurgktpdy", Toast.LENGTH_SHORT).show();
                    edit_mail.requestFocus();
                } else if (!chk_agree.isChecked()) { //! = not
                    Toast.makeText(CallActivity.this, "개인정보 제공방침에ㅔ 동의해주세요", Toast.LENGTH_SHORT).show();
                    chk_agree.requestFocus();
                } else {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setData(Uri.parse("smsto:010-0101-0101"));
                    intent.putExtra("sms_body", edit_mail.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}