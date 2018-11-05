/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pollproject;

/**
 *
 * @author MJNeff18579
 */
public class PollTest {
    public static void main(String[] args) {
        PollDisplayPanel votingMachine = new PollDisplayPanel("Jithin", "Ben", "Chad");
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();
        System.out.println(votingMachine);
    }
}
