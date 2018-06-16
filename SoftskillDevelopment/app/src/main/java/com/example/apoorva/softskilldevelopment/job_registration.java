package com.example.apoorva.softskilldevelopment;

        import android.app.ProgressDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;



public class job_registration extends AppCompatActivity {

    EditText editPhone, editName, editPassword;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobregistration);

        editPhone = findViewById(R.id.editPhone);
        editName = findViewById(R.id.editName);
        editPassword = findViewById(R.id.editPassword);

        btnSignUp = findViewById(R.id.btnSignUp);


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ProgressDialog progressDialog = new ProgressDialog(job_registration.this);
                progressDialog.setMessage("Please Wait !");
                progressDialog.show();
                final DatabaseReference duser = FirebaseDatabase.getInstance().getReference("User");

                duser.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if(dataSnapshot.child(editPhone.getText().toString()).exists()){
                            progressDialog.dismiss();
                            Toast.makeText(job_registration.this, "User already registered!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            progressDialog.dismiss();
                            User user = new User(editName.getText().toString(),editPassword.getText().toString());
                            duser.child(editPhone.getText().toString()).setValue(user);
                            Toast.makeText(job_registration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

    }
}
