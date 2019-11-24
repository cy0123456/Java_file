package com.company.Example17;

import java.util.Scanner;

public class ArrayTest08 {
    public static void main(String[] args) {
        //入住服务和退房服务
        Hotel xd = new Hotel();
        while (true){
            System.out.println("欢迎使用酒店管理系统，酒店列表如下：");
            showHotel(xd);
            Scanner s = new Scanner(System.in);
            System.out.print("您输入了：");
            String userInput = s.next();
            if (userInput.equals("入住")){
                input(xd);
            }else if (userInput.equals("退房")){
                output(xd);
            }
            else {
                System.out.println("输入类型错误，请输入：入住 or 退房");
            }
        }
    }
    private static void input(Hotel xd){
        Scanner k = new Scanner(System.in);
        System.out.print("请输入您需要居住的房间楼层：");
        int rows = k.nextInt();
        System.out.print("请输入您需要居住的房间号码：");
        int cols = k.nextInt();
        if (rows > 5 || cols >10){
            System.out.println("您输入有误，请输入正确楼层及房间号码");
            return;
        }
        if (xd.rooms[rows-1][cols-1].isUse){
            System.out.println("您选择的房间已满，请重新选择");
            return;
        }else{
            System.out.print("您选择的房间为空，是否入住：");
        }
        String result = k.next();
        if (result.equals("是")) {
            xd.rooms[rows-1][cols-1].isUse = true;
            System.out.println("您选择的房间类型为：" + xd.rooms[rows-1][cols-1].type);
            System.out.println("您选择的房间号为：" + xd.rooms[rows-1][cols-1].no);
            System.out.println("您已经订房成功");
        }else{

        }
    }
    private static void output(Hotel xd){
        Scanner k = new Scanner(System.in);
        System.out.print("请输入您需要退房的房间楼层：");
        int rows = k.nextInt();
        System.out.print("请输入您需要退房的房间号码：");
        int cols = k.nextInt();
        xd.rooms[rows-1][cols-1].isUse = false;
        System.out.println("您已退房成功");
    }

    private static void showHotel(Hotel zx){
        for (int i = 0;i< zx.rooms.length;i++){
            for (int j = 0;j <zx.rooms[i].length;j++){
                if (zx.rooms[i][j].isUse){
                    String k = "占用";
                    System.out.print(zx.rooms[i][j].no + " " + zx.rooms[i][j].type + " " + k +"   ");
                }else {
                    String k = "空闲";
                    System.out.print(zx.rooms[i][j].no + " " + zx.rooms[i][j].type + " " + k +"   ");
                }
            }
            System.out.println("");
        }

    }
}
class Room{
    String no;   //房间号从1：50
    String type;//豪华间，双人间，单人间

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    public Room() {
    }

    boolean isUse; //true 占用 false 空闲

    public Room(String no, String type, boolean isUse) {
        this.no = no;
        this.type = type;
        this.isUse = isUse;
    }
}
class Hotel{
    //规定 酒店为5层，每层10个房间
    //1，2层是标准间
    //3，4层是双人间
    //5层是豪华间
    Room[][] rooms;
    Hotel(){
        this(5,10);
    }

    private Hotel(int rows, int cols) {
        rooms = new Room[rows][cols];
        for (int i=0;i< rooms.length;i++){
            for (int j = 0;j< rooms[i].length;j++){
                rooms[i][j] = new Room();
                if (i <= 1){
                    rooms[i][j].type = "标准间";
                }else if (i <= 3){
                    rooms[i][j].type = "双人间";
                }else {
                    rooms[i][j].type = "豪华间";
                }
                rooms[i][j].no = "No" + (i+1) + "." + (j+1) ;
                rooms[i][j].isUse = false;
            }
        }
    }

}