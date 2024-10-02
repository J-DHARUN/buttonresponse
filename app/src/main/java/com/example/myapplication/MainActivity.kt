package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private TextView textView2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = this.findViewById(R.id.textView1);

        this.textView2 = this.findViewById(R.id.textView2);
        Button buttonClickMe = this.findViewById(R.id.button_clickMe);Button
        buttonBack = this.findViewById(R.id.button_back);

        Intent intent = getIntent();

        String value1 = intent.getStringExtra("text1");
        String value2 = intent.getStringExtra("text2");
        textView1.setText(value1);
        this.textView2.setText(value2);

        buttonClickMe.setOnClickListener(v -> textView2.setText("You click button"));

        buttonClickMe.setOnLongClickListener(v -> {
        textView2.setText("You long click button");
        return true;
    });
        buttonBack.setOnClickListener(v -> {
        MainActivity.this.finish();
    });
    }
}
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
xmlns:app="http://schemas.android.com/apk/res-auto"
tools:context=".MainActivity">
<TextView android:id="@+id/textView1"
android:layout_width="0dp"
android:layout_height="51dp"
android:layout_marginStart="16dp"
android:layout_marginLeft="16dp"
android:layout_marginTop="54dp"
android:layout_marginEnd="16dp"
android:layout_marginRight="16dp"
android:gravity="center"
android:text="TextView"
android:textSize="22sp"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />
<TextView android:id="@+id/textView2"
android:layout_width="0dp"
android:layout_height="36dp"
android:layout_marginStart="16dp"
android:layout_marginLeft="16dp"
android:layout_marginTop="37dp"
android:layout_marginEnd="16dp"
android:layout_marginRight="16dp"
android:gravity="center"
android:text="TextView"
app:layout_constraintEnd_toEndOf="parent" app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/textView1" />
<Button
android:id="@+id/button_clickMe"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="36dp" android:text="Click
me" app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/textView2" />
<Button
android:id="@+id/button_back"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="22dp" android:text="Back"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/button_clickMe" />
</androidx.constraintlayout.widget.ConstraintLayout>
