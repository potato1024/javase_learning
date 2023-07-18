package com.itheima.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String, Integer> map = new HashMap<>();

    static {
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" joker");
        list.add(" JOKER");


        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("2", 15);
        map.put("joker", 50);
        map.put("JOKER", 100);

    }

    public PokerGame() {
        Collections.shuffle(list);
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i < 3) {
                lord.add(poker);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(poker);

            } else if (i % 3 == 1) {
                player2.add(poker);

            } else {
                player3.add(poker);
            }
        }

        sort(lord);
        sort(player1);
        sort(player2);
        sort(player3);
        lookPoker("底牌", lord);
        lookPoker("玩家", player1);
        lookPoker("下家", player2);
        lookPoker("上家", player3);

    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

    public void sort(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    public int getValue(String poker) {
        String number = poker.substring(1);
        if (map.containsKey(number)) {
            return map.get(number);
        } else {
            return Integer.parseInt(number);
        }

    }
}
