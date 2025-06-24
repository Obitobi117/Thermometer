package thermo.schule.thermometer;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.devadvance.circularseekbar.CircularSeekBar;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CircularSeekBar circularSeekBar = findViewById(R.id.circularSeekBar);
        circularSeekBar.setProgress(13);
        circularSeekBar.setOnTouchListener((v, event) -> true); // blockiert manuelle Änderung


    }
}