package com.example.superfit;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class one_autorization_avtivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_autorization_screen);

        final int N = 9;
        final int N1 = 10;
        ArrayList<Integer> arrayList = new ArrayList<>(N);
        Random random = new Random();


        while (arrayList.size() < N) {

            int i = random.nextInt(N) + 1;
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }
        TextView textView = findViewById(R.id.textView2);
        int[] randomArray = arrayList.stream().mapToInt(i -> i).toArray();

        for (int c=0;c<randomArray.length-1;c++)
            textView.append(randomArray[c]+"\n");

        //
    }
}
