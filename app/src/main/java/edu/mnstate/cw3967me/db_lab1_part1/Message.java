package edu.mnstate.cw3967me.db_lab1_part1;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by marikonoguchi on 10/26/16.
 */
public class Message {
    public static void message(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
