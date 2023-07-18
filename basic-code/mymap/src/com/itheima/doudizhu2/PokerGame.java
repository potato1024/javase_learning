package com.itheima.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer, String> map = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {

        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int i = 1;
        for (String n : number) {
            for (String c : color) {
                map.put(i, c + n);
                list.add(i);
                i++;
            }
        }
        map.put(i, "joker");
        list.add(i);
        i++;
        map.put(i, "JOKER");
        list.add(i);
    }

    public PokerGame() {
        Collections.shuffle(list);
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            Integer poker = list.get(i);
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

        lookPoker("底牌", lord);
        lookPoker("玩家", player1);
        lookPoker("下家", player2);
        lookPoker("上家", player3);

    }

    public void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name + ": ");
        for (Integer poker : list) {
            System.out.print(map.get(poker) + " ");
        }
        System.out.println();
    }

}
