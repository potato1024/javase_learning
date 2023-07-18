package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();

    static {
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("joker");
        list.add("JOKER");
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
}
