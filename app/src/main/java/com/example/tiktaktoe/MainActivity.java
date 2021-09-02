package com.example.tiktaktoe;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView imgbtn1,imgbtn2,imgbtn3,imgbtn4,imgbtn5,imgbtn6,imgbtn7,imgbtn8,imgbtn9;
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,xCount=0,oCount=0,i=0;
    private  String startGame = "X";
    private TextView scoreX,score0;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("MASSAGE").setMessage("Don't click 'X' or '0' twice.\nIf by mistake clicked press 'RESET'").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();



        imgbtn1 = findViewById(R.id.imgbtn1);
        imgbtn2 = findViewById(R.id.imgbtn2);
        imgbtn3 = findViewById(R.id.imgbtn3);
        imgbtn4 = findViewById(R.id.imgbtn4);
        imgbtn5 = findViewById(R.id.imgbtn5);
        imgbtn6 = findViewById(R.id.imgbtn6);
        imgbtn7 = findViewById(R.id.imgbtn7);
        imgbtn8 = findViewById(R.id.imgbtn8);
        imgbtn9 = findViewById(R.id.imgbtn9);

        score0 = findViewById(R.id.score_o);
        scoreX = findViewById(R.id.score_x);
        reset = findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbtn1.setImageDrawable(null);
                imgbtn2.setImageDrawable(null);
                imgbtn3.setImageDrawable(null);
                imgbtn4.setImageDrawable(null);
                imgbtn5.setImageDrawable(null);
                imgbtn6.setImageDrawable(null);
                imgbtn7.setImageDrawable(null);
                imgbtn8.setImageDrawable(null);
                imgbtn9.setImageDrawable(null);

                resetValue();

                xCount=0;
                oCount=0;
                scoreX.setText("Score X = "+String.valueOf(xCount));
                score0.setText("Score 0 ="+" "+String.valueOf(oCount));

            }

        });





        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn1.setImageResource(R.drawable.cross);
                    b1=1;
                }
                else
                {
                    imgbtn1.setImageResource(R.drawable.circle);
                    b1=0;
                }
                i++;
                choosePlayer();
                winingGame();

            }


        });

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn2.setImageResource(R.drawable.cross);
                    b2=1;
                }
                else
                {
                    imgbtn2.setImageResource(R.drawable.circle);
                    b2=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn3.setImageResource(R.drawable.cross);
                    b3=1;
                }
                else
                {
                    imgbtn3.setImageResource(R.drawable.circle);
                    b3=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn4.setImageResource(R.drawable.cross);
                    b4=1;
                }
                else
                {
                    imgbtn4.setImageResource(R.drawable.circle);
                    b4=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn5.setImageResource(R.drawable.cross);
                    b5=1;
                }
                else
                {
                    imgbtn5.setImageResource(R.drawable.circle);
                    b5=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
        imgbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn6.setImageResource(R.drawable.cross);
                    b6=1;
                }
                else
                {
                    imgbtn6.setImageResource(R.drawable.circle);
                    b6=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
        imgbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn7.setImageResource(R.drawable.cross);
                    b7=1;
                }
                else
                {
                    imgbtn7.setImageResource(R.drawable.circle);
                    b7=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
        imgbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn8.setImageResource(R.drawable.cross);
                    b8=1;
                }
                else
                {
                    imgbtn8.setImageResource(R.drawable.circle);
                    b8=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
        imgbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X"))
                {
                    imgbtn9.setImageResource(R.drawable.cross);
                    b9=1;
                }
                else
                {
                    imgbtn9.setImageResource(R.drawable.circle);
                    b9=0;
                }
                i++;
                choosePlayer();
                winingGame();
            }
        });
    }

    private void resetValue() {
        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        i=0;
    }

    private void winingGame() {

        if((b1==1) && (b2==1) &&(b3==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b4==1) && (b5==1) &&(b6==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b7==1) && (b8==1) &&(b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b1==1) && (b4==1) &&(b7==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b2==1) && (b5==1) &&(b8==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b3==1) && (b6==1) &&(b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b1==1) && (b5==1) &&(b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b3==1) && (b5==1) &&(b7==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X ="+String.valueOf(xCount));

        }
        else if((b1==0) && (b2==0) &&(b3==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));
        }
        else if((b4==0) && (b5==0) &&(b6==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));
        }
        else if((b7==0) && (b8==0) &&(b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));
        }
        else if((b1==0) && (b4==0) &&(b7==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));
        }
        else if((b2==0) && (b5==0) &&(b8==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));
        }
        else if((b3==0) && (b6==0) &&(b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));
        }
        else if((b1==0) && (b5==0) &&(b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));
        }
        else if((b3==0) && (b5==0) &&(b7==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("player 0 wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    imgbtn1.setImageDrawable(null);
                    imgbtn2.setImageDrawable(null);
                    imgbtn3.setImageDrawable(null);
                    imgbtn4.setImageDrawable(null);
                    imgbtn5.setImageDrawable(null);
                    imgbtn6.setImageDrawable(null);
                    imgbtn7.setImageDrawable(null);
                    imgbtn8.setImageDrawable(null);
                    imgbtn9.setImageDrawable(null);

                    resetValue();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score0.setText("Score O ="+String.valueOf(oCount));

        }
        else
        {
            if (i==9)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No one wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        imgbtn1.setImageDrawable(null);
                        imgbtn2.setImageDrawable(null);
                        imgbtn3.setImageDrawable(null);
                        imgbtn4.setImageDrawable(null);
                        imgbtn5.setImageDrawable(null);
                        imgbtn6.setImageDrawable(null);
                        imgbtn7.setImageDrawable(null);
                        imgbtn8.setImageDrawable(null);
                        imgbtn9.setImageDrawable(null);

                        resetValue();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
    }

    private void choosePlayer() {
        if(startGame.equals("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }

    }
}