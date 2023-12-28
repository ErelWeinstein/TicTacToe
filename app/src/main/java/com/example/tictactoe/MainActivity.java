package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String turn;
    String[][] board;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void onNewGame()
    {
        board = new String[3][3];
        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                board[row][col] = new String();
            }
        }
        turn = "x";
        count = 0;
    }

    public void onBtnClicked(View view)
    {
        int id = view.getId();
        if (id == R.id.btn_00)
        {
            handleClick(0, 0, R.id.btn_00);
        }
        else if (id == R.id.btn_01)
        {
            handleClick(0, 1, R.id.btn_01);
        }
        else if (id == R.id.btn_02)
        {
            handleClick(0, 2, R.id.btn_02);
        }
        else if (id == R.id.btn_10)
        {
            handleClick(1, 0, R.id.btn_10);
        }
        else if (id == R.id.btn_12)
        {
            handleClick(1, 2, R.id.btn_12);
        }
        else if (id == R.id.btn_20)
        {
            handleClick(2, 0, R.id.btn_20);
        }
        else if (id == R.id.btn_21)
        {
            handleClick(2, 1, R.id.btn_21);
        }
        else if (id == R.id.btn_22)
        {
            handleClick(2, 2, R.id.btn_22);
        }
    }


    private void handleClick(int row, int col, int id)
    {
        if (board[row][col].equals(""))
        {
            board[row][col] = turn;
            Button btn = findViewById(id);
            btn.setText(turn);
            onTurnEnd();

        }
    }
}
