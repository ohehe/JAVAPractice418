package com.ling.designpatterns.Facaed;/**
 * Created by Administrator on 2017/4/23.
 */

/**
 * @author Administrator
 * @create 2017-04-23 16:55
 */
public class Computer {
    private CPU cpu ;
    private Memory memory ;
    private Disk disk ;

    public Computer(){
        cpu = new CPU() ;
        memory = new Memory() ;
        disk = new Disk() ;
    }

    public void startUp(){
        System.out.println("start computer--");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        System.out.println("start computer finish");
    }

    public void shutDown(){
        System.out.println("close computer--");
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
        System.out.println("close computer finish");
    }
}
