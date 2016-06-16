package com.jason9075.soohoobooktechtalk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jason9075.soohoobooktechtalk.exception.WrongWearingException;
import com.jason9075.soohoobooktechtalk.model.CalculatorMachine;
import com.jason9075.soohoobooktechtalk.model.MyCharacter;
import com.jason9075.soohoobooktechtalk.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Item 1 */
        Person person = new Person("John", 20);

        /* Item 2 */
        MyCharacter character = null;
        try {
            character = new MyCharacter.Builder("Merry")
                    .wearHead("鴨舌帽")
                    .wearBody("潮T")
//                    .wearDress("洋裝")
                    .wearPants("牛仔褲")
                    .build();
        } catch (WrongWearingException e) {
            Log.e("WrongWearingException", e.getMessage());
        }

        if (character != null)
            System.out.println(">>> Item 2:" + character.toString());


        /* Item 49 */
        int preIntA = 20;
        int preIntB = 20;

        Integer boxIntA = new Integer(20);
        Integer boxIntB = new Integer(20);

        System.out.println(">>> preIntA:" + preIntA + ", preIntB:" + preIntB);
        System.out.println(">>> preEqual? :" + (preIntA == preIntB));

        System.out.println(">>> boxIntA:" + boxIntA + ", boxIntB:" + boxIntB);
        System.out.println(">>> boxEqual? :" + (boxIntA == boxIntB));

        long startTime = System.currentTimeMillis();

        // unboxing start
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE /100 ; i++) {
            sum += i;
        }
        // unboxing end

        long difference = System.currentTimeMillis() - startTime;
        System.out.println(">>> Item 49: sum = " + sum + ", calculate time(sec):" + difference / 1000.0);

        /* Item 41 */
        CalculatorMachine calculator = new CalculatorMachine();
        System.out.println(">>> Item 41:" + calculator.add(1, 5));
        System.out.println(">>> Item 41:" + calculator.add(1, 5, 8));
        System.out.println(">>> Item 41:" + calculator.add(1.1, 4.3));


        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 51; i <= 56; i++) {
            set.add(i); // [51, 52, 53, 54, 55]
            list.add(i); // [51, 52, 53, 54, 55]
        }

        set.remove(52);
        list.remove((Integer)52);

        System.out.println(">>> Item 41: set = " + set.toString());
        System.out.println(">>> Item 41: list = " + list.toString());
    }
}
