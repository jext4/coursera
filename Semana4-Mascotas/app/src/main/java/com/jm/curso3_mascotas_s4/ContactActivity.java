package com.jm.curso3_mascotas_s4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import org.apache.commons.lang3.StringUtils;

import com.jm.curso3_mascotas_s4.R;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar myActionbar;
    private EditText tiEmail;
    private EditText tiSubject;
    private EditText tiMessage;
    private Button btnSendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        myActionbar = (Toolbar) findViewById(R.id.actionbar);
        setSupportActionBar(myActionbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tiEmail = (EditText) findViewById(R.id.etMail);
        tiSubject = (EditText) findViewById(R.id.etSubject);
        tiMessage = (EditText) findViewById(R.id.etMessage);
        btnSendEmail = (Button) findViewById(R.id.btnSendEmail);
        btnSendEmail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.btnSendEmail:
                sendEmail();
                break;
        }
    }

    private void sendEmail() {
        String toEmail = Constants.email;
        String subject = tiSubject.getText().toString();
        String message = this.formatMessage();
        JavaMailAPI mail = new JavaMailAPI(this, toEmail, subject, message);
        mail.execute();
    }

    private String formatMessage(){
        String contactEmail = tiEmail.getText().toString();
        String message = tiMessage.getText().toString();
        return StringUtils.join(contactEmail, "\n", message);
    }

}
