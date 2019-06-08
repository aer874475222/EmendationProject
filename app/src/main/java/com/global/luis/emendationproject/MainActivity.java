package com.global.luis.emendationproject;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * 模拟投三枚硬币
     * 全部正面和全部反面概率皆为1/8
     * 1正2反和2正1反概率皆为3/8
     */
    public void tossThreeCoin(){

        int temp=rand.nextInt(8);
        switch (temp){
            case 0://全部正面
                break;
            case 7://全部反面
                break;
            case 1:
            case 2:
            case 3:
                //2正1反
                break;
            case 4:
            case 5:
            case 6:
               // 1正2反
                break;

        }
    }
}
