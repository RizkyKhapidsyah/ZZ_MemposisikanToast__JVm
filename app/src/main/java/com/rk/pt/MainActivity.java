package com.rk.pt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast PesanToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void YangTerjadiKetikaTombolDipijit(View Tampil) {
        if (Tampil.getId() == R.id.B_Toast_Simple) {
            Toast.makeText(this, "Posisi Toast: Default", Toast.LENGTH_SHORT).show();
        } else {
            switch (Tampil.getId()) {
                case R.id.B_Toast_Atas:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Atas", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.TOP, 0, 0);
                    break;
                case R.id.B_Toast_Bawah:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Bawah", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.BOTTOM, 0, 0);
                    break;
                case R.id.B_Toast_Tengah:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Tengah", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.CENTER, 0, 0);
                    break;
                case R.id.B_Toast_Kiri:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Kiri", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.LEFT, 0, 0);
                    break;
                case R.id.B_Toast_Kanan:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Kanan", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.RIGHT, 0, 0);
                    break;
                case R.id.B_Toast_AtasKiri:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Atas Kiri", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                    break;
                case R.id.B_Toast_AtasKanan:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Atas Kanan", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);
                    break;
                case R.id.B_Toast_BawahKiri:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Bawah Kiri", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 0);
                    break;
                case R.id.B_Toast_BawahKanan:
                    PesanToast = Toast.makeText(this, "Posisi Toast: Bawah Kanan", Toast.LENGTH_SHORT);
                    PesanToast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    break;
            }
            PesanToast.show();
        }
    }

}
