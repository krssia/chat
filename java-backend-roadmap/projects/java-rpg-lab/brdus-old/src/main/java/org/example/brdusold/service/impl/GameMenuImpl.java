package org.example.brdusold.service.impl;

import org.example.brdusold.service.GameMenu;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class GameMenuImpl implements GameMenu {

    private Scanner scanner = new Scanner(System.in);
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            showMenu();
            String input = readLine();
            if (input != null) {
                consoleIO(input);
            } else {
                break;
            }
        }
        System.out.println("感谢游玩🙏");
    }

    @Override
    public void showMenu() {
        this.clear();
        System.out.println("======== RPG—LAB ========");
        System.out.println("1、开始新游戏");
        System.out.println("2、继续游戏");
        System.out.println("3、退出");
        System.out.println("请选择: ");
    }

    private void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private String readLine() {
        if (scanner.hasNextLine()) {
            return scanner.nextLine().trim();
        }
        return null;
    }

    private void consoleIO(String input) {
        switch (input) {
            case "1" :
                System.out.println("进入新游戏....");
                createPlayer();

                break;
            case "2" :
                System.out.println("读取存档...");
                break;
            case "3" :
                System.out.println("退出游戏..");
                break;
            default:
                System.out.println("请输入正确的选项：");
                break;
        }
    }

    private void createPlayer() {

    }

}
